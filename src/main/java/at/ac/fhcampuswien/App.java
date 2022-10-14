package at.ac.fhcampuswien;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        // input your solution here
        final DecimalFormat df = new DecimalFormat("0.00");

        double max = 0;

        Scanner input = new Scanner(System.in);

        for(int i = 1; i >= -1; i++) {

            System.out.print("Number " + i + ": ");
            double number = input.nextDouble();

            if (number <= 0 && i ==1) {
                System.out.println("No number entered.");
                break;
            }
            else if (number > max) {
                max = number;

            }
             else if (number <=0) {
                System.out.println("The largest number is " + df.format(max));

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

            int k= 1;
            for (int i = 1; i <= lines; i++) {

                for (int j = 1; j <= i; j++) {

                    System.out.print(k++ +" ");
                }

                System.out.println();
            }

        }

    }

    //todo Task 3
    public void printPyramid(){
        // input your solution here

        int n=6;

        for(int i= 1; i<= n; i++){
            for(int x= i; x<n; x++) {
                System.out.print(" ");
            }
            for(int j= 1; j<i; j++) {
                    System.out.print("*");
            }
            for (int k = 1; k <= i; k++) {

                System.out.print("*");
            }
            System.out.println();
        }


    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here
        Scanner sc = new Scanner(System.in);
        System.out.print("h: ");
        int height= sc.nextInt();

        System.out.print("c: ");
        char character = sc.next().charAt(0);

        int charnum = character;

        if(height%2 == 0){
            System.out.println("Invalid number!");
        }
        else
        {
            for(int i =1; i<= (height/2)+1;i++)
            {
                for(int x= i; x<(height/2)+1; x++) {
                    System.out.print(" ");
                }
                for (int j = i; j >= 1; j--) {
                    System.out.print((char) (charnum-j+1));
                }
                for (int l = 2; l <= i; l++) {
                    System.out.print((char) (charnum - l + 1));
                }
                System.out.println();

            }
            for (int j = (height/2); j > 0; j--) {
                for(int x=(height/2); x>=j; x--) {
                    System.out.print(" ");
                }
                for (int l = j; l > 0; l--) {
                    System.out.print((char) (charnum - l + 1));
                }
                for (int k = 1; k < j; k++){
                    System.out.print((char) (charnum - k));
                }

                System.out.println();
            }
        }

    }

    //todo Task 5
    public void marks(){
        // input your solution here

        final DecimalFormat df = new DecimalFormat("0.00");

        double avr = 0;
        int neg = 0;
        double sum = 0;
        int cout = 0;
        Scanner input = new Scanner(System.in);
        for(int i = 1; i > 0; i++) {

            System.out.print("Mark " + i + ": ");
            double Mark = input.nextDouble();

            if(Mark > 0 && Mark <= 5){
                cout++;
                sum += Mark;
                avr=sum/cout;
            }
            if (Mark == 0) {
                System.out.println("Average: " + df.format(avr));
                System.out.println("Negative marks: "+neg);
                break;
            } else if (Mark > 5) {
                System.out.println("Invalid mark!");
                i=i-1;
            } else if (Mark == 5) {
                neg++;

            }
        }
    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here
        Scanner sc = new Scanner(System.in);

        System.out.print("n: ");
        int nummer = sc.nextInt();
        int ziffer;
        int sum = 0;

        while(nummer !=1 && nummer !=4){
            while(nummer>0){
                ziffer = nummer % 10;
                sum = (ziffer*ziffer) + sum;
                nummer = nummer / 10;
            }
            nummer = sum;
            sum =0;
        }


        if (nummer == 1) {
            System.out.println("Happy number!");
        }else {
            System.out.println("Sad number!");
        }
    }

    public static void main(String[] args){
        App exercise2 = new App();

       // System.out.println("Task 1: Largest Number");
        //exercise2.largestNumber();

        //System.out.println("\nTask 2: Stairs");
        //exercise2.stairs();

        //System.out.println("\nTask 3: Pyramide");
       // exercise2.printPyramid();

       // System.out.println("\nTask 4: Raute");
       // exercise2.printRhombus();

       // System.out.println("\nTask 5: Notendurchschnitt");
      //  exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}