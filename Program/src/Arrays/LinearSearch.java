package Arrays;
import java.util.Scanner;
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

			int[]a= {10,25,19,20,30,35,45};
			
			Scanner s= new Scanner(System.in);
			System.out.println("Enter the Key element");
			int key=s.nextInt();
			int count=0;
			for (int i = 0; i < a.length; i++) {
				if (key==a[i]) {
					count++;
					break;
					}
				}
				if(count==1)
					System.out.println("Key Element is Present");
				else
					System.out.println("key Element is not present");
			}
	}


