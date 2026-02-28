import java.util.ArrayList;

public class ArrayList_Q2 {
    public static ArrayList<Integer> lonelyNumbers(ArrayList<Integer> list) {
        ArrayList<Integer> lonely = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);

            // Check if num-1 and num+1 are NOT in the list
            if (!list.contains(num - 1) && !list.contains(num + 1)) {
                lonely.add(num);
            }
        }

        return lonely;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);

        System.out.println("Original List: " + list);
        ArrayList<Integer> result = lonelyNumbers(list);
        System.out.println("Lonely Numbers: " + result);
    }
}
