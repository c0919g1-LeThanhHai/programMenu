package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----Menu-----");
        System.out.println("1. Draw triangle");
        System.out.println("2. Draw square");
        System.out.println("3. Draw rectangle");
        System.out.println("0. Exit");
        do {
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("--Draw triangle--");
                    System.out.println("* * *");
                    System.out.println("* *");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("--Draw square--");
                    System.out.println("* * *");
                    System.out.println("* * *");
                    System.out.println("* * *");
                    break;
                case 3:
                    System.out.println("--Draw rectangle--");
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    break;
                case 0:
                    System.out.println("Exit!!!");
                    break;
                default:
                    System.out.println("No choice!");
                    break;
            }
        } while (choice != 0);
    }
}
