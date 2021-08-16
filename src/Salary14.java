/* Program 14 - WAP to input the name and basic salary of an employee. Calculate and display the gross and net salaries.
da = 30% of basic
hra = 12.5% of basic
pf = 10% of basic
gross = basic + da + hra + pf
net pay = gross - pf
 */

package src;

import java.util.Scanner;

public class Salary14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name:\nEnter your salary:");

        String employeeName = scan.nextLine();
        float basicSal = scan.nextFloat();

        float da = 30.0f/100.0f * basicSal;
        float hra = 12.5f/100.0f * basicSal;
        float pf = 10.0f/100.0f * basicSal;

        float grossSal = basicSal + da + hra + pf;
        float netSal = grossSal - pf;

        char rupee = '\u20B9';

        System.out.println("Gross salary = " + rupee + grossSal + ", Net salary = " + rupee + netSal);
    }
}
