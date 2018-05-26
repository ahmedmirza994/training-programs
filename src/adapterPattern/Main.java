package adapterPattern;

public class Main {

	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play("mp3", "beyond the horizon.mp3");
		audioPlayer.play("vlc", "beyond the horizon.vlc");
		audioPlayer.play("mp4", "beyond the horizon.mp4");
		audioPlayer.play("avi", "beyond the horizon.avi");
	}

}
