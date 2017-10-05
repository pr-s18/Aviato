package demo;

import java.io.IOException;

public class Street {
	 public static void main(String[] args) throws IOException, InterruptedException {
		   ProcessBuilder pb = new ProcessBuilder("C:\\Program Files (x86)\\Adobe\\Acrobat Reader DC\\Reader\\AcroRd32.exe", "C:\\Users\\Priyanka\\workspace\\demo\\src\\demo\\lab2.pdf");
		   Process start = pb.start();
	   }
}
