import java.util.Scanner;
public class Triangle2 {
    public static void main(String[] args){
        int a,b,c;
        float s,area;
        System.out.println("Enter the three sides of a triangle");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        s = (a+b+c)/2f;
        area = (float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of the triangle: " + area);
    }
}
