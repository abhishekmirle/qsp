package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class BinaryNoPresent {
	    public static void main(String[] args) {

        int[] a = {10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65};
        Arrays.sort(a); // Sort the array in ascending order

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the key element: ");
        int key = s.nextInt();

        int low = 0;int count=0;
        int high = a.length - 1;
        

        while (low <= high) {
            int mid = (low + high) / 2;

            if (key == a[mid]) {
                count++;
                break;
            } else if (key < a[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (count==1) {
            System.out.println("The key element is present in the array");
        }
        else {
        	 System.out.println("The key element is not present in the array");
		}
	    }
}