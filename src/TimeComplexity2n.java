public class TimeComplexity2n {
    public static void main(String[] args){
        printNumbers(10);
    }
    //Here we can see Time Complexity (n+n)=2n  =~ n (eliminating constant) o(n)
    //First point to calculate time complexity is Drop constants
    public static void printNumbers(int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.println(i+" ");
        }
        for(int j=0;j<n;j++)
        {
            System.out.println(j+" ");
        }
    }
}
