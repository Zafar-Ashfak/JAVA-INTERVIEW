package Function;

import java.util.Scanner;

public class FunctionBasics {

    // 1. Take Nothing Return Nothing
    public static void sum() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number");
        int num2 = sc.nextInt();

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }


    // 2. Take Something Return Nothing
    public static void sub(double num1, double num2) {
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
    }


    // 3. Take Nothing Return Something
    public static int multiply() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number");
        int num2 = sc.nextInt();

        return num1 * num2;
    }


    // 4.  Take Something Return Something
    public static String concat(String str1, String str2) {
        return str1 + " " + str2;
    }

    // ********************************************************************************************************************************************************************
    //  Practice Question

    //    Q 1. Write a java method to compute factorial of a number
    public static long factorial(long num) {
        long fac = 1;
        for (int i = 1; i <= num; i++) {
            fac *= i;
        }

        return fac;
    }

    // Q 2. Write a java method to calculate Binomial Coefficient
    public static long binomialCoefficient(long n, long r) {
        long n_fac = factorial(n);
        long r_fac = factorial(r);
        long nmr_fac = factorial(n - r);

        return n_fac / (r_fac * nmr_fac);
    }

    // Q 3. Write a java method to swap to numbers using third variable
    public static void swap(int num1, int num2) {
        System.out.println("Before swapping");
        System.out.println("num1: " + num1 + ", and num2: " + num2);

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After swapping");
        System.out.println("num1: " + num1 + ", and num2: " + num2);
    }

    // Q 4. Write a java method to swap to numbers without using third variable
        public static void optSwap(int num1, int num2) {
        System.out.println("Before swapping");
        System.out.println("num1: " + num1 + ", and num2: " + num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After swapping");
        System.out.println("num1: " + num1 + ", and num2: " + num2);
    }

    // ****************************************************************************************************************************************************
    // Function Overloading
    public static void calcSum(int num1, int num2) {
        System.out.println("Sum is: " + (num1 + num2));
    }

    // Overloading using datatype
    public static void calcSum(float num1, float num2) {
        System.out.println("Sum is:  " + (num1 + num2));
    }

    // Overloading using parameter
    public static void calcSum(int num1, int num2, int num3) {
        System.out.println("Sum is: " + (num1 + num2 + num3));
    }

    // ************************************************************************************************************************************************************

    //    Q 1. Write a java method to check whether a number is prime or not
    public static boolean primeOrNot(int num) {
        boolean isPrime = true;
        if (num == 2) {
            isPrime = true;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        return isPrime;
    }

    // Q 2. Write a java method to print all prime numbers in a range
    public static void primesInRange(int range) {
        for (int i = 1; i <= range; i++) {
            if (primeOrNot(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Q 3. Write a java method to convert Binary number to Decimal number
    public static int binToDec(int binNum) {
        int decNum = 0;
        int pow = 0;

        while (binNum > 0) {
            int rem = binNum % 10;
            decNum += (int) (rem * Math.pow(2, pow));
            pow++;
            binNum /= 10;
        }

        return decNum;
    }

    // Q 4. Write a java method to convert Decimal number to Binary number
    public static int decToBin(int decNum) {
        int binNum = 0;
        int pow = 0;

        while (decNum > 0) {
            int rem = decNum % 2;
            binNum += (rem * (int) Math.pow(10, pow));
            pow++;
            decNum /= 2;
        }

        return binNum;

    }

    // Q 5. Write a java method to compute the average of three number
    public static float average(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3.0f;
    }

    // Q 6. Write a java method to check if a number is palindrome or not
    public static int isPalindrome(int num) {
        int rev = 0;
        while (num > 0) {
            int rem = num % 10;
            rev = (rev * 10) + rem;
            num /= 10;
        }

        return rev;
    }

    // Q 7. Write a program to compute sum of digits in an integer
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }
        return sum;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Program to compute swap two integer numbers");

        System.out.println("Enter the first number");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number");
        int num2 = sc.nextInt();

//        swap(num1, num2);
        optSwap(num1, num2);
    }
}
