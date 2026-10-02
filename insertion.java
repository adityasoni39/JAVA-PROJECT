public class insertion {
    public static void main(String[] args){
        int[] arr={5,1,3,4,6,2};
        int n=arr.length;
        for(int i=0; i<n; i++){
            int num=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>num){
              arr[j+1]=arr[j];
              j--;
              
          }
           arr[j+1]=num;
        }
         for(int i=0; i<n; i++){
            System.out.println(arr[i]);
    }
 }
}
