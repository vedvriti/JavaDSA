public class addItems {
    public static void main(String[] args) {
       int a =  addItem(5);
       System.out.println(a);
    }
    // Time Complexity O(1) - Since we are performing only one operation
    //It is the most efficient
    public static int addItem(int n){
        return (n + n);
    }
}

