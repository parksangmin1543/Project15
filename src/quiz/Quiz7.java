package quiz;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Quiz7 {

	public static void main(String[] args) throws IOException {
	
		FileOutputStream fos = new FileOutputStream("src/quiz/writerQuiz2.txt");
		try (BufferedOutputStream bos = new BufferedOutputStream(fos)) {
			String str = "AAAAAAAAAA";
			
			for (int i = 0; i < str.length(); i++ ) {
				bos.write(str.charAt(i));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
