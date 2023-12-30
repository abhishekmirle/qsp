package Arrays;
import java.util.Scanner;

public class BubbleSortDecending {

	public static void main(String[] args) {
		  Scanner s = new Scanner(System.in);

		        System.out.println("Enter the length of the array: ");
		        int n = s.nextInt();

		        int[] arr = new int[n];

		        System.out.println("Enter the elements of the array: ");
		        for (int i = 0; i < n; i++) {
		            arr[i] = s.nextInt();
		        }

		        System.out.println("Original array: ");
		        printArray(arr);

		        bubbleSortDescending(arr);

		        System.out.println("Sorted array in descending order: ");
		        printArray(arr);
		    }

		    private static void bubbleSortDescending(int[] arr) {
		        boolean swapped = true;
		        int n = arr.length;

		        while (swapped) {
		            swapped = false;

		            for (int i = 0; i < n - 1; i++) {
		                if (arr[i] < arr[i + 1]) {
		                    int temp = arr[i];
		                    arr[i] = arr[i + 1];
		                    arr[i + 1] = temp;

		                    swapped = true;
		                }
		            }

		            n--;
		        }
		    }

		    private static void printArray(int[] arr) {
		        for (int i = 0; i < arr.length; i++) {
		            System.out.print(arr[i] + " ");
		        }
		        System.out.println();
		    }
	}

