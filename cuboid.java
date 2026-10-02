import java.util.Scanner;
public class cuboid {
    public static void main(String[] args){
        int length, breadth, height;
        int totalArea, volume;
        System.out.println("Enter the length, breadth, height of the cuboid");
        Scanner sc=new Scanner(System.in);
        length=sc.nextInt();
        breadth=sc.nextInt();
        height=sc.nextInt();
        totalArea=2*(length*breadth+breadth*height+height*length);
        volume=length*breadth*height;
        System.out.println("Total area of cuboid is " +totalArea);
        System.out.println("Volume of cuboid is " +volume);
    }
}
