package Arrays;

import java.util.Arrays;

public class MoveAllZeroToEnd {

	public static void main(String[] args) {
   int arr[]= {1,3,6,4,0,6,0,4,0,6,8,0,2};
   int length=arr.length;
   int count=0;
   for(int i=0;i<length;i++) {
	   if(arr[i]!=0) {
		   arr[count++]=arr[i];
		   System.out.print(arr[i]);
   }
   }
   while(count<length) {
	   arr[count++]=0;
   }
  
   for(int j=0;j<length;j++) {
	   System.out.println(arr[j]);
   }
  
	   
   }

}
