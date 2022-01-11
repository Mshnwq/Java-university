package Testing;

import org.w3c.dom.css.Rect;

public class FinalRevesion {

    public static void main(String[] args) {
//        int[] x = new int[5];
//        int i;
//        int j = -4;
//        try {
//            for(i = x.length; i >= 0; i--) {
//                x[i] = i;
//            }
//            j = i;
//        }
//        catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("exception");
//        }
//        System.out.println(j);
        Rectangle box1 = new Rectangle(1, 5, 9, 100);
        Rectangle box2 = new Rectangle();
        System.out.println(box1.getVolume());
        System.out.println(box1.calculateDensity());
        System.out.println(box2.getVolume());
        System.out.println(box2.calculateDensity());

    }
}

