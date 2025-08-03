import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Flowpaneex extends Application{
 public static void main(String[] args) {
    launch(args);
 }   
 Button b1,b2,b3;

 public void start(Stage primaryStage){
    b1 = new Button("Button1");
    b2 = new Button("Button2");
    b3 = new Button("Button3");

    FlowPane fp = new FlowPane(Orientation.HORIZONTAL,5,5);
    fp.setPadding(new Insets(5));
    fp.getChildren().addAll(b1,b2,b3);

    Scene  s = new Scene(fp,500,500);
    primaryStage.setScene(s);
    primaryStage.setTitle("Flow pane");
    primaryStage.show();

 }
}
// FlowPane is used to arrange the buttons.
// flowPane.setHgap(10) and flowPane.setVgap(10) set the horizontal and vertical gaps between nodes, respectively.
// Buttons are added to the FlowPane using flowPane.getChildren().addAll(...).
// The Scene is created with the FlowPane as its root, and it is set on the Stage.
// The Stage is then displayed.
// When you run this application, you'll see a window with buttons arranged in a flow, and if the window is resized, the buttons will adjust their positions accordingly.

