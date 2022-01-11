package Testing;

public class Rectangle {
    private int W1;
    private int H1;
    private int L1;
    private int We;
        public Rectangle() {
            this(0,0,0,0);
        }
        public Rectangle(int W1, int L1, int H1, int We) {
            this.W1 = W1;
            this.H1 = H1;
            this.L1 = L1;
            this.We = We;
        }
        public int getVolume() {
            return H1*L1*W1;
        }
        public double calculateDensity() {

            int V = getVolume();

            if (V == 0)
                throw new IllegalArgumentException("cannot divide by zero");

            return (double) We/V;
        }
    }
