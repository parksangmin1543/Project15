package quiz;

import java.io.FileWriter;
import java.io.IOException;

public class Quiz5 {

	public static void main(String[] args) throws IOException {
	
		FileWriter fw = new FileWriter("src/quiz/writerQuiz.txt");
		
		for (int i = 2; i <= 10; i+=2)
			fw.write((i) + " ");
		
		fw.flush();
		fw.close();
	}
}
