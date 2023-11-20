package Design_Patterns.Structural_Patterns.Facade;

// Subsystem Components
class AudioPlayer {
    public void playAudio(String fileName) {
        System.out.println("Playing audio file: " + fileName);
    }
}

class VideoPlayer {
    public void playVideo(String fileName) {
        System.out.println("Playing video file: " + fileName);
    }
}

class FileConverter {
    public void convert(String fileName, String format) {
        System.out.println("Converting file: " + fileName + " to format: " + format);
    }
}

// Facade
class MultimediaFacade {
    private AudioPlayer audioPlayer;
    private VideoPlayer videoPlayer;
    private FileConverter fileConverter;

    public MultimediaFacade() {
        this.audioPlayer = new AudioPlayer();
        this.videoPlayer = new VideoPlayer();
        this.fileConverter = new FileConverter();
    }

    public void playAudio(String fileName) {
        audioPlayer.playAudio(fileName);
    }

    public void playVideo(String fileName) {
        videoPlayer.playVideo(fileName);
    }

    public void convertFile(String fileName, String format) {
        fileConverter.convert(fileName, format);
    }
}

public class FacadePattern {
    public static void main(String[] args) {
        MultimediaFacade multimediaFacade = new MultimediaFacade();
        multimediaFacade.playAudio("audio.mp3");
        multimediaFacade.playVideo("video.mp4");
        multimediaFacade.convertFile("video.mp4", "mp3");
    }
}
