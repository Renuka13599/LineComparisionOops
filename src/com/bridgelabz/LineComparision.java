package com.bridgelabz;
import java.util.*;
public class LineComparision {
        double x1,x2,y1,y2;
        public LineComparision(double x1, double x2 , double y1 ,double y2){
            this.x1=x1;
            this.x2=x2;
            this.y1=y1;
            this.y2=y2;
        }
        public double calOfLength(){
            double length = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
            return length;
        }
        public static void comparision(double a , double b){

            boolean EQUAL = (a == b);
            System.out.println("It Is Equal : "+EQUAL);
            double line = Double.compare(a,b);
            if (line == 1){
                System.out.println("line1 is greater than line 2");
            }
            else
                System.out.println("line1 is lesser than line 2");

        }
        public static void main(String[] args) {
            LineComparision lineComparision1 = new LineComparision(9,4,5,6);
            LineComparision lineComparision2 = new LineComparision(9,6,7,8);
            double lengthOfLine1 = lineComparision1.calOfLength();
            double lengthOfLine2 = lineComparision2.calOfLength();
            comparision(lengthOfLine1,lengthOfLine2);
        }

}



