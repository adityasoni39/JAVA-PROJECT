//How to convert character array into string in java 
//char[] arr={'a','b','c','d','e'};
//String s=new String(arr);
//Reverse a string using StringBuilder and StringBuffer
//StringBuilder is a mutable sequence of characters
//StringBuffer is a thred safe mutable sequence of characters
public class main5 {
    public static void main(String[] args){
        //Count vowels
        String s="Riittiikkkkkaa";
        int count=0;
        String s1=s.toLowerCase();
        for(int i=0; i<s1.length(); i++){
            char ch=s1.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        System.out.println("Number of vowels: " + count);
    }
}
