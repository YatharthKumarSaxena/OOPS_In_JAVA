package Question_Practice;
import java.util.ArrayList;
public class BuiltInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.set(0,10);
        System.out.println(arr);
    }
}
