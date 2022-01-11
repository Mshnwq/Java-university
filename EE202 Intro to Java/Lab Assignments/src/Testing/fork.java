package Testing;

public class fork {
    public static void main(String[] args) {
        int[] face = {2,6,4,5,10,2};
        int[] freq = new int[7];
        for (int i = 0; i < face.length; i++) {
            try {
                ++freq[face[i]];
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.printf("%s\n",e);

//                System.out.println(e.getMessage());
                System.out.printf("freq[%d]\t%d\n",i,face[i]);
            }
        }
        System.out.printf("%4s\t%4s\n", "face", "freq");
        for (int j = 1; j < freq.length; j++)
            System.out.printf("%4d\t%5d\n",j,freq[j]);
    }
}
