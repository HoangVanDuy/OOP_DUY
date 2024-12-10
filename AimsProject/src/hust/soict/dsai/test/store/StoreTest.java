package hust.soict.dsai.test.store;

import hust.soict.dsai.aims.store.Store;
import hust.soict.media.DigitalVideoDisc;

public class StoreTest {
	public static void main(String[] args) {
		Store store = new Store();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc(1, "The Lion King", "Animation", 87, 19.95f, "");

		DigitalVideoDisc dvd2 = new DigitalVideoDisc(2, "Star Wars", "Science Fiction", 87, 24.95f, "");

		DigitalVideoDisc dvd3 = new DigitalVideoDisc(3, "Aladin", "Animation", 34, 18.99f, "");

		// Add dvds to the store
		store.addMedia(dvd3);
		System.out.println("List after adding :");
		store.displayItem();

		// Remove dvd3 from store
		store.removeMedia(dvd3);
		System.out.println("List after deletion :");
		store.displayItem();

	}
}
