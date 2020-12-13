package se.lexicon;

import  java.util.Scanner;
public class App {

    public static void main(String[] args) {
        App x = new App();
        Scanner scan = new Scanner(System.in);
        int num1, num2, num3, select;
        boolean check = true;

        //for the operator to be used - select

        while (check) {
            System.out.println("Please select an option to calculate");
            System.out.println("1.Add");
            System.out.println("2.Subtract");
            System.out.println("3.Multiply");
            System.out.println("4.Divide");
            System.out.println("5.Terminate calculator");
            select = scan.nextInt(); // this helps to take back the input for the selection
            if (select < 5) {
                System.out.println("ener any 2 numbers");
                //this is used to receive input from
                System.out.println("first number");
                num1 = scan.nextInt();
                System.out.println("second number");
                num2 = scan.nextInt();
                if (select == 1) {
                    num3 = x.addition(num1, num2);
                    System.out.println("Your answer is " + num3);
                } else if (select == 2) {
                    num3 = x.subtraction(num1, num2);
                    System.out.println("your answer is " + num3);
                } else if (select == 3) {
                    num3 = x.multiplication(num1, num2);
                    System.out.println("Your answer is " + num3);
                } else if (select  == 4) {
                    num3 = x.division(num1, num2);
                    System.out.println("Your answer is " + num3);
                }
                System.out.println("what do you like to do next");
            } else if (select == 5) {
                System.out.println("calculator terminated");
                check = false; // this turns the boolean back to false and code execution stops
            } else {
                System.out.println("you can choose within the available options");
            }
        }
    }

    public int addition(int a, int b) {
        int c;
        c = a + b;
        return c;
    }

    public int subtraction(int a, int b) {
        int c;
        c = a + b;
        return c;
    }

    public int multiplication(int a, int b) {
        int c;
        c = a + b;
        return c;
    }

    public int division(int a, int b) {
        int c;
        c = a + b;
        return c;
    }
}