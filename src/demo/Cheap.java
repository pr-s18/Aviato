package demo;

import java.io.IOException;

public class Cheap {
	 public static void main(String[] args) throws IOException, InterruptedException {
		   ProcessBuilder pb = new ProcessBuilder("C:\\Program Files (x86)\\VideoLAN\\VLC\\vlc.exe", "C:\\Users\\Priyanka\\workspace\\demo\\src\\demo\\Cheap_Thrills.mp4");
		   Process start = pb.start();
	   }
}
