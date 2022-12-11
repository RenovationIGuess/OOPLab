package AimsProject.src.hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
//	private int id;
//    private String title;
//    private String category;
//    private String director;
//    private int length;
//    private float cost;
    private static int nbDigitalVideoDiscs = 0;
    
//    public String getTitle() {
//        return title;
//    }
//    public void setTitle(String title) {
//        this.title = title;
//    }
//    public String getCategory() {
//        return category;
//    }
//    public void setCategory(String category) {
//        this.category = category;
//    }
//    public String getDirector() {
//        return director;
//    }
//    public void setDirector(String director) {
//        this.director = director;
//    }
//    public int getLength() {
//        return length;
//    }
//    public void setLength(int length) {
//        this.length = length;
//    }
//    public float getCost() {
//        return cost;
//    }
//    public void setCost(float cost) {
//        this.cost = cost;
//    }

    public DigitalVideoDisc() {

    }
    public DigitalVideoDisc(String title) {
        super();
    	nbDigitalVideoDiscs++;
    	this.setId(nbDigitalVideoDiscs);
        this.setTitle(title);
    }
    public DigitalVideoDisc(String title, String category, float cost) {
        nbDigitalVideoDiscs++;
//    	this.id = nbDigitalVideoDiscs;
//    	this.title = title;
//        this.category = category;
//        this.cost = cost;
        this.setId(nbDigitalVideoDiscs);
        this.setTitle(title);
        this.setCategory(category);
        this.setCost(cost);
    }
    public DigitalVideoDisc(String title, String category, String director, float cost) {
    	super(director);
        nbDigitalVideoDiscs++;
        this.setId(nbDigitalVideoDiscs);
        this.setTitle(title);
        this.setCategory(category);
//        this.setDirector(director);
        this.setCost(cost);
//    	this.id = nbDigitalVideoDiscs;
//    	this.title = title;
//        this.category = category;
//        this.director = director;
//        this.cost = cost;
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
    	super(length, director);
        nbDigitalVideoDiscs++;
//    	this.id = nbDigitalVideoDiscs;
//    	this.title = title;
//        this.category = category;
//        this.director = director;
//        this.length = length;
//        this.cost = cost;
        this.setId(nbDigitalVideoDiscs);
        this.setTitle(title);
        this.setCategory(category);
//        this.setDirector(director);
//        this.setLength(length);
        this.setCost(cost);
    }
    
    public String toString() {
    	return "DigitalVideoDisc: " +
                this.getId() + " | " +
                "title - " + this.getTitle() + " | " +
                "category - " + this.getCategory() + " | " +
                "director - " + this.getDirector() + " | " +
                "length - " + this.getLength() + " | " +
                "cost - " + this.getCost() + "$.";

    }
    
//    public boolean isMatch(String title) {
//    	if (this.title.equals(title)) {
//    		return true;
//    	} return false;
//    }
//
//    public boolean isMatch(int id) {
//    	if (this.id == id) return true;
//    	return false;
//    }

    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
}
