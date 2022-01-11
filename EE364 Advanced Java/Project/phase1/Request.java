package carFactory;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Request {

    private ArrayList<Computer> computers = new ArrayList<>();
    private int selectedCost;
    private int selectedTime;
    private String day;
    private String hour;
    private String minute;
    private int[] computerSumMaterials = new int[9];
    private int[] totalNumberOfEmployees = new int[3];
    private Factory takenFactory;
    private String takenFactoryProvidedCost;
    private Boolean requestComplete = false;
    private String takenFactoryProvidedTime;
    private int takenFactoryIndex;
    private String dateRequested;

    public Request(LocalDateTime whenRequested, int day, int hour, int minute, int size) {
        //give a special time for the request
        if(day < 10)
            this.day = "0" + String.valueOf(day);
        else
            this.day = String.valueOf(day);
        if(hour < 10)
            this.hour = "0" + String.valueOf(hour);
        else
            this.hour = String.valueOf(hour);
        if(minute < 10)
            this.minute = "0" + String.valueOf(minute);
        else
            this.minute = String.valueOf(minute);

        // get real time date
        dateRequested = setDate(whenRequested, day, hour, minute);

        //generate #computers
        for (int i = 0; i < size; i++) {

            // select a random computer from enum
            Computers[] comp = Computers.values();
            Random random = new Random();
            int n = random.nextInt(comp.length);
            // get selected computer information
            String[] info = getInfoArr(comp[n]);
            int[] materials = getMatsArr(comp[n]);
            int[] emplys = getEmplysArr(comp[n]);

            Computer computer = new Computer(info, materials, emplys);
            computers.add(computer);
        }
        selectedTime = getRandom(30, 5, computers.size());
    }

    // converts simulation time into real time
    private String setDate(LocalDateTime simulationDate, int day, int hour, int minute) {
        simulationDate = simulationDate.plusDays(day);
        simulationDate = simulationDate.plusHours(hour);
        simulationDate = simulationDate.plusMinutes(minute);
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return simulationDate.format(myFormat);
    }

    public int[] getEmplysArr(Computers vals) {
        int[] arr = new int[3];
        arr[0] = vals.getWorkers();
        arr[1] = vals.getTechnicians();
        arr[2] = vals.getEngineers();
        return arr;
    }

    public String[] getInfoArr(Computers vals) {
        String[] arr = new String[3];
        arr[0] = vals.getCompany();
        arr[1] = vals.getType();
        arr[2] = vals.getQuality();
        return arr;
    }

    public int[] getMatsArr(Computers vals) {
        int[] arr = new int[9];
        arr[0] = vals.getMass1();
        arr[1] = vals.getMass2();
        arr[2] = vals.getMass3();
        arr[3] = vals.getMass4();
        arr[4] = vals.getMass5();
        arr[5] = vals.getMass6();
        arr[6] = vals.getMass7();
        arr[7] = vals.getMass8();
        arr[8] = vals.getMass9();
        return arr;
    }

    // gets average cost of all factories
    private void setSelectedCost(ArrayList<Factory> factories) {
        int averageCost = 0;
        setComputerSumRequirements();

        for(Factory fact: factories) {
            int constructCost =  fact.calculateCostMats(computerSumMaterials);
            int operatingCost = fact.getOperatingCost();
            averageCost += (operatingCost+constructCost)/ (double) factories.size();
        }
        selectedCost = getRandom(15,5, averageCost);
    }

    // sets array of total requirements needed for all computers in request
    private void setComputerSumRequirements() {
        for (Computer comps : computers) {
            int[] compsMaterial = comps.getConstructMaterial();
            for (int i = 0; i < compsMaterial.length; i++) {
                computerSumMaterials[i] += compsMaterial[i];
            }
            int[] compsEmployees = comps.getNumberOfEmployees();
            for (int i = 0; i < compsEmployees.length; i++) {
                totalNumberOfEmployees[i] += compsEmployees[i];
            }
        }
    }

    public int[] getComputerSumMaterials() {
        return computerSumMaterials;
    }

    public Boolean getRequestComplete() {
        return requestComplete;
    }

    public String getDay() {
        return day;
    }

    public String getHour() {
        return hour;
    }

    public String getMinute() {
        return minute;
    }

    // gets a random value depending on range given
    private int getRandom(int lower, int upper, int val) {
        int addOrSub = (int) Math.floor(Math.random() * (2) + 1);
        if (addOrSub == 1) {
            double random = (Math.random() * (lower + 1));
            double factor = random / 100;
            double value = factor * val;
            return val - ((int) value);
        }
        else {
            double random = (Math.random() * (upper + 1));
            double factor = random / 100;
            double value = factor * val;
            return val + ((int) value);
        }
    }

    public ArrayList<Computer> getComputers() {
        return computers;
    }

    public int getSelectedTime() {
        return selectedTime;
    }

    public Factory getTakenFactory() {
        return takenFactory;
    }

    public int getTakenFactoryIndex() {
        return takenFactoryIndex;
    }

    // finds the factory that best provides the request
    public int findFactory(ArrayList<Factory> factories) {

        double best = -1;
        int bestIndex = -1;

        setSelectedCost(factories);
        System.out.printf("selected for request#(%s/%s:%s)\ncost is: %d\ntime is: %d\n",
                day, hour, minute, selectedCost, selectedTime);

        for(Factory factory: factories) {
            if (!factory.isOccupied()) {
                // checks selected factory
                int[] currentValues = factory.getRequirments(this, factories.indexOf(factory));
                // analyze score
                double score = getScore(currentValues);
                System.out.println("Factory#" + factories.indexOf(factory) + " got score: " + score);
                // assigns best
                if (score > best) {
                    best = score;
                    bestIndex = factories.indexOf(factory);
                    takenFactoryProvidedCost = String.valueOf(currentValues[0]);
                    takenFactoryProvidedTime = String.valueOf(currentValues[1]);
                }
            }
        }
        if (bestIndex != -1) {
            takenFactory = factories.get(bestIndex);
            takenFactoryIndex = bestIndex;
            factories.get(bestIndex).setOccupied();
            System.out.printf("For request#(%s/%s:%s)\n", day, hour, minute);
            System.out.println("Factory " + (bestIndex + 1) + " has been occupied");
            return 1;
        }
        else {
            takenFactory = null;
            System.out.printf("For request#(%s/%s:%s)\n", day, hour, minute);
            System.out.println("No Factory have been found");
            return 0;
        }
    }

    private double getScore(int[] values) {
        double costScore = (selectedCost / (double) values[0]) / 2;
        double timeScore = (selectedTime / (double) values[1]) / 2;
        if ((costScore < 0.5) || (timeScore < 0.5)) {
            return -1;
        }
        else{
            return costScore + timeScore;
        }
    }

    public int getSelectedCost() {
        return selectedCost;
    }

    public String getDateRequested() {
        return dateRequested;
    }

    // summary of request state
    public String getFullfilmentInfo() {
        String requestInfo = "Request's Selected Cost: $" + selectedCost +
                " and Selected Time: " + selectedTime + " Days \n";
        String factoryInfo;
        if(takenFactoryProvidedCost == null || takenFactoryProvidedTime == null) {
            factoryInfo = "This Request did not find a factory!  \n";
        }
        else {
            factoryInfo = "Factory's Provided Cost: $" + takenFactoryProvidedCost +
                    " and Provided Time: " + takenFactoryProvidedTime + " Days \n";
        }
        return requestInfo + factoryInfo + "\n";
    }

    public String getTakenFactoryProvidedCost() {
        return takenFactoryProvidedCost;
    }
    public Boolean isComplete() {
        return requestComplete;
    }
    private int[] getTotalNumberOfEmployees() {
        return totalNumberOfEmployees;
    }
    public void setComplete() {
        this.requestComplete = true;
    }

    public String getTakenFactoryProvidedTime() {
        return takenFactoryProvidedTime;
    }

    // summary for request request's
    public String getComputersInformation() {
        StringBuilder info = new StringBuilder("Number of Computers generated: " + computers.size() + "\n");
        info.append("[workers, technicians, engineers]\n");
        info.append(Arrays.toString(getTotalNumberOfEmployees())).append("\n");
        info.append("[aluminium grams, plastic grams, glass grams, silicon mg " +
                ", gold mg, copper mg, iron grams, chrome mg, silver mg]\n");
        info.append(Arrays.toString(getComputerSumMaterials())).append("\n");
        for (Computer computer: computers) {
            info.append("Computer#").append(computers.indexOf(computer) + 1).append(":\n");
            info.append("\t[Company, Type, Quality]\n");
            info.append("\t").append(Arrays.toString(computer.getName())).append("\n");
            info.append("\t[workers, technicians, engineers]\n");
            info.append("\t").append(Arrays.toString(computer.getNumberOfEmployees())).append("\n");
            info.append("\t[aluminium grams, plastic grams, glass grams, silicon mg " +
                    ", gold mg, copper mg, iron grams, chrome mg, silver mg]\n");
            info.append("\t").append(Arrays.toString(computer.getConstructMaterial())).append("\n");
        }
        return info + "\n";
    }
}
