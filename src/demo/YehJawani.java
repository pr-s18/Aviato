package demo;
import java.io.IOException;

public class YehJawani {
	  public static void main(String[] args) throws IOException, InterruptedException {
		   ProcessBuilder pb = new ProcessBuilder("C:\\Program Files (x86)\\VideoLAN\\VLC\\vlc.exe", "C:\\Users\\Priyanka\\workspace\\demo\\src\\demo\\Yeh_Jawaani_Hai_Deewani.mp4");
		   Process start = pb.start();
	   }
}
