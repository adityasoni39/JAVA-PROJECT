public class arrTwopointer {
 
    public static void main(String args[]){
        int arr[] = {1,2,4,5,7,11,15};
        int n = arr.length;
        int target = 7;
        int left = 0;
        int right = n-1;
        while(left<right){
            if(arr[left]+arr[right]==target){
                System.out.println("Pair found: "+arr[left]+" and "+arr[right]);
                return;
            }
            else if(arr[left]+arr[right]<target){
                left++;
            }
            else{
                right--;
            }
        }
        System.out.println("No pair found");
    }

}
