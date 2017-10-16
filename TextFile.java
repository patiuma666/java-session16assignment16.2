package textfile;
//creating package named as textfile
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFile  {
	//creating class name as TextFile
static void modifyFile(String filePath, String oldString, String newString) throws IOException {
		//creating modifyFile method 
	//creating file object to modify the file path
		File fileToBeModified = new File(filePath);
		
		String oldContent = " ";
		
		BufferedReader reader = null;
		
		FileWriter writer = null;
		
		// Here it is reading all the lines of input text file into oldContent
		reader = new BufferedReader(new FileReader(fileToBeModified));
		String line = reader.readLine();
		//using while loop 
		while (line != null) {
			oldContent = oldContent + line + System.lineSeparator();

			line = reader.readLine();
		}

		// Replacing oldString with newString in the oldContent

		String newContent = oldContent.replaceAll(oldString, newString);

		// Rewriting the input text file with newContent

		writer = new FileWriter(fileToBeModified);

		writer.write(newContent);

		reader.close();

		writer.close();
	}
     
           //creating main method in modifyfile it throws an error to handle it we are using throws IO exception
	public static void main(String[] args) throws IOException {
		modifyFile("D://java/count.txt", "uma", "sanju");

		System.out.println("sucessfully done");
	}


}
