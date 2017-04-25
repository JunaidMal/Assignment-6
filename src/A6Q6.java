
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author malij6756
 */
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // new scanner called input
        Scanner input = new Scanner(System.in);
        // asks for the amount of marks
        System.out.println("What is the size of the classroom?");
        // stores the amount of marks as an integer called "marks"
        int size = input.nextInt();

        // asks for user to input 10 marks
        System.out.println("Enter the " + size + " size(s)");

        // this array will hold the marks
        double[] numb = new double[size];

        // this will act as the filler value to swap
        double swap = 0;

        // this loop will store the sizes inputted in the numb array
        for (int i = 0; i < size; i++) {
            numb[i] = input.nextDouble();
        }
        // every mark in the array is given its own turn with the first loop
        for (int i = 0; i < size; i++) {
            // the amount of loops decreases as the mark being replaced increases on the array, prevents the loop from exceeding the amount needed
            for (int x = 1; x < size - i; x++) {
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
        // creates double to represent average
        double average = 0;
        // addds up all of the numbers in the array
        for (int i = 0; i < size; i++) {
            average = average + numb[i];
        }
        // divides them by the amount of #'s in the array for the final average
        average = average / size;

        // the array is ordered from lowest to highest, position 0 is outputted as the lowest and the highest mark being the highest position on the array subtracted by 1
        System.out.println("Lowest mark: " + numb[0]);
        System.out.println("Highest mark: " + numb[size - 1]);

        // outputs average previusly calculated
        System.out.println("Average: " + average);


    }
}
