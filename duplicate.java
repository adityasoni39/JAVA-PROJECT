//How to convert character array into string in java 
//char[] arr={'a','b','c','d','e'};
//String s=new String(arr);
//Reverse a string using StringBuilder and StringBuffer
//StringBuilder is a mutable sequence of characters
//StringBuffer is a thred safe mutable sequence of characters
//Remove Duplicates characters from string 
public class duplicate{
    public static void main(String[] args){
        // Remove Duplicates
        String s = "banana";
        boolean[] freq=new boolean[26];
        StringBuilder result=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(!freq[ch-'a']){
                result.append(ch);
                freq[ch-'a']=true;
            }
        }
        System.out.println(result);
    }
}