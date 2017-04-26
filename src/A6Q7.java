
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author malij6756
 */
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // This is where all 1000 numbers will be held as an array
        int[] sieve = new int[1001];

        // this array will act as the unchanged digits used that aren't affected by the actual sieve
        int[] sieve2 = new int[101];

        // fills in array position 1 to 1000 with the corresponding integer to represent it
        for (int i = 1; i < 1001; i++) {
            sieve[i] = sieve[i - 1] + 1;

        }
        // fills in the 10 digits from 1 to 100 with the corresponding integer to represent it
        for (int i = 1; i < 100; i++) {
            sieve2[i] = sieve2[i - 1] + 1;
        }
        // this will be used as a placeholder to check for non-prime numbers then eliminate with it
        int elim = 0;

        // the digits 2 through 100 will have their multiples compared for elimination using this loop
        for (int i = 2; i <= 100; i++) {
            // makes elim equal every single possible multiple of the current digit being used and loops through every multiple possible in the array
            for (int x = 2; x < 1001; x++) {
                elim = sieve2[i] * x;
                

                // checks the whole sieve array for the single multiple of the digit which was made "elim", eliminates it by making it equal -1
                for (int q = 2; q < 1001; q++) {
                    if (sieve[q] == elim) {
                        sieve[q] = -1;
                    }
                }
            }
        }
        // the loop runs through every number in the array and prints all the prime ones that haven't been eliminated (aka the numbers that don't equal -1)
        for (int s = 2; s < 1001; s++) {
            if (sieve[s] != -1) {
                System.out.println(sieve[s]);
            }

        }












    }
}
