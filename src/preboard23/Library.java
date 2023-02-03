/* Question - A library issues books on rental basis at 2.5% charge on the cost price of the book per day. A book can be retained for 7 days
   without fine. If the book is returned after 7 days, a fine will also be charge for the excess days as per the below conditions.
   Write a class Library that has
   (i) a method to take input: book code, book name, price of the book, name of the person who gets the book issued, number of days the book
   has been retained.
   (ii) Constructor to initialize the values.
   (iii) a method to calculate and display the amount paid by the person when the book is returned.

   Number of excess days        Fine (in Rs.) per day
        1 to 4 days                     3.00
        5 to 8 days                     5.00
        More than 8 days                9.00
 */

package src.preboard23;

import java.util.Scanner;

public class Library {
    int bookCode, bookPrice, noOfDays;
    String personName, bookName;

    public Library() {
        bookCode = 0;
        bookPrice = 0;
        noOfDays = 0;
        personName = "";
        bookName = "";
    }

    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the: Book code, Book price, No. of days borrowed, Name of the book and Your name.");
        bookCode = scan.nextInt();
        bookPrice = scan.nextInt();
        noOfDays = scan.nextInt();
        bookName = scan.nextLine();
        personName = scan.nextLine();
    }

    public void calcDisplay() {
        double totalAmt = 0.0d;
        if (noOfDays <= 7) {
            totalAmt = ((2.5/100.0) * bookPrice) * noOfDays;
        }
        else if (noOfDays > 7 && noOfDays <= 11) {
            totalAmt = (((2.5/100.0) * bookPrice) * noOfDays) + (3 * (noOfDays - 7));
        }
        else if (noOfDays > 11 && noOfDays <= 15) {
            totalAmt = (((2.5/100.0) * bookPrice) * noOfDays) + (5 * (noOfDays - 11));
        }
        else {
            totalAmt = (((2.5/100.0) * bookPrice) * noOfDays) + (9 * (noOfDays - 15));
        }

        System.out.println("The total amount to be paid is \u20B9" + totalAmt);
    }

    public static void main(String[] args) {
        Library obj = new Library();
        obj.input();
        obj.calcDisplay();
    }
}
