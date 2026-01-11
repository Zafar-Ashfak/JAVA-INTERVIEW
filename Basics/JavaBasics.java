package Basics;

import java.util.Scanner;

public class JavaBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Add two numbers by user's choice

//        System.out.println("Enter the first number");
//        int num1 = sc.nextInt();

//        System.out.println("Enter the first number");
//        int num2 = sc.nextInt();

//        System.out.println(num1 + " + " +  num2 + " = " + (num1 + num2));

        // 2. Multiply two float numbers by user's choice
//        System.out.println("Enter the first number");
//        float num1 = sc.nextFloat();

//        System.out.println("Enter the first number");
//        float num2 = sc.nextFloat();

//        System.out.println(num1 + " X " + num2 + " = " + (num1 * num2));

        // 3. Area of the circle
//        System.out.println("Enter the radius of the circle");
//        int r = sc.nextInt();

//        System.out.println("Area of the circle is: " + (3.14f * r * r));

        // 4. ******** TYPE CONVERSION **********
//        System.out.println("Enter your marks");
//        float marks = sc.nextInt();
//
//        System.out.println("Your marks after type conversion: " + marks);

        // 5. ******** TYPE CASTING ***********
//        System.out.println("Enter the price of the pen");
//        int price = (int) sc.nextFloat();
//
//        System.out.println("Price of the pen after type casting is: " + price);

//     6. *********** TYPE PROMOTION ************
//        char a = 'a';
//        char b = 'b';
//
//        System.out.println((int) a);
//        System.out.println((int) b);
//        System.out.println(b - a);

//        *******************************************************************************************************************************************
//                                                        Practice Question

//        1. Average of three numbers

//        System.out.println("Enter the first number");
//        int a = sc.nextInt();
//
//        System.out.println("Enter the second number");
//        int b = sc.nextInt();
//
//        System.out.println("Enter the third number");
//        int c = sc.nextInt();
//
//        float avg = (a + b + c) / 3.0f;
//        System.out.println("Average of " + a + ", " + b + ", and " + c + " is: " + avg);

//        2. Area of the square

//        System.out.println("Enter side of the square");
//          int side = sc.nextInt();
//          int area = side * side;
//
//        System.out.println("Area of the square is: " + area);

//        3. Generate bill of three items to the user adding GST (18%)

//        System.out.println("Enter price of the pencil");
//        float pencil = sc.nextFloat();
//
//        System.out.println("Enter price of the pen");
//        float pen = sc.nextFloat();
//
//        System.out.println("Enter price of the eraser");
//        float eraser = sc.nextFloat();
//
//        float totalBill = pencil + pen + eraser;
//
//        System.out.println("Total bill is: " + totalBill);
//
//        float totalBillWithGST = (0.18f * totalBill) + totalBill;
//        System.out.println("Total bill with 18% GST is: " + totalBillWithGST);


// ******************************************************************************************************************************************
//                                            OPERATORS

        // 1. Arithmetic Operators sample program
//        float a = 10;
//        float b = 4;
//        System.out.println("Sum is: " + (a + b));
//        System.out.println("Difference is: " + (a - b));
//        System.out.println("Product is: " + (a * b));
//        System.out.println("Division is: " + (a / b));
//        System.out.println("Remainder is: " + (a % b));

//        2. Unary Operator sample program
//        int a = 4;
//        int b = a++;
//        int c = ++a;
//        System.out.println(b); // Output will remain same due to post increment, which would be 4
//        System.out.println(c); // Output will change which would be 6 due to pre increment and pre increment
//
//        int x = 10;
//        int y = x--;
//        int z = --x;
//        System.out.println(y); // Output will remain same due to post decrement, which would be 10
//        System.out.println(z); // Output will change which would be 8 due to pre increment and pre increment

        //************************************************************************************************************************************************
//                                                Relational Operator
//        int A = 10;
//        int B = 5;
//
//        System.out.println(A == B);
//        System.out.println(A > B);
//        System.out.println(A >= B);
//        System.out.println(A < B);
//        System.out.println(A <= B);

//        Q. Write a program to print the largest of 3 numbers.

//        System.out.println("Enter the first number");
//        int num1 = sc.nextInt();
//
//        System.out.println("Enter the second number");
//        int num2 = sc.nextInt();
//
//        System.out.println("Enter the third number");
//        int num3 = sc.nextInt();
//
//        if (num1 >= num2 && num1 >= num3) {
//            System.out.println("The largest number is: " + num1);
//        } else if (num2 >= num3) {
//            System.out.println("The largest number is: " + num2);
//        } else {
//            System.out.println("The largest number is: " + num3);
//        }

        // Q. Write a program to check whether if a year is leap or not.
//        System.out.println("Program to check whether if a year is leap or not");
//        System.out.println("Enter a year");
//        int year = sc.nextInt();
//
//        boolean a = (year % 4 == 0);
//        boolean b = (year % 100 != 0);
//        boolean c = ((year % 100 == 0) && year % 400 == 0);
//
//        if ( a && b || c) {
//            System.out.println(year + " is a leap year");
//        } else {
//            System.out.println(year + " is not a leap year");
//        }

        // Q. Write a program to reverse of a given number by user.

        // Method 1
//        System.out.println("Enter a number");
//        int num = sc.nextInt();
//        while (num > 0) {
//            int lastDigit = num % 10;
//            System.out.print(lastDigit);
//            num /= 10;
//        }

        // Method 2
//        System.out.println("Enter a number");
//        int num = sc.nextInt();
//        int orgNum = num;
//        int rev = 0;
//        while (num > 0) {
//            int rem = num % 10;
//            rev = (rev * 10) + rem;
//            num /= 10;
//        }
//
//        System.out.println("Original number is: " + orgNum);
//        System.out.println("Reversed number is: " + rev);

        // Q. Write a program to check whether a number is prime or not
//        System.out.println("Program to check whether a number is prime or not");
//        System.out.println("Enter a number");
//        int num = sc.nextInt();
//
//        boolean isPrime = true;
//
//        for (int i = 2; i <= Math.sqrt(num); i++) {
//            if (num % i == 0) {
//                isPrime = false;
//                break;
//            }
//        }
//
//        if (isPrime) {
//            System.out.println(num + " is a prime number");
//        } else {
//            System.out.println(num + " is not a prime number");
//        }

        // Q. Write a program that reads a set of integers from, and then prints the sum of the even and odd integers.
//        System.out.println("Enter an integer number");
//        int num = sc.nextInt();
//
//        int even = 0;
//        int odd = 0;
//
//        while (num > 0) {
//            int rem = num % 10;
//            if (rem % 2 == 0) {
//                even += rem;
//            } else {
//                odd += rem;
//            }
//
//            num /= 10;
//        }
//
//        System.out.println("Sum of even digits is: " + even);
//        System.out.println("Sum of odd digits is: " + odd);

    // Q. Write a program to calculate factorial of the number given by user.

//        System.out.println("Program to calculate factorial of the number given by user");
//        System.out.println("Enter a number");
//        int num = sc.nextInt();
//        int fac = 1;
//        for (int i = 1; i <= num; i++) {
//            fac *= i;
//        }
//
//        System.out.println("Factorial of " + num + " is: " + fac);

        // Q. Write a program to print multiplication table of the given number
        System.out.println("Enter a number");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
