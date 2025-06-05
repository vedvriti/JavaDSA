public class DifferentTermsOfInputs {
    public static void main(String[] args) {
      differentTermsOfInputs(10,500000);
    }
    //Time Complexity = O(a + b)
    //Time Complexity for the nested loop O(a * b)
    public static void differentTermsOfInputs(int a,int b) {
        for(int i=0;i<a;i++) {
            System.out.println(i);
        }
        for(int j=0;j<b;j++) {
            System.out.println(j);
        }
    }
}
