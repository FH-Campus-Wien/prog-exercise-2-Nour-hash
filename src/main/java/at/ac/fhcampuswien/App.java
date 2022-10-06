package at.ac.fhcampuswien;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        // input your solution here
        final DecimalFormat df = new DecimalFormat("0.00");

        double max = 0;

        for(int i = 1; i > -1; i++) {
            Scanner input = new Scanner(System.in);
            System.out.print("Number " + i + ": ");
            double number = input.nextDouble();

            if (number > max) {
                max = number;

            }
            if (number == 0) {
                System.out.println("The largest number is " + df.format(max));
                i = -1;
                break;
            } else if (number <= -1) {
                System.out.println("No number entered.");
                break;
            }
        }
    }

    //todo Task 2
    public void stairs(){
        // input your solution here

        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        int lines= sc.nextInt();

        if(lines < 0){
            System.out.println("Invalid number!");
        }
        else {


            for (int i = 1; i <= lines; i++) {

                for (int j = 1; j < i; j++) {

                    j= j+i;
                    System.out.print(j + " ");
                }

                System.out.println(i);
            }

        }

    }

    //todo Task 3
    public void printPyramid(){
        // input your solution here
    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here
    }

    //todo Task 5
    public void marks(){
        // input your solution here
    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here
    }

    public static void main(String[] args){
        App exercise2 = new App();

        //System.out.println("Task 1: Largest Number");
       // exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}