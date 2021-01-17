package selenium_Test;

import java.util.concurrent.Flow.Publisher;

//public class book {
//	
//	// ARRAY OF OBJECT
//	
//	String bname;
//	int m1,m2,m3,total = 0;
//	
//	void set() {
//		bname = javax.swing.JOptionPane.showInputDialog("Enter the name");
//		m1 = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Enter price 1"));
//		m2 = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Enter price 2"));
//		m3 = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Enter price 3"));
//
//	}
//	
//	void show() {
//		System.out.println("book= "+bname);
//		total = m1 + m2 +m3;
//		System.out.println("Total = "+total);
//	}
//	
//	public static void main(String s[]) {
//		book b[] = new book[5];
//
//		for(int i=0;i<5;i++) {
//			b[i]= new book();
//			b[i].set();
//			b[i].show();
//			
//		}
//		
//		
//	}
//
//}


class book {
	int rollno;
	String name;
	
	book(){ // constructor must be same as the class name // Default constructor
		name = "sagar";
		rollno = 19;
	}
	
	book(int r, String n) {
		rollno = r;
		name = n;
	}
	void show() {
		System.out.println(name);
		System.out.println(rollno);
	}
	
	public static void main(String args[]) {
		book s1 = new book(1,"sagar");
		s1.show();
		
		book s2 = new book();
		s2.show();
	}
}