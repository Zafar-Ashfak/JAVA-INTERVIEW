package String;

public class StringFunction {
    public static String subString(String str, int si, int ei) {
        String subStr = "";
        for (int i = si; i < ei; i++) {
            subStr += str.charAt(i);
        }

        return subStr;
    }

    public static String stringCompareFunc(String[] fruits) {
        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        String[] fruits = {"apple", "mango", "orange", "pineapple"};
        String largest = stringCompareFunc(fruits);
        System.out.println("The largest string is: " + largest);
    }
}
