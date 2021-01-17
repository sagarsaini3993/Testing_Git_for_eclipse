package selenium_Test;

import java.io.*;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int count = 0;
		int word = 0;
		int vowels = 0;
		File f;
		f = new File("text");
		if(!f.exists()) {
			f.createNewFile();
			System.out.println("File created successfully");
			FileOutputStream fop = new FileOutputStream(f);
			String str = "Hello there How are you? Where were you from last two days?";
			fop.write(str.getBytes());
			fop.flush();
			fop.close();
			System.out.println("The file has been written");
			
			FileInputStream fip = new FileInputStream(f);
			FileReader fr = new FileReader(f);
			LineNumberReader lin = new LineNumberReader(fr);
			System.out.println(lin.readLine());  // lin is reading line
//			System.out.print(lin.readLine().length());
			
//			for(int i=0; i<lin.readLine().length(); i++) {
//				System.out.print("Char is ");
//			}
			
			while(lin.readLine()!= null) {
				count++;
			}
			System.out.println("Total number of lines are : "+count);
			String []words = str.split(" ");
			int k = words.length;
			
			
			// Checking number of vowels in a string
//						for(int i=0;i<str.length(); i++) {
//							if(words[i].equals(words)) {
//								
//							}
//						}
						
			// Count occurence of 'is' in string

			
			
			// Counting number of words in a string
			
			for(int i = words.length-1;i>0; i--) {
				word++;
			}
			System.out.println("Total number of words are : "+word);
			
			

//			byte b;
//			do {
//				b = (byte)fip.read();
//				System.out.print((char)b);
//				for(int i=0;i<=b;i++) {
//					System.out.println(i);
//				}
//				
//			} while(b!=-1); {
//				fip.close();
//			}
		} else {
			System.out.println("File already exists");
		}
			
		

	}

}
