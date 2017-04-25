
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author malij6756
 */
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // new scanner called input
        Scanner input = new Scanner(System.in);

        // asks for user to input 10 marks
        System.out.println("Enter 10 marks");

        // this array will hold the 10 marks
        int[] numb = new int[10];
        // this will act as the filler value to swap
        int swap = 0;

        // this loop will store the 10 marks inputted in the numb array
        for (int i = 0; i < 10; i++) {
            numb[i] = input.nextInt();
        }
        // every mark in the array is given its own turn with the first loop
        for (int i = 0; i < 10; i++) {
            // the amount of loops decreases as the mark being replaced increases on the array, prevents the loop from exceeding the amount needed
            for (int x = 1; x < 10 - i; x++) {
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
        // creates a space just as a filler
        System.out.println();
        // all the numbers that have been rearranged are printed in a single line from lowest to largest
        for (int i = 0; i < 10; i++) {
            System.out.print(numb[i] + ", ");

        }


    }
}
