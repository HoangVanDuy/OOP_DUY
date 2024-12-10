package hust.soict.media;

import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.media.book;

public class test {
	public static void main(String[] args) {
		ArrayList<String> listAuthor = new ArrayList<>();
		listAuthor.add("To Hoai");
		listAuthor.add("Pham Tuan");
		listAuthor.add("Pham Duy");
		ArrayList<track> listTrack = new ArrayList<>();
		track trk1 = new track("Co don", 2);
		listTrack.add(trk1);
		Cart cart = new Cart();

		book Book = new book(1, "", "Tat Den", 3.14f, listAuthor);
		DigitalVideoDisc dvd = new DigitalVideoDisc(2, "Pham Tuan", "Em cua ngay hom qua", 20f, 2f, "f");
		CompactDisc cd = new CompactDisc(3, "Anh", "Minh", 10f, 10f, "", "Mi", listTrack);

		cart.addMedia(dvd);
		cart.addMedia(cd);
		cart.addMedia(Book);
		System.out.println("\n");

		cart.sortByCostTitle();
		cart.sortByTitleCost();

	}
}
