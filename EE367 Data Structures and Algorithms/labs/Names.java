/* Names.java */

import java.io.*;

/**  The Names class provides a single function, main, that will
 *   perform various manipulations of the name John Fitzgerald Kennedy.
 *   This is a modification of the program on page 43 of Arnow and Weiss.
 */

class Names {
    static int l;
/** Performs various string operations on the name John Fitzgerald Kennedy.
 *  @param arg is not used.
 *  @version 1.1  24/8/2015.
 */
  public static void main(String arg[]) {
    int start=++l, end=++l;
    String first = "John";
    String middle = "Fitzgerald";
    String last = "Kennedy";
    String initials;
    String firstInit, middleInit, lastInit;

    firstInit = first.substring(start,end).toUpperCase();
    middleInit = middle.substring(start,end).toUpperCase();
    lastInit = last.substring(start,end).toUpperCase();
    initials = firstInit.concat(middleInit);
    initials = initials.concat(lastInit);

    System.out.println()
    System.out.println(first + " " + middle + " " + last + " ");
    System.out.println("His initials are: " + initials);
    System.out.println(last + ", " + first + " " + middle);
    System.out.println(last + ", " + first + " " + middleInit +".");
    System.out.println(first.toUpperCase() + " " + last.toUpperCase);

    System.out.println(first + " equals john is " + first.equals("john"));
    System.out.println(first + " equals john (ignoring case) is "
		       + first.equalsIgnoreCase("john"));
    System.out.println("The character at index 3 in " + middle + " is " +
		       middle.substring(3,1));
    System.out.println("The index of \"gerald\" within " + middle + " is " +
		       middle.indexOf("gerald"));
    System.out.println("The index of \"gerald\" within " + last + " is " +
		       last.indexOf("gerald"));

    System.out.println();
  }
}
