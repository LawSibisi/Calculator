package org.study;
import java.util.*;
import java.util.Scanner;


public class SimpleCalculatorApp {
    //Question 1
    public int add(int numA, int numB){
        return numA + numB;
    }

    //Question 2
    public int addNumberList(int z) {

        for(int i = 1; i <= 5; i++){
            z +=i;
        }
        return  z;
    }
    //Question 3
    public int multiplyOne(int x, int y){
        return x * y;
    }
    //Question 4
    public int multiply(int a) {

        for(int i = 1; i <= 5; i++){
            a *=i;
        }
        return  a;
    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        SimpleCalculatorApp calculate = new SimpleCalculatorApp();

        System.out.println("1.Add two numbers: ");
        System.out.println("2.add many numbers: ");
        System.out.println("3.Multiply two number: ");
        System.out.println("4.Multiply many numbers: ");

        int option = input.nextInt();

        switch (option){
            case 1:
                System.out.println("========ADDING TWO NUMBERS=======");
                System.out.println("Enter first value");
                int numA = input.nextInt();
                System.out.println("Enter the second value");
                int numB = input.nextInt();
                System.out.println("Results: " + calculate.add(numA,numB));
                break;

            case 2:
                System.out.println("========ADDING UP TO 5 NUMBERS=======");
                System.out.println("Enter the index value where the loop should start multiplying(count is up to 5)");
                int z = input.nextInt();
                System.out.println("Results: " + calculate.addNumberList(z));
                break;

            case 3:
                System.out.println("========MULTIPLYING TWO NUMBERS=======");
                System.out.println("Enter first value: ");
                int x = input.nextInt();
                System.out.println("Enter second Value: ");
                int y = input.nextInt();
                System.out.println("Results: " + calculate.multiplyOne(x,y));
                break;

            case 4:
                System.out.println("========MULTIPLYING UP TO 5 NUMBERS=======");
                System.out.println("Enter the index value where the loop should start multiplying(count is up to 5)");
                int a = input.nextInt();
                System.out.println("Results: " + calculate.multiply(a));
                break;
        }

    }
}
