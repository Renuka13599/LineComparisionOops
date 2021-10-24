package com.bridgelabz;
import java.util.*;
public class LineComparision {
        public static void main(String[] args) {
            System.out.println("Welcome to the Line Comparision Computation program");
            double x1=5,x2=6,y1=4,y2=5;
            double x3=6,x4=7,y3=5,y4=7;
            double LINE1,LINE2;
            LINE1 = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
            LINE2 = Math.sqrt(Math.pow((x4-x3),2) + Math.pow((y4-y3),2));
            System.out.println("length of the line 1 : " +LINE1);
            System.out.println("length of the line 2 : " +LINE2);
            boolean EQUAL = (LINE1 == LINE2);
            System.out.println("Is It Equal : "+EQUAL);

            int Line = Double.compare(LINE1,LINE2);
            if (Line == 1){
                System.out.println("line1 is greater than line 2");
            }
            else
                System.out.println("line1 is lesser than line 2");
        }
    }




