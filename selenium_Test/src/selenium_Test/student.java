package selenium_Test;

// Class and objects

// class student {
//	
//	int rollno;
//	String name;
//	
//	void set(int r, String n) {
//		name = n;
//		rollno = r;
//	}
//	
//	void show() {
//		System.out.println(name);
//		System.out.println(rollno);
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		student s1 = new student();
//		s1.set(1, "Sagar");
//		s1.show();
//
//	}
//
//}


class student {
	int empno;
	String name;
	int salary;
	
	void setEmp(int e, String n, int s) {
		empno = e;
		name = n;
		salary = s;
	}
	
	void show() {
		System.out.println(empno);
		System.out.println(name);
		System.out.println(salary);
	}
	
	public static void main(String s[]) {
		student e = new student();
		e.setEmp(11, "sagar", 100000);
		e.show();
	}
}