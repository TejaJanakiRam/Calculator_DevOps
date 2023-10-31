package org.example;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.lang.Math;
import java.util.Scanner;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        logger.info("Welcome to the calculator logs!");

        Scanner scanner = new Scanner(System.in);
        int choice;
        int flag=1;
        int num1,num2;

        System.out.println("------------Welcome to the calculator!!--------------");
        System.out.println("Choose the operation:");
        System.out.println("");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Power");
        System.out.println("5. End program");
        System.out.println("---------------------");
        System.out.print("Please enter your choice: ");
        // System.out.println("");
        
        while(flag==1){
        choice = scanner.nextInt();
        if(choice==5) break;
            switch(choice){
                case 1:  //Addition
                    System.out.println("Please enter two integers: ");
                    num1 = scanner.nextInt();
                    num2 = scanner.nextInt();
                    add(num1,num2);
                    break;
                case 2: //Subtraction
                    System.out.println("Please enter two integers: ");
                    num1 = scanner.nextInt();
                    num2 = scanner.nextInt();
                    subtract(num1,num2);
                    break;
                case 3: //Multiplication
                    System.out.println("Please enter two integers");
                    num1 = scanner.nextInt();
                    num2 = scanner.nextInt();
                    multiply(num1, num2);
                    break;
                case 4: //Power
                    System.out.println("Please enter two integer");
                    num1 = scanner.nextInt();
                    num2 = scanner.nextInt();
                    expo(num1,num2);
                    break;
                default:
                    System.out.println("Exiting due to invalid input!!");
                    flag = 0;
            }
        }
        scanner.close();
    }

    public static int add(int x, int y){
        logger.info("Executing Addition!");
        int z = x+y;
        System.out.println("The Result is "+z);
        System.out.println("---------------");
        return z;
    }

    public static int subtract(int x, int y){
        logger.info("Executing Subtraction!");
        int z = x-y;
        System.out.println("The Result is "+z);
        System.out.println("---------------");
        return z;
    }

    public static int multiply(int x, int y){
        logger.info("Executing multiplication!");
        int z = x*y;
        System.out.println("The Result is "+z);
        System.out.println("---------------");
        return z;
    }

    public static double expo(int x, int y){
        logger.info("Executing Addition!");
        double z = Math.pow(x, y);
        System.out.println("The Result is "+z);
        System.out.println("---------------");
        return z;
    }
}
