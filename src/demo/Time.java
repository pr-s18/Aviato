package demo;

import java.io.IOException;

public class Time {
	 public static void main(String[] args) throws IOException, InterruptedException {
		   ProcessBuilder pb = new ProcessBuilder("C:\\Program Files (x86)\\Adobe\\Acrobat Reader DC\\Reader\\AcroRd32.exe", "C:\\Users\\Priyanka\\workspace\\demo\\src\\demo\\Only_Time_Will_Tell.pdf");
		   Process start = pb.start();
	   }
}
