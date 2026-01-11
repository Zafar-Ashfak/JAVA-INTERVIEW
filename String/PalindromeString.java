package String;

public class PalindromeString {
    public static boolean isPalindrome(String str) { // O(n)
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "apple";
        boolean res = isPalindrome(str);
        if (res) {
            System.out.println(str + " is a palindrome string");
        } else {
            System.out.println(str + " is a not palindrome string");
        }
    }
}
