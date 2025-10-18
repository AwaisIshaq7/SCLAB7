import java.util.ArrayList;

public class ArrayListSample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Awais");
        list.add("Khan");
        list.add("Beetroot");
        list.add("Stake");
        for (String item : list) {
            System.out.println(item);
        }
    }
}