// Q. Write a java program to append all the alphabets from A to Z in a string.

package String;

public class AppendAlphabet {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            sb.append(ch);
        }

        System.out.println(sb.toString());
        System.out.println(sb.length());

    }
}
