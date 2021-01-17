package selenium_Test;

import java.util.*;


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.setProperty("webdriver.safari.driver", )
		
		// Reverse the array elements
		
//		int n[] = {1,2,3,4,5,4,4};
//		
//		for(int i=n.length-1 ; i>=0; i--) {
//			System.out.print(n[i]);
//		}
		
		// occurrence of elements of array
		
		/*int k = 4;
		int num=0;
		for(int i=0; i<n.length; i++) {
			
			if(k==n[i]) {
				 num++;
					System.out.print(num);

			}
			
			//
			
			
		} */
		
		int m,n,c,d;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the number of rows and columns of matrix");
		m = in.nextInt();
		n = in.nextInt();
		
		int first [][]=new int[m][n];
		System.out.println("Enter the elements of first matrix");
		
		
		
		for(c=0;c<m;c++) {
			for(d=0;d<n;d++) {
				first[c][d] = in.nextInt();
				System.out.print(first[c][d]+"\t");
			}
			System.out.println();
		}
		
	
		
		
	}

}
