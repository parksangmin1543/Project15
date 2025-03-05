package quiz;

import java.io.FileOutputStream;
import java.io.IOException;

public class Quiz4 {

	public static void main(String[] args) {
	
		try {
			FileOutputStream fos = new FileOutputStream("output1.txt");
			
			for (int i = 0; i < 26; i++)
				fos.write(i + 'a');
		} catch(IOException e) {
			
		}
	}
}
