package AimsProject.src.hust.soict.dsai.aims.media;

public class Disc extends Media {
    private int length;
    private String director;

    public int getLength() {
        return length;
    }

    public String getDirector() {
        return director;
    }

    public Disc() {
        // super();
    }

    public Disc(int length, String director) {
        // super();
        this.length = length;
        this.director = director;
    }

//    public Disc(int length) {
//        this.length = length;
//    }

    public Disc(String director) {
        // super();
        this.director = director;
    }

    public Disc(String title, String category, float cost, String director) {
        super(title, category, cost);
        this.director = director;
    }

    public Disc(String title, String category, float cost, int length, String director) {
        super(title, category, cost);
        this.director = director;
        this.length = length;
    }
}
