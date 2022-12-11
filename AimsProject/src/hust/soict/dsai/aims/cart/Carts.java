package AimsProject.src.hust.soict.dsai.aims.cart;

import AimsProject.src.hust.soict.dsai.aims.media.DigitalVideoDisc;
import AimsProject.src.hust.soict.dsai.aims.media.Media;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Carts {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private List<Media> itemsOrdered = new ArrayList<Media>();

    public void addMedia(Media newMedia) {
        if (this.itemsOrdered.size() >= MAX_NUMBERS_ORDERED) {
            System.out.println("The order is full!");
        } else {
            if (this.itemsOrdered.contains((newMedia))) {
                System.out.println("This item has already existed!");
            } else {
                this.itemsOrdered.add(newMedia);
                System.out.println("Add item to cart successful!");
            }
        }
    }

    public void addMedia(Media mediaList[]) {
        if (itemsOrdered.size() + mediaList.length >= MAX_NUMBERS_ORDERED) {
            System.out.println("Not enough space left to add " + mediaList.length + " items!");
        } else {
            for (Media m : mediaList) {
                this.addMedia(m);
            }
            System.out.println("Add " + mediaList.length + " items successful!");
        }
    }

    public void addMedia(Media m1, Media m2) {
        if (itemsOrdered.size() + 2 >= MAX_NUMBERS_ORDERED) {
            System.out.println("Not enough space left to add 2 items!");
        } else {
            this.addMedia(m1);
            this.addMedia(m2);
            System.out.println("Add items successful!");
        }
    }

    public void removeMedia(Media medToDel) {
        if (this.itemsOrdered.size() == 0) {
            System.out.println("Nothing to delete!");
        } else {
            if (this.itemsOrdered.contains(medToDel)) {
                if (this.itemsOrdered.remove(medToDel)) {
                    System.out.println("Delete successful!");
                } else {
                    System.out.println("Delete failed!");
                }
            } else {
                System.out.println("Item not found!");
            }
        }
    }

    public float totalCost() {
        float total = 0.0f;
//        if (this.itemsOrdered.size() == 0) {
//            System.out.println("Empty! Nothing in your order list.");
//        } else {
        for (Media m : this.itemsOrdered) {
            total += m.getCost();
        }
//        }
        return total;
    }

    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        if (this.itemsOrdered.size() != 0) {
            for (Media m : itemsOrdered) {
                System.out.println(m.toString());
            }
        } else System.out.println("Empty! Nothing in your order list.");
        System.out.println("Total cost: " + this.totalCost());
        System.out.println("***************************************************");
        // System.out.println();
    }

    public void searchCart(String title) {
        List<Media> findResult = new ArrayList<Media>();

        for (Media m : this.itemsOrdered) {
            if (m.isMatch(title)) {
                findResult.add(m);
            }
        }

        if (findResult.size() > 0) {
            System.out.println("Result:");
            for (Media m : findResult) {
                System.out.println(m.toString());
            }
//            System.out.println();
        } else {
            System.out.println("No items found!");
        }
    }
//
    public void searchCart(int id) {
        if (id <= 0) {
            System.out.println("Invalid ID!");
        } else {
            List<Media> findResult = new ArrayList<Media>();

            for (Media media : this.itemsOrdered) {
                if (media.isMatch(id)) {
                    findResult.add(media);
                }
            }
            if (findResult.size() > 0) {
                System.out.println("Results:");
                for (Media media : findResult) {
                    System.out.println(media.toString());
                }
//                System.out.println();
            } else {
                System.out.println("No items found!");
            }
        }
    }

    public void sortByCostTitle() {
        Collections.sort(this.itemsOrdered, Media.COMPARE_BY_COST_TITLE);
        System.out.println("List after sort:");
        for (Media m : this.itemsOrdered) {
            System.out.println(m.toString());
        }
    }

    public void sortByTitleCost() {
        Collections.sort(this.itemsOrdered, Media.COMPARE_BY_TITLE_COST);
        System.out.println("List after sort:");
        for (Media m : this.itemsOrdered) {
            System.out.println(m.toString());
        }
    }

    public int getNumberOfOrderedItems() {
        return this.itemsOrdered.size();
    }

    public Media getOneMedia(String title) {
        for (Media m : this.itemsOrdered) {
            if (m.isMatch(title)) {
                return m;
            }
        }
        return null;
    }

    public Media getOneMedia(int id) {
        for (Media m : this.itemsOrdered) {
            if (m.isMatch(id)) {
                return m;
            }
        }
        return null;
    }

    public void emptyCart() {
        this.itemsOrdered.clear();
    }
}
