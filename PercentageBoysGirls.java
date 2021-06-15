// Program 13 - WAP to input the total number of students, girls and boys in your class and find the percentage of boys and girls.

import java.util.Scanner;

public class PercentageBoysGirls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of boys:\nEnter the number of girls:\nEnter the number of total students:");

        double noBoys = scan.nextDouble();
        double noGirls = scan.nextDouble();
        double totStudents = scan.nextDouble();

        double percBoys = (noBoys/totStudents) * 100;
        double percGirls = (noGirls/totStudents) * 100;

        System.out.println("Percentage of boys: " + percBoys + "\nPercentage of girls: " + percGirls);
    }
}
