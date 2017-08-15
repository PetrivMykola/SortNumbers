import java.util.Scanner;

public class SortNumbers {

        void showArray (int[] arr) {
            for (int i=0; i<arr.length; i++){
                System.out.print(arr[i]+", ");
            }
       }

        void bubbleSort(int[] arr) {
            int temp = 0;
            for (int i=0; i<arr.length; i++) {
                for (int j=1; j<arr.length-i; j++) {
                    if(arr[j-1] > arr[j]) {
                        temp = arr[j-1];
                        arr[j-1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            System.out.print("Sorted array: ");
            showArray(arr);
        }

    public static void main(String[] args) {

        SortNumbers sort = new SortNumbers();
        Scanner in = new Scanner(System.in);
        int[] nums = new int[5];

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Enter number " + (i + 1));
            nums[i] = in.nextInt();
        }

        System.out.print("Initial array: ");
        sort.showArray(nums);

        System.out.println();
        sort.bubbleSort(nums);

    }

    }


