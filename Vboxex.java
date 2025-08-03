import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Vboxex extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    Button b1,b2,b3;

    @Override
    public void start(Stage ps){
        ps.setTitle("VBox eg");
        b1 = new Button("Button1");
        b2 = new Button("Button2");
        b3 = new Button("Button3");

        VBox vb = new VBox(5);
        vb.setPadding(new Insets(10));
        vb.getChildren().addAll(b1,b2,b3);

        Scene root = new Scene(vb, 500,500);
        ps.setScene(root);
        ps.show();  
    }
}
