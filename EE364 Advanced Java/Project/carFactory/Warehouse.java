package carFactory;

import java.util.Arrays;

public class Warehouse extends Building{

    private int[] materialQuantity;
    private Material material;

    public Warehouse(int[] buildingCapacity, String location,
                     int workingHours, Material material) {
        super(buildingCapacity, location, workingHours);
        this.material = material;
    }

    public int[] getMaterialQuantity() {
        return material.getMaterialQuantity();
    }

    public Material getMaterial() {
        return material;
    }

    public String getWarehouseInformation() {
        String info = "Location: " + super.getLocation() +
                " | Working hours: " + super.getWorkingHours() + "\n";
        info += "[aluminium grams, plastic grams, glass grams, silicon mg " +
                ", gold mg , copper mg, iron grams, chrome mg, silver mg]\n";
        info += "Storage capacity: " + Arrays.toString(super.getCapacity()) + "\n";
        info += "Materials: " + Arrays.toString(getMaterial().getMaterialQuantity()) + "\n";
        info += "[$ per grams, $ per grams, $ per grams, $ per mg " +
                ", $ per mg, $ per mg, $ per grams, $ per mg, $ per mg]\n";
        info += "Material prices: " + Arrays.toString(getMaterial().getMaterialPrice()) + "\n";
        return info + "\n";
    }
}
