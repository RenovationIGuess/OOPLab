package AimsProject.src.hust.soict.dsai.aims.media;
import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
    private  static int nbCompactDiscs = 0;
    private String artist;
    private List<Track> tracks = new ArrayList<Track>();

    public String getArtist() {
        return artist;
    }

    public CompactDisc() {
        this.setId(++nbCompactDiscs);
    }

    public CompactDisc(String title, String director, String artist) {
        super(director);
        this.setId(++nbCompactDiscs);
        this.setTitle(title);
        this.artist = artist;
    }

    public CompactDisc(String title, int length, String director, String artist) {
        super(length, director);
        this.setTitle(title);
        this.setId(++nbCompactDiscs);
        this.artist = artist;
    }

    public void addTrack(Track newTrack) {
        if (!this.tracks.contains(newTrack)) {
            this.tracks.add(newTrack);
            System.out.println("Add new track successful!");
        } else {
            System.out.println("This track has already existed!");
        }
    }

    public void removeTrack(Track trackToDel) {
        if (!this.tracks.contains(trackToDel)) {
            System.out.println("Track not found!");
        } else {
            if (this.tracks.remove(trackToDel)) {
                System.out.println("Delete successful!");
            } else {
                System.out.println("Delete failed!");
            }
        }
    }

    public int getLength() {
        int totalLength = 0;
        if (super.getLength() != 0) {
            return super.getLength();
        }
        for (Track t : this.tracks) {
            totalLength += t.getLength();
        }
        return totalLength;
    }

    public void play() {
        for (Track t : this.tracks) {
            t.play();
        }
    }

    public String toString() {
        return "Compact disc: " +
                this.getId() + " | " +
                "artist - " + this.getArtist() + " | " +
                "length - " + this.getLength() + " | " +
                "director - " + this.getDirector() + " | " +
                "title - " + this.getTitle() + " | " +
                "category - " + this.getCategory() + " | " +
                "cost - " + this.getCost() +
                ".";
    }
}
