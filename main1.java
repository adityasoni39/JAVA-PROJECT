// How to convert character array into string in java 
// char[] arr={'H','e','l','l','o'};
// String s=new String(arr);
//StringBuilder is mutable sequence of characters
public class main1 {
    public static void main(String[] args){
        //insert(index,character)--->udes to insert given character at the given index
        StringBuilder sb=new StringBuilder("Puchhieeee");
        sb.insert(3,'c');
        System.out.println(sb);
     }
}
