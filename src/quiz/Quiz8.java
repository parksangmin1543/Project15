package quiz;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Quiz8 {

	public static void main(String[] args) throws IOException {
	
		FileOutputStream fos = new FileOutputStream("src/quiz/writerQuiz2.txt");
		
		File dir = new File("C:\\Users\\G201\\Downloads");
		File[] files = dir.listFiles();
		try (OutputStreamWriter bos = new OutputStreamWriter(fos)) {
			for (File file2 : files) {
				String str = file2.toString();
				for (int i = 0; i < str.length(); i++ ) {
					bos.write(str.charAt(i));
				}
				bos.write('\n');
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
