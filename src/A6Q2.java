
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author malij6756
 */
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // new scanner called input
        Scanner input = new Scanner(System.in);

        // Asking for the amount of people, stores as int called people
        System.out.println("How many people are there?");
        int people = input.nextInt();

        // list of numbers as long as the amount of people whose heights are going to be input
        double[] height = new double[people];

        // asks for heights
        System.out.println("What is their height (in metres)?");

        // stores every height inputted
        for (int i = 0; i < people; i++) {
            height[i] = input.nextDouble();
        }

        // new double called sum which equals 0 used as a beginning point to add up heights
        double sum = 0;

        // adds up all the heights
        for (int i = 0; i < people; i++) {
            sum = sum + height[i];
        }
        // gets the average height
        sum = sum / height.length;

        // outputs all the heights that are above average (sum)
        for (int i = 0; i < people; i++) {
            if (height[i] > sum) {
                System.out.println("Above average: " + height[i] + " m");
            }



        }

    }
}
