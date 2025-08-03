import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneeg extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    Button b1, b2, b3;

    public void start(Stage Ps){
        Ps.setTitle("GridPane");
        b1 = new Button("Button1");
        b2 = new Button("Button2");
        b3 = new Button("Button3");

        GridPane gp = new GridPane(5,5);
        gp.setPadding(new Insets(10,10,10,10));

        gp.add(b1, 1, 0);
        gp.add(b2,0,1);
        gp.add(b3, 1, 1);

        gp.setHgap(10);
        gp.setVgap(10);

        Scene root = new Scene(gp,500,500);
        Ps.setScene(root);
        Ps.show();

        
    }
}
