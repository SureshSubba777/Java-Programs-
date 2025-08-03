import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.geometry.Insets;

public class Hboxex extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    Button b1,b2,b3;

    @Override
    public void start(Stage ps){
        ps.setTitle("Hbox Eg");

        b1 = new Button("Button1");
        b2 = new Button("Button2");
        b3 = new Button("Button3");
        HBox hb = new HBox(10);
        hb.setPadding(new Insets(10));
        hb.getChildren().addAll(b1,b2,b3);
       

        Scene  root = new Scene(hb, 500,500);
        ps.setScene(root);
        ps.show();

    }
}
