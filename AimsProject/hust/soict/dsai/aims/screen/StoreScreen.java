package AimsProject.hust.soict.dsai.aims.screen;

import AimsProject.src.hust.soict.dsai.aims.cart.Cart;
import AimsProject.src.hust.soict.dsai.aims.media.Media;
import AimsProject.src.hust.soict.dsai.aims.media.Playable;
import AimsProject.src.hust.soict.dsai.aims.store.Store;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

import javax.naming.LimitExceededException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class StoreScreen extends ScreenControl {
    private Store store;
    private Cart cart;

    JPanel createCenter() {
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(3, 3, 2, 2));
        ObservableList<Media> mediaInStore = store.getItemsInStore();

        for (int i = 0; i < mediaInStore.size(); ++i) {
            MediaStore cell = new MediaStore(mediaInStore.get(i));
            center.add(cell);
        }

        return center;
    }

    public class MediaStore extends JPanel {
        private Media media;
        public MediaStore(Media media) {
            this.media = media;
            // ArrayList<Media> mediaInCart = cart.getItemsInCart();
            this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

            JLabel title = new JLabel(media.getTitle());
            title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 20));
            title.setAlignmentX(CENTER_ALIGNMENT);

            JLabel cost = new JLabel("" + media.getCost() + "$");
            cost.setAlignmentX(CENTER_ALIGNMENT);

            JPanel container = new JPanel();
            container.setLayout(new FlowLayout(FlowLayout.CENTER));

            JButton addToCartBtn = new JButton("Add to cart");
            addToCartBtn.addActionListener(new addToCartBtnListener(media));
            container.add(addToCartBtn);
            if (media instanceof Playable) {
                JButton playBtn = new JButton("Play");
                playBtn.addActionListener(new playButtonListener(media.getTitle()));
                container.add(playBtn);
            }

            this.add(Box.createVerticalGlue());
            this.add(title);
            this.add(cost);
            this.add(Box.createVerticalGlue());
            this.add(container);

            this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        }
    }

    private class playButtonListener implements ActionListener {
        private String title;

        public playButtonListener(String title) {
            this.title = title;
        }

        public void actionPerformed(ActionEvent e) {
            JDialog d = new JDialog(StoreScreen.this, this.title + " is now being played...", true);
            JButton b = new JButton("Cancel");
            d.setLayout(new GridBagLayout());
            GridBagConstraints c = new GridBagConstraints();
            b.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    d.setVisible(false);
                }
            });
            d.add(new JLabel("Click here to escape"));
            // c.fill = GridBagConstraints.HORIZONTAL;
            c.insets = new Insets(0, 10, 0, 0);
            d.add(b, c);
            d.setSize(300, 100);
            d.setLocationRelativeTo(StoreScreen.this);
            d.setVisible(true);
        }
    }

    private class addToCartBtnListener implements ActionListener {
        private Media media;

        public addToCartBtnListener(Media media) {
            this.media = media;
        }

        public void actionPerformed(ActionEvent e) {
            try {
                cart.addMedia(this.media);
            } catch (LimitExceededException ex) {
                throw new RuntimeException(ex);
            }
            JDialog d = new JDialog(StoreScreen.this, "Add item to cart successful!", true);
            JButton b = new JButton("Cancel");
            d.setLayout(new GridBagLayout());
            GridBagConstraints c = new GridBagConstraints();
            b.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    d.setVisible(false);
                }
            });
            d.add(new JLabel("Click here to escape"));
            c.insets = new Insets(0, 10, 0, 0);
            d.add(b, c);
            d.setSize(300, 100);
            d.setLocationRelativeTo(StoreScreen.this);
            d.setVisible(true);
        }
    }

    public StoreScreen(Store store, Cart cart) {
        super();
        setStoreScreen(this);
        setCurrentScreen(this);
        this.store = store;
        this.cart = cart;
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        cp.add(createNorth(), BorderLayout.NORTH);
        cp.add(createCenter(), BorderLayout.CENTER);

        setVisible(true);
        setTitle("Store");
        setSize(1024, 768);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        store.getItemsInStore().addListener(
                new ListChangeListener<Media>() {
                    @Override
                    public void onChanged(Change<? extends Media> change) {
                        BorderLayout layout = (BorderLayout)cp.getLayout();
                        cp.remove(layout.getLayoutComponent(BorderLayout.CENTER));
                        cp.add(createCenter(),BorderLayout.CENTER);
                        cp.repaint();
                        cp.revalidate();
                    }
                }
        );
    }
}
