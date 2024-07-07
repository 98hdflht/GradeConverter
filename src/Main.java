// Quincy Yarbrough
// 6/24/2024

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numGrade = 10;
        char a = 'A', b = 'B', c = 'C', d = 'D', f = 'F'; // grade letter variables
        String more = "y"; // continue variable
        String letterGrade = "Letter grade: "; //
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Letter Grade Converter");

        while (more.equalsIgnoreCase("y")) {
            System.out.print("Enter numerical grade: ");
            String input = sc.nextLine();
            numGrade = Integer.parseInt(input);
            if (numGrade >= 88) {
                System.out.println(letterGrade + a);
            } else if (numGrade >= 80) {
                System.out.println(letterGrade + b);
            } else if (numGrade >= 67) {
                System.out.println(letterGrade + c);
            } else if (numGrade >= 60) {
                System.out.println(letterGrade + d);
            } else {
                System.out.println(letterGrade + f);
            }
            System.out.print("Continue? (y/n)");
            more = sc.nextLine();
        }
    }
}