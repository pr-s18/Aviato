package demo;

import java.io.IOException;

public class LeanOn {
	 public static void main(String[] args) throws IOException, InterruptedException {
		   ProcessBuilder pb = new ProcessBuilder("C:\\Program Files (x86)\\VideoLAN\\VLC\\vlc.exe", "C:\\Users\\Priyanka\\workspace\\demo\\src\\demo\\Lean_On.mp4");
		   Process start = pb.start();
	   }
}
