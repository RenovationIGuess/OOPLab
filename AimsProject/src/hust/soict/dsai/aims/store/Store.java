package AimsProject.src.hust.soict.dsai.aims.store;

import AimsProject.src.hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;
import java.util.List;

import AimsProject.src.hust.soict.dsai.aims.media.DigitalVideoDisc;

public class Store {
	// DigitalVideoDisc itemsInStore[];
	private List<Media> itemsInStore = new ArrayList<Media>();
	
	public Store() {
		
	}
	
	public void addMedia(Media disc) {
        this.itemsInStore.add(disc);
        System.out.println("Item added successfully");
    }

    public void addMedia(Media ...mediaList) {
        for (Media m : mediaList) {
            this.addMedia(m);
        }
        System.out.println("Add new items successful!");
    }

    public void removeMedia(Media disc) {
        if (this.itemsInStore.contains(disc)) {
            if (this.itemsInStore.remove(disc)) {
                System.out.println("Removed item successfully");
            } else {
                System.out.println("Removed item failed");
            }
        } else {
            System.out.println("Item not found!");
        }
    }

    public void printStore() {
        System.out.println("List of items in store:");
        for (Media m : itemsInStore) {
            System.out.println(m.toString());
        }
//        System.out.println();
    }

    public Media searchStore(String title) {
        for (Media media : this.itemsInStore) {
            if (media.isMatch(title)) {
                return media;
            }
        }
        return null;
    }
}
