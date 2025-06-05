import java.util.ArrayList;
import java.util.HashSet;

public class DistinctElements {
    public static void main(String[] args){
        int[] arr = {12, 10, 9, 45, 2, 10, 10, 45};
        ArrayList<Integer> res = distinctElementsInAnArray(arr);
        for(int i: res) {
            System.out.print(i + " ");
        }
    }

    public static ArrayList<Integer> distinctElementsInAnArray(int[] arr)
    {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (!set.contains(num)) {
                System.out.print(num + " ");
                set.add(num);
            }
        }
        return new ArrayList<>(set);
    }
}
