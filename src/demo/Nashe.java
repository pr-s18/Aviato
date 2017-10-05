package demo;

import java.io.IOException;

public class Nashe {
	 public static void main(String[] args) throws IOException, InterruptedException {
		   ProcessBuilder pb = new ProcessBuilder("C:\\Program Files (x86)\\VideoLAN\\VLC\\vlc", "C:\\Users\\Priyanka\\workspace\\demo\\src\\demo\\Nashe_Si_Chadh_Gayi.mp4");
		   Process start = pb.start();
	   }
}
