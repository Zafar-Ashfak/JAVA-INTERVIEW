package Recursion;

import java.util.Scanner;

public class FriendsPairingProblem {
    public static int pairingFriends(int n) {
        // Base Case
        if (n == 1 || n == 2) {
            return n;
        }

        // Work
        int single = pairingFriends(n - 1);
        int pair = (n - 1) * pairingFriends(n - 2);
        return single + pair;
    }

    static void main() {
        System.out.println("Program to find the number of ways in which can friends\n can remain single or can be paired up");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of friends");
        int n = sc.nextInt();
        System.out.println("The total number of ways to pair the friends is: " + pairingFriends(n));
    }
}
