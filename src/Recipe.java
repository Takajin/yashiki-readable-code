import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Recipe {
	public static void main(String[] args) {
		try{
			File fileName = new File("./recipe-data.txt");
			BufferedReader bufferReader = new BufferedReader(new FileReader(fileName));
	
			String menu;
  			while((menu = bufferReader.readLine()) != null){
      				System.out.println(menu);
			}
    		}catch(FileNotFoundException e){
			System.out.println(e);
		}catch(IOException e){
  			System.out.println(e);
		}	
	}			
}
