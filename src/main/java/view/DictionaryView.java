package view;

import controller.DictionaryController;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class DictionaryView extends Application {

    private DictionaryController controller = new DictionaryController();

    public void start(Stage stage) {

        Label label = new Label("Enter a word:");
        TextField wordField = new TextField();
        Button searchButton = new Button("Search");
        Label result = new Label();

        FlowPane pane = new FlowPane();

        pane.setPadding(new Insets(10));
        pane.setHgap(10);
        pane.setVgap(10);

        pane.getChildren().add(label);
        pane.getChildren().add(wordField);
        pane.getChildren().add(searchButton);
        pane.getChildren().add(result);

        searchButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String word = wordField.getText();
                result.setText(controller.searchWord(word));
            }
        });

        Scene scene = new Scene(pane, 350, 120);

        stage.setTitle("Virtual Dictionary");
        stage.setScene(scene);
        stage.show();
    }
}