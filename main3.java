// How to convert character array into string in java 
// char[] arr={'H','e','l','l','o'};
// String s=new String(arr);
//StringBuilder is mutable sequence of characters
public class main3 {
    public static void main(String[] args){
        //deleteCharAt(index)--->used to delete character at the given index
        StringBuilder sb=new StringBuilder("Puchhieeee");
        sb.deleteCharAt(3);
        System.out.println(sb);
    }
}
