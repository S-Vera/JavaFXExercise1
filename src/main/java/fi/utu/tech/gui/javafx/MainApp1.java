package fi.utu.tech.gui.javafx;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp1 extends MainApp{
	
    protected Parent createWindow() {
        return new fi.utu.tech.gui.javafx.teht1_A1_A2.PassWordWindow();
    }
	
    public void start(Stage stage) throws Exception {
        System.out.println("Stage C");
        ResourceLoader<Parent, FXMLController> loader = new ResourceLoader<>("scene.fxml");
        loader.controller.setLabel("Welcome!");

        // configure the menu to create windows with createWindow
        loader.controller.setWindowFactory(this::createWindow);

        Scene scene = new Scene(loader.root);
        scene.getStylesheets().add(createStyle());
        
        stage.setTitle("JavaFX template");
        stage.setScene(scene);
        stage.show();
        System.out.println("Stage D");
    }

}
