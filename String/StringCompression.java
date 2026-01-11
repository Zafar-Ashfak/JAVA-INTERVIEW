package String;

public class StringCompression {

    // Immutable newString
    public static String compress(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            newStr += str.charAt(i);
            if (count > 1) {
                newStr += count;
            }
        }

        return newStr;
    }

    public static String compressOpt(String str) {
        StringBuilder sb = new StringBuilder(" ");
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            sb.append(str.charAt(i));
            if (count > 1) {
                sb.append(count);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aaaabbcccdd";
        System.out.print("Original String: " + str + "\n");
//        System.out.print("Compressed String: " + compress(str));
        System.out.print("Compressed String: " + compressOpt(str));

    }
}
