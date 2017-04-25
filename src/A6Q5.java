
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author malij6756
 */
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // new scanner called input
        Scanner input = new Scanner(System.in);
        // asks for the amount of marks
        System.out.println("How many marks are there?");
        // stores the amount of marks as an integer called "marks"
        int marks = input.nextInt();


        // asks for user to input 10 marks
        System.out.println("Enter the " + marks + " marks");

        // this array will hold the marks
        double[] numb = new double[marks];

        // this will act as the filler value to swap
        double swap = 0;

        // this loop will store the 10 marks inputted in the numb array
        for (int i = 0; i < marks; i++) {
            numb[i] = input.nextInt();
        }
        // every mark in the array is given its own turn with the first loop
        for (int i = 0; i < marks; i++) {
            // the amount of loops decreases as the mark being replaced increases on the array, prevents the loop from exceeding the amount needed
            for (int x = 1; x < marks - i; x++) {
                // only works if the previous number is larger than the current one in the array
                if (numb[x] < numb[x - 1]) {
                    // updates the integer "swap" with the current number in the array it's looking at
                    swap = numb[x];
                    // swaps both of the numbers in the array, causing the smaller number to come first
                    numb[x] = numb[x - 1];
                    numb[x - 1] = swap;
                }

            }

        }
        // creates a space
        System.out.println();
        // all the numbers that have been rearranged are printed in a single line from lowest to largest
        for (int i = 0; i < marks; i++) {
            System.out.print(numb[i] + ", ");

        }
        // creates a space to seperate the median from the numbers
        System.out.println();

        // if the # of marks is odd, then you subtract by 1 then divide by 2 to find the array placement in the middle. This is used to output the number at the middle of the array.
        if (marks % 2 == 1) {
            marks = (marks - 1) / 2;
            System.out.println("Median: " + numb[marks]);

            // else if the amount of numbers in the array are even
        } else {
            // creates the median double which then becomes the average of the 2 numbers in the middle of the array by adding them both then dividing by 2, this is then outputted to the user.
            double median = 0;
            median = ((double) numb[numb.length / 2] + (double) numb[numb.length / 2 - 1]) / 2;
            System.out.println("Median " + median);




        }

    }
}
