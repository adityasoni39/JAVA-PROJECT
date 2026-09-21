import java.util.Scanner;

class KeybRoad3 {
  public static void main(String args[]) 
  {
    Scanner s = new Scanner(System.in);
    double simpleInterest, principle, rate, time;
    System.out.println("Enter the value of Principle");
    principle  = s.nextDouble();
    System.out.println("Enter the value of Rate");
    rate = s.nextDouble();
    System.out.println("Enter the value of Time"); 
    time = s.nextDouble();
    simpleInterest = (principle * rate * time) / 100;
System.out.println("Simple Interest  is " + simpleInterest);
s.close();
  }  
}
