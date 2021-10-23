package com.bridgelabz;
/* Date:21/10/21
* purpose:Calculating equality  of line So that I know when two lines are equal or not.
 */

import java.util.Scanner;
public class LineComparision {
    static boolean CheckEquality(double Line1, double Line2) {

        if (Line1 == Line2)
            return true;
        return false;
    }
    public static void main (String[]args){


            Scanner sc = new Scanner(System.in);
            //Variables for first line
            int x1, y1, x2, y2;
            double Line1, Line2;
            // Points for line 1

            System.out.println("Enter X1 Point");
            x1 = sc.nextInt();
            System.out.println("Enter Y1 Point");
            y1 = sc.nextInt();
            System.out.println("Enter X2 Point");
            x2 = sc.nextInt();
            System.out.println("Enter Y2 Point");
            y2 = sc.nextInt();

            //Computation for line 1
            Line1 = Math.sqrt((x2 - x1) ^ 2 + (y2 - y1));


            // Variables for seconds line
            int x3, y3, x4, y4;
            // Points for line 2
            System.out.println("Enter X3 Point");
            x3 = sc.nextInt();
            System.out.println("Enter Y3 Point");
            y3 = sc.nextInt();
            System.out.println("Enter X4 Point");
            x4 = sc.nextInt();
            System.out.println("Enter Y4 Point");
            y4 = sc.nextInt();

            Line2 = Math.sqrt((x4 - x3) ^ 2 + (y4 - y3));

            System.out.println(" Lenth Of Line 1 is : " + "(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + ")===>" + LenthOfLine1);
            System.out.println(" Lenth Of Line 2 is : " + "(" + x3 + "," + y3 + ")," + "(" + x4 + "," + y4 + ")===>" + LenthOfLine2);

            boolean Equals = CheckEquality(Line1, Line2);
            if (Equals)
                System.out.println("Both Lines Are Equals");
            else
                System.out.println("Both Lines Are Not Equals");

    }
}

