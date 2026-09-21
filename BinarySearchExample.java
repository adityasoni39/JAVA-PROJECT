public class BinarySearchExample {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int target = 3;

        int low = 0;
        int high = a.length - 1;
        int index = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (a[mid] == target) {
                index = mid;
                break;
            } else if (a[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}