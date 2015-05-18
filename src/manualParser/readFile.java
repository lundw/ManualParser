package manualParser;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class readFile {
	public readFile(String pathname) throws IOException {

	    File file = new File(pathname);
	    StringBuilder fileContents = new StringBuilder((int)file.length());
	    Scanner scanner = new Scanner(file);
	    String lineSeparator = System.getProperty("line.separator");

	    try {
	        while(scanner.hasNextLine()) {        
	            fileContents.append(scanner.nextLine() + lineSeparator);
	        }
	       // return fileContents.toString();
	    } finally {
	        scanner.close();
	    }
	}
	//main method
	public static void main(String args[]){
		String fileSeparator = System.getProperty("file.separator").toString();
		String workingDirectory = System.getProperty("user.dir");
		String pathName = workingDirectory + fileSeparator +"src"+ fileSeparator + "manualParser" +fileSeparator+ "Git.txt";
		
		System.out.println(pathName);
    	try {
			readFile manFile = new readFile(pathName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
		}
    }
}
