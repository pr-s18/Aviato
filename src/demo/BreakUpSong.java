package demo;

import java.io.IOException;

public class BreakUpSong {
	 public static void main(String[] args) throws IOException, InterruptedException {
		   ProcessBuilder pb = new ProcessBuilder("C:\\Program Files (x86)\\VideoLAN\\VLC\\vlc.exe", "C:\\Users\\Priyanka\\workspace\\demo\\src\\demo\\The_Breakup_Song.mp4");
		   Process start = pb.start();
	   }
}
