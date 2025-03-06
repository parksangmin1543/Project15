package quiz;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Quiz10 {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("src/quiz/writerQuiz3.txt");
		OutputStreamWriter bos = new OutputStreamWriter(fos);
		File dir = new File("C:\\Users\\G201\\Downloads");
//		File dir = new File("C:\\Users\\G201\\Downloads\\GmarketSansOTF");
		outputDir(bos, dir, 0);
	}

	public static void outputDir(OutputStreamWriter fos, File dir, int cnt) {
		File[] files = dir.listFiles();
		try {
			for (File file2 : files) {
				String str = file2.getName();
				for (int j = 0; j < cnt; j++)
					fos.write('\t');
				for (int i = 0; i < str.length(); i++) {
					fos.write(str.charAt(i));
				}
				fos.write('\n');
				fos.flush();
				if (file2.isDirectory() == true)
					outputDir(fos, file2, cnt + 1);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
