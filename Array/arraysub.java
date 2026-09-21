public class arraysub {
    
public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int subtractor = 5;

        System.out.println("Original Array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println("Array after subtraction of " + subtractor + ":");
        for (int i = 0; i < array.length; i++) {
            array[i] -= subtractor;
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
