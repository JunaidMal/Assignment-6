
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author malij6756
 */
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // new scanner called input
        Scanner input = new Scanner(System.in);

        // asks for 2 integers
        System.out.println("Enter two integers: ");

        // creates an array for 2 integers
        int[] numb = new int[2];

        // stores the 2 integers entered in the array
        for (int i = 0; i < 2; i++) {
            numb[i] = input.nextInt();
        }
        // creates integers for both of the numbers in the array
        int a1 = numb[0];
        int a2 = numb[1];

        // switches the numbers in the array using the condition if the first number is less than the second
        if (a1 > a2) {
            numb[1] = a1;
            numb[0] = a2;
        }
        // outputs the integers with the numbers in ascending order
        System.out.println("The integers in ascending order are: " + numb[0] + " " + numb[1]);

    }
}
