// How to convert character array into string in java 
// char[] arr={'H','e','l','l','o'};
// String s=new String(arr);
//StringBuilder is mutable sequence of characters
public class main {
    public static void main(String[] args){
        //append()--->used to append new string with the given string 
        StringBuilder sb=new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb);

    }
}
