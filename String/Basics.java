package String;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your nick name");
//        String nickName = sc.next();
//        System.out.println("Welcome to our app mr. " + nickName);

//        System.out.println("Enter your full name");
//        String fullName = sc.nextLine();
//
//        System.out.println("Good Morning " + fullName + ". You are genius");
//
//        System.out.println("Your name length is: " + fullName.length());

//        String str1 = "Zafar";
//        String str2 = "Ashfak";
//
//        System.out.println(str1 + " " + str2);
//        System.out.println(str1.charAt(2));

        // ************************************************************************************
        String st1 = "Dr Doom";
        String st2 = "Dr Doom";
        String str3 = new String("Dr Doom");

        if (st1 == st2) {
            System.out.println("str1 and str2 are equal");
        } else {
            System.out.println("str1 and str2 are not equal");
        }

        if (st1 == str3) {
            System.out.println("str1 and str3 are equal");
        } else {
            System.out.println("str1 and str3 are not equal");
        }

        if (st1.equals(str3)) {
            System.out.println("str1 and str3 are equal");
        } else {
            System.out.println("str1 and str3 are not equal");
        }
    }
}
