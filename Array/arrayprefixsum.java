public class arrayprefixsum {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6};
        int n = arr.length;
        int prefixsum[] = new int[n];
        prefixsum[0] = arr[0];
        for(int i=1; i<n; i++){
            prefixsum[i] = prefixsum[i-1] + arr[i];
        }
        for(int i=0; i<n; i++){
            System.out.print(prefixsum[i]+" ");
        }
    }


}
