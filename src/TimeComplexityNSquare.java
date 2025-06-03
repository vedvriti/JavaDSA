public class TimeComplexityNSquare {
    public static void main(String[] args) {
       printNumbers(10);
    }
//Time Complexity n square
    public static void printNumbers(int n){
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println(i+" "+j);
            }
        }
    }
}
