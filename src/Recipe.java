import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Recipe {
	public static void main(String[] args) {
			List<String> menuList = createMenuList();
			for( int i = 0; i < menuList.size(); i++ ) {
				System.out.println( i + ":" + menuList.get(i));
			}

	}
	
	private static List<String> createMenuList() {
		List <String> menuList = new ArrayList<>();
		try{
			File fileName = new File("./recipe-data.txt");
			BufferedReader bufferReader = new BufferedReader(new FileReader(fileName));

			String menu;
			while((menu = bufferReader.readLine()) != null){
	                	menuList.add(menu);
	                }

    	
		}catch(FileNotFoundException e){
			System.out.println(e);
		}catch(IOException e){
  			System.out.println(e);
		}finally{
			return menuList;
		}
	
	}			
}
