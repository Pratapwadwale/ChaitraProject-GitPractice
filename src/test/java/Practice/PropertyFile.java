package Practice;

import java.io.IOException;

import AppGenericUtility.PropertyFileUtility;

public class PropertyFile {
	public static void main(String[] args) throws IOException {
		PropertyFileUtility p=new PropertyFileUtility();
		System.out.println(p.readDataFromPropertyFile("url"));
	}

}
