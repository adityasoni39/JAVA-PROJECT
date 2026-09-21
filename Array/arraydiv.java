public class arraydiv {
    
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int divisor = 5;

        System.out.println("Original Array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println("Array after division by " + divisor + ":");
        for (int i = 0; i < array.length; i++) {
            array[i] /= divisor;
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
