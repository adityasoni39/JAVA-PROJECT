import java.util.Scanner;

class KeybRead2 {
  public static void main(String args[])
   {
    Scanner s = new Scanner(System.in);
    int area, a, b;
     System.out.println("Enter the length");
     a = s.nextInt();
     System.out.println("Enter the breadth");
     b = s.nextInt();
     area = a * b;
     System.out.println("Area is" + area);
     s.close();
  }  
}
