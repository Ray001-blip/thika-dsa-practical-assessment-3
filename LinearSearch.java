public class LinearSearch {
    // Task 3: Linear search
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return index
            }
        }
        return -1; // Not found
    }

    public static void main(String[] args) {
        int[] A = {10, 20, 40, 60, 70, 80, 90};
        int target = 80;
        int index = linearSearch(A, target);
        
        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}