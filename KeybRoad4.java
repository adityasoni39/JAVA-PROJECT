
import java.util.Scanner;

 class KeybRoad4 
{
     public static void main(String args[])
      {
         Scanner s = new Scanner(System.in);
         double percentage, hindi, english, math, biology, physics;
         System.out.println("Enter the value of five Subjects");
      hindi = s.nextDouble();
      english =  s.nextDouble();
      math = s.nextDouble();
      biology = s.nextDouble();
      physics = s.nextDouble();
         percentage = (hindi +  english + math + biology + physics)/5;
        System.out.println("percentage =" + percentage);    
    s.close();
        }
}
