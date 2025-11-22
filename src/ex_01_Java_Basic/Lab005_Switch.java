package ex_01_Java_Basic;

import java.sql.SQLOutput;

public class Lab005_Switch {
    public static void main (String args[]) {
        int day = 1;

        switch (day=3) {
            case 1:
            System.out.println("Sunday");
            break;
            case 2:
            System.out.println("Monday");
            break;
            case 3:
            System.out.println("Tuesday");
            break;
            case 4:
            System.out.println("Thrusday");
            break;
            default:
                System.out.println("invalid number");
                break;
        }

    }



    }
