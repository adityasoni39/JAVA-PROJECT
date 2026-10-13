// How to convert character array into string in java 
// char[] arr={'H','e','l','l','o'};
// String s=new String(arr);
//StringBuilder is mutable sequence of characters
    public class main4{
        public static void main(String[] args){
            //check the palindrome using StringBuilder
            StringBuilder sb=new StringBuilder("abba");
            String reverse=sb.reverse().toString();
        if(reverse.equals(sb.reverse().toString())){
                System.out.println("String is palindrome");
            }
            else{
                System.out.println("String is not palindrome");
            }
        }
    }
