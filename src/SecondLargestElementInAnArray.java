public class SecondLargestElementInAnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(getSecondLarget(arr));

    }

    public static int getSecondLarget(int[] arr){
       int largest = -1 , secondLargest = -1;
       for(int i=0;i<arr.length;i++){
           if(arr[i]>largest){
               secondLargest = largest;
               largest = arr[i];
           }
           else if(arr[i]<largest && arr[i]>secondLargest){
               secondLargest = arr[i];
           }
       }
       return secondLargest;
    }
}
