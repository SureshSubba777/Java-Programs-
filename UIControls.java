


import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class UIControls extends Application{


    @Override
    public void start(Stage programStage){
        //create a label name with its textField
        Label name = new Label("Name");
        TextField namField = new TextField("Enter your Name");

        //Label for date of birth and a Datepicker obnject to pick a date 
        Label date = new Label("Date of Birth");
        DatePicker datePicker = new DatePicker();

        //Label for Gender and using radio button too 
        Label Gender = new Label("Gender");

        //create a tooggle group to create a choose option for radio
        ToggleGroup toggleGroup = new ToggleGroup();
        RadioButton male = new RadioButton("Male");
        male.setToggleGroup(toggleGroup);
        RadioButton female = new RadioButton("Female");
        female.setToggleGroup(toggleGroup);

        //Create a label for technology also  setIntermidiate will help tthe check box remain unselected

        Label technology = new Label("Technology");
        CheckBox java = new CheckBox("Java");
        java.setIndeterminate(false);
        CheckBox dotNet = new CheckBox("Dot Net");
        java.setIndeterminate(false);


        //Create a list view object that holds list of value to choose for us using ObservaleList
        Label edu = new Label("Education Qualification");
        ListView<String> eduList = new ListView<>();
        ObservableList<String> data = FXCollections.observableArrayList();
        data.addAll("BIT","Csit","BIM","BCA");
        eduList.setItems(data);//SetItem helps to add list of itmes to list view
        eduList.setPrefSize(100, 100);

        //create a location label with using choice box
        Label location = new Label("Location");
        ChoiceBox<String> LocationChoiceBox = new ChoiceBox<>();
        LocationChoiceBox.getItems().addAll("Kathmandu", "Bhaktapur","Lalitpur");

        Button b1 = new Button("Submit");

        GridPane gp = new GridPane();
        gp.setMinSize(500, 300);

        gp.setPadding(new Insets(10,10,10,10));
        gp.setVgap(5);
        gp.setHgap(5);

        gp.add(name,0,0);
        gp.add(namField,1,0);
        gp.add(date,0,1);
        gp.add(datePicker,1,1);
        gp.add(Gender,0,2);
        gp.add(male,1,2);
        gp.add(female,2,2);
        gp.add(technology,0,3);
        gp.add(java,1,3);
        gp.add(dotNet,2,3);
        gp.add(edu,0,4);
        gp.add(eduList,1,4);
        gp.add(location,0,5);
        gp.add(LocationChoiceBox,1,5);
        gp.add(b1,3,6);

        b1.setStyle("-fx-background-color: blue; -fx-color : 56y;");
        gp.setStyle("-fx-background-color: BEGIE;");

        Scene root = new Scene(gp);
        programStage.setTitle("UI contorls");
        programStage.setScene(root);
        programStage.show();

        
    }
    public static void main(String[] args) {
        launch(args);
    }
}
