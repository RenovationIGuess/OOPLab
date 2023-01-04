package GUIProject.hust.soict.dsai.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Painter extends Application {

    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(
                getClass().getResource("Painter.fxml")
        );
        Scene scene = new Scene(root);
        stage.setTitle("Painter");
        stage.setScene(scene);
        stage.show();
    }

    // --module-path "C:\Hoc\oop\th\OOP\lib\javafx-sdk-19\lib" --add-modules javafx.controls,javafx.fxml

    public static void main(String[] args) {
        launch(args);
    }
}
