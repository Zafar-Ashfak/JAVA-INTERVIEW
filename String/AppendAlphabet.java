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
