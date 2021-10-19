package part3.ex6.interface_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("src/part3/ex6/interface_/setting.txt");
		Scanner scan = new Scanner(fis);
		
		String className = scan.nextLine();
		
		// System.out.println(className);
		
		scan.close();
		fis.close();
		
		// A.class.newInstance(); = new A();
 		
		Class clazz = Class.forName(className);
		A a = new A();
		X x = (X) clazz.newInstance();
		  
		a.setX(x);
		  
		a.print();
		 
		
	}

}
