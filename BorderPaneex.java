import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneex extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    Button b1,b2,b3,b4,b5;
    public void start(Stage pS){
        b1 = new Button("Top");
        b2 = new Button("Bottom");
        b3 = new Button ("Left");
        b4 = new Button("Right");
        b5 = new Button("Center");

        BorderPane root = new BorderPane();
        root.setTop(b1);
        root.setBottom(b2);
        root.setLeft(b3);
        root.setRight(b4);
        root.setCenter(b5);

        Scene s = new Scene(root,500,500);
        pS.setScene(s);
        pS.show();
    }
}

// BorderPane is used to organize buttons in different regions.
// Buttons are created for each region: top, bottom, left, right, and center.
// borderPane.setTop(...), borderPane.setBottom(...), and so on, are used to set the buttons in their respective regions.
// The Scene is created with the BorderPane as its root, and it is set on the Stage.
// The Stage is then displayed.
// When you run this application, you'll see a window with buttons arranged in a BorderPane. The buttons in each region will stay in their respective areas, and the center button will take up the remaining space.
