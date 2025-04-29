public class SelectionSort {
        public static void main(String[] args) {
            int arr[] = {9, 7, 5, 3, 1};
            System.out.println("before sorting");
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
            int temp = 0;
            int min = 0;
            for (int i = 0; i <= arr.length - 1; i++) {
                min = i;
                for (int j = i + 1; j <= arr.length - 1; j++) {
                    if (arr[min] > arr[j]) {
                        min = j;
                    }
                }
                temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }

            System.out.println("After sorting");
            for (int i : arr) {
                System.out.print(i + " ");
            }
        }
}
