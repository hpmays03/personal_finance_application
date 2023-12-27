package hpmays03;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    Stage stage;
    Scene scene;
    HBox root;
    public App() {
        root = new HBox();
    }
    public void init() {

    }
    @Override
    public void start(Stage stage) throws IOException {
        this.stage = stage;
        scene = new Scene(root, 1280, 720);
        stage.setTitle("Personal Finance");
        stage.setScene(scene);
        stage.setOnCloseRequest(event -> Platform.exit());
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}