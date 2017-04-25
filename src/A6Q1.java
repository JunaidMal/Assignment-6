
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author malij6756
 */
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating a scanner called input
        Scanner input = new Scanner(System.in);

        // Asking for # of students and storing as integer "students"
        System.out.println("How many students in the class?");
        int students = input.nextInt();

        // list of numbers as long as the number of students in the class
        double[] marks = new double[students];

        // asks for marks
        System.out.println("Enter the marks:");

        // stores every mark inputted
        for (int i = 0; i < students; i++) {
            marks[i] = input.nextDouble();
        }
        // new double called sum
        double sum = 0;

        // adds up all the marks 
        for (int i = 0; i < students; i++) {
            sum = sum + marks[i];
        }
        // gets the average by dividing the sum by the # of students
        sum = sum / marks.length;
        // rounding up 2 decimal places by multiplying over 2 decimal places, ceiling it, then dividing back 2 decimal places
        sum = sum * 100;
        sum = Math.ceil(sum);
        sum = sum / 100;

        // prints the class average
        System.out.println("The class average is " + sum + "%");



    }
}
