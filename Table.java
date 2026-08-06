import java.util.Scanner;
class Table
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
         System.out.print("Enter Number: = ");
        int num = s.nextInt();
         
        for(int i =1; i<=15; i++)
        {
            System.out.println(num + "*"+ i + "=" + (num * i));
        }
        s.close();
    }
}

