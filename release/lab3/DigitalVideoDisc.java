//Nguyen Le Minh 20205002
public class DigitalVideoDisc {
	// basic info
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private int id;
	private static int nbDigitalVideoDisc = 0;//static help share the value across objects and helpful for incremental number
	
	DigitalVideoDisc(String title){
		//DVD for "DVD cannot be played" purpose
		this.title = title;
		this.category = "Unknown";
		this.cost = 0.0f;
		this.director = "Anonymous";
		this.length = 0;
	}
	
	DigitalVideoDisc(String title, String category, float cost){
		//DVD for searching purpose
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.director = "Anonymous";
		this.length = 0;
	}
	
	DigitalVideoDisc(String title, String category, String director, float cost){
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.director = director;
	}

	DigitalVideoDisc(String title, String category, String director, int length, float cost){
		//DVD for displaying & storing full information purpose
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.director = director;
		this.length = length;
	}
	
	public boolean equals(DigitalVideoDisc disc) {
		if (this.title.equals(disc.title) && this.category.equals(disc.category) &&
			this.director.equals(disc.director) && this.length == disc.length && this.cost == disc.cost) {
			return true;
		}
		return false;
	}
	
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	
	public String setTitle(String title) {//used for TestPassingParameter:swap
		this.title = title;
		return this.title; 
	}
}
