import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

public class Example_1 extends Application {
     public static void main(String[] args) {
        launch(args);
     }
     @Override 
     public void start(Stage primaryStage){
        primaryStage.setTitle("Simple JavaFx App1");
        Button clickme = new Button("Clickme");
        Label messageLabel = new Label();
        clickme.setOnAction(e -> {
            messageLabel.setText("Button Clicked");
            e.getSource();
        });
        StackPane root = new StackPane();
        root.getChildren().addAll(clickme,messageLabel);

        Scene scene = new Scene(root,500,500);
        primaryStage.setScene(scene);

        primaryStage.show();
     }
}
