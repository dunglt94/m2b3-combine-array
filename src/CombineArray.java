public class CombineArray {
    public static void main(String[] args) {
        int arr1[] = new int[5];
        int arr2[] = new int[5];
        int arr3[] = new int[10];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) Math.round(Math.random() * 10);
            arr2[i] = (int) Math.round(Math.random() * 10);
        }
        System.out.println("Array 1: ");
        printArray(arr1);
        System.out.println("Array 2: ");
        printArray(arr2);
        for (int i = 0; i < arr1.length; i++) {
            arr3[i]= arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr2.length + i]= arr2[i];
        }
        System.out.println("Array 3: ");
        printArray(arr3);
    }

    public static void printArray(int[] arr) {
        for (int x: arr) {
            System.out.print(x + "\t");
        }
        System.out.println();
    }
}
