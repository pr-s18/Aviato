package demo;
import java.io.IOException;

public class Frozen {
	 public static void main(String[] args) throws IOException, InterruptedException {
		   ProcessBuilder pb = new ProcessBuilder("C:\\Program Files (x86)\\VideoLAN\\VLC\\vlc.exe", "C:\\Users\\Priyanka\\workspace\\demo\\src\\demo\\Frozen.mp4");
		   Process start = pb.start();
	   }
}
