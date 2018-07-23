package enhancements;

import java.io.*;

public class TryWithResources {
	public static void main(String[] args) {
		try (Reader reader = new BufferedReader(new FileReader("file.txt"))) {
			
		}
		catch(IOException e) {
			
		}
		
		try(CloseableResource resource = new CloseableResource()) {
			
		}
		finally {
			System.out.println("Finally from try");
		}
	}
}