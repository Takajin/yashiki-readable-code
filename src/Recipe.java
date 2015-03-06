import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Recipe {
	public static void main(String[] args) {
		try{
			File fileName = new File("./recipe-data.txt");
			BufferedReader bufferReader = new BufferedReader(new FileReader(fileName));
	
			String menu;
			List <String> menuList = new ArrayList<>();
  			while((menu = bufferReader.readLine()) != null){
      				//System.out.println(menu);
				menuList.add(menu);
			}

			for( int i = 0; i < menuList.size(); i++ ) {
				System.out.println( i + ":" + menuList.get(i));
			}
    		}catch(FileNotFoundException e){
			System.out.println(e);
		}catch(IOException e){
  			System.out.println(e);
		}	
	}			
}
