package MultiDiamentionalArray;

import java.util.Scanner;

public class D5 {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of row");
    int row = sc.nextInt();
    System.out.println("enter the size of column");
    int col = sc.nextInt();
    int[][] a=new int[row][col];
    System.out.println("Enter "+(row*col)+" Elements");
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {
			a[i][j]=sc.nextInt();
		}
		}
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {
			System.out.println(a[i][j]+" ");
		}
		}
	
	System.out.println();
}
    
	}


