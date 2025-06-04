public class DropNonDominant {
    public static void main(String[] args) {
        dropNonDominant(10);
    }
    // O(nsquare + n) is equivalent to O(n) - dropping non dominant while computing time complexity
    public static void dropNonDominant(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.println(i + " " + j);
            }
        }
        for (int i = 0; i < num; i++) {
            System.out.println(i + " ");
        }
    }
}
