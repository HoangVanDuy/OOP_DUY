package hust.soict.media;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import hust.soict.media.media;

public class vidu {
	public static void main(String[] args) {
		// Khởi tạo danh sách đối tượng Media
		ArrayList<media> mediaList = new ArrayList<>();
		mediaList.add(new media(1, "cd", "Duy", 15.0f));
		mediaList.add(new media(2, "cd", "Title1", 20.0f));
		mediaList.add(new media(3, "cd", "Title1", 10.0f));

		// Khởi tạo Comparator
		Comparator<media> comparator = new MediaComparatorByTitleCost();

		// Sắp xếp danh sách sử dụng Comparator
		Collections.sort(mediaList, comparator);

		// In danh sách sau khi sắp xếp
		for (media media : mediaList) {
			System.out.println(media);
		}
	}
}
