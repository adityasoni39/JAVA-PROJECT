// How to convert character array into string in java 
// char[] arr={'H','e','l','l','o'};
// String s=new String(arr);
//StringBuilder is mutable sequence of characters
public class main2 {
    public static void main(String[] args){
        //delete(startIndex,endIndex)--->delete some portion of the string
        StringBuilder sb=new StringBuilder("banana");
        sb.delete(2, 4);
        System.out.println(sb);

    }
}
