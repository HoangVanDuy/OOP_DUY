package hust.soict.media;

public class DigitalVideoDisc extends disc implements Playable {
	private static int nbDigitalVideoDisc = 0;

	@Override
	public String toString() {
		return "DVD : id = " + getId() + " - " + "title = " + getTitle() + " - " + "category = " + getCategory()
				+ " - " + "cost = " + getCost() + " - " + "length = " + getLength() + " - " + "director = "
				+ getDirector();
	}

	public DigitalVideoDisc(int id, String title, String category, float cost, float length, String director) {
		super(id, title, category, cost, length, director);

	}

	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
}