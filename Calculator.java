import java.util.Scanner;

public class Calculator {

    public static int add(int num1,int num2) {
        return num1 + num2;
    }

    public static int sub(int num1,int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1,int num2) {
        return num1  * num2;
    }

    public static int divide(int num1,int num2) {
        return num1/num2;
    }

    public static int remainder(int num1,int num2) {
        return num1  % num2;
    }


    public static void main(String[] args) {
        boolean flag = true;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the operand One : ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the operand Two : ");
        int num2 = scanner.nextInt();

        while(flag) {

            int choice;
            System.out.println("What u want to perform ? Please select : \n" +
                    "1. Addition \n" +
                    "2. Substraction \n" +
                    "3. Multiplication \n" +
                    "4. Division \n" +
                    "5. Remainder \n" +
                    "6. Exit (Press Any Key) ");
            choice = scanner.nextInt();

            switch(choice) {
                case 1 :
                    System.out.println("Addition of two numbers is : "+add(num1,num2));
                    break;
                case 2 :
                    System.out.println("Substraction of two numbers is : "+sub(num1,num2));
                    break;
                case 3 :
                    System.out.println("Multiplication of two numbers is : "+multiply(num1,num2));
                    break;
                case 4 :
                    System.out.println("Division of two numbers is : "+divide(num1,num2));
                    break;
                case 5 :
                    System.out.println("Remainder of two numbers is : "+remainder(num1,num2));
                    break;
                default  :
                    System.out.println("Exiting...");
                    flag = false;


            }
        }
    }
}

/*

Enter the operand One :
9
Enter the operand Two :
2

What u want to perform ? Please select :
1. Addition
2. Substraction
3. Multiplication
4. Division
5. Remainder
6. Exit (Press Any Key)

1
Addition of two numbers is : 11

What u want to perform ? Please select :
1. Addition
2. Substraction
3. Multiplication
4. Division
5. Remainder
6. Exit (Press Any Key)

2
Substraction of two numbers is : 7

What u want to perform ? Please select :
1. Addition
2. Substraction
3. Multiplication
4. Division
5. Remainder
6. Exit (Press Any Key)

3
Multiplication of two numbers is : 18

What u want to perform ? Please select :
1. Addition
2. Substraction
3. Multiplication
4. Division
5. Remainder
6. Exit (Press Any Key)

4
Division of two numbers is : 4

What u want to perform ? Please select :
1. Addition
2. Substraction
3. Multiplication
4. Division
5. Remainder
6. Exit (Press Any Key)

5
Remainder of two numbers is : 1

What u want to perform ? Please select :
1. Addition
2. Substraction
3. Multiplication
4. Division
5. Remainder
6. Exit (Press Any Key)

6
Exiting...


* */
