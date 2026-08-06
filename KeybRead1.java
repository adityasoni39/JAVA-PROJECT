import java.util.Scanner;

class KeybRead1 {
    public static void main(String args[]) 
    {
       Scanner s = new Scanner(System.in);
       String name;
       System.out.println("May i know your Name");
       name = s.nextLine(); // Read name first 
       System.out.println("Welcome Mr./Miss" + name); 
       s.close();
    }
}
