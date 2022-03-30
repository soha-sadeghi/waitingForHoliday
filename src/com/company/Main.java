package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("what day is today?");
        String str= sc.nextLine();
        switch (str){
            case "saturday":
                System.out.println("wait 1 day " );
                break;
            case  "sunday":
                System.out.println("wait 7 day ");
                break;

            case "monday":
                System.out.println("wait 6 day");
            case "tuesday":
                System.out.println("wait 1 day " );
                break;
            case  "wednesday":
                System.out.println("wait 7 day");
                break;
            case "tursday":
                System.out.println("wait 6 day");
            case  "friday":
                System.out.println("wait 7 day ");
                break;
        }

    }
}
