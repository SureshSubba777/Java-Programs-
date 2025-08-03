// import javafx.application.Application;
// import javafx.geometry.Insets;
// import javafx.geometry.Pos;
// import javafx.scene.Scene;
// import javafx.scene.control.*;
// import javafx.scene.control.Menu;
// import javafx.scene.control.MenuBar;
// import javafx.scene.control.MenuItem;
// import javafx.scene.image.Image;
// import javafx.scene.image.ImageView;
// import javafx.scene.layout.*;
// import javafx.stage.FileChooser;
// import javafx.stage.Stage;
// import java.io.File;

// public class ProfileLoginApp extends Application {

//     private ImageView profileImageView;

//     @Override
//     public void start(Stage primaryStage) {
//         primaryStage.setTitle("Profile Login");

//         // ---------- Profile Picture ----------
//         profileImageView = new ImageView();
//         profileImageView.setFitWidth(100);
//         profileImageView.setFitHeight(100);
//         profileImageView.setStyle("-fx-border-color: gray; -fx-border-width: 2; -fx-background-color: #eee;");
//         Tooltip.install(profileImageView, new Tooltip("Upload a profile picture"));
//         // Set a default placeholder image (replace with your image path if needed)
//         profileImageView.setImage(new Image("https://via.placeholder.com/100"));

//         profileImageView.setOnMouseClicked(e -> {
//             FileChooser fileChooser = new FileChooser();
//             fileChooser.setTitle("Choose Profile Picture");
//             fileChooser.getExtensionFilters().addAll(
//                     new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.jpeg")
//             );
//             File file = fileChooser.showOpenDialog(primaryStage);
//             if (file != null) {
//                 profileImageView.setImage(new Image(file.toURI().toString()));
//             }
//         });

//         // ---------- Username & Password ----------
//         TextField usernameField = new TextField();
//         usernameField.setPromptText("Username");

//         PasswordField passwordField = new PasswordField();
//         passwordField.setPromptText("Password");

//         // ---------- Subjects CheckBoxes ----------
//         CheckBox subJava = new CheckBox("Java");
//         CheckBox subDB = new CheckBox("Database");
//         CheckBox subNetwork = new CheckBox("Networking");
//         HBox subjectsBox = new HBox(10, subJava, subDB, subNetwork);

//         // ---------- Gender RadioButtons ----------
//         RadioButton male = new RadioButton("Male");
//         RadioButton female = new RadioButton("Female");
//         ToggleGroup genderGroup = new ToggleGroup();
//         male.setToggleGroup(genderGroup);
//         female.setToggleGroup(genderGroup);
//         HBox genderBox = new HBox(10, male, female);

//         // ---------- Menu (Faculty) ----------
//         Menu facultyMenu = new Menu("Faculty");
//         MenuItem bca = new MenuItem("BCA");
//         MenuItem bit = new MenuItem("BIT");
//         MenuItem csit = new MenuItem("CSIT");
//         facultyMenu.getItems().addAll(bca, bit, csit);

//         MenuBar menuBar = new MenuBar(facultyMenu);

//         // ---------- Forget Password ----------
//         Hyperlink forgetLink = new Hyperlink("Forget Password?");

//         // ---------- Login Button ----------
//         Button loginBtn = new Button("Login");
//         loginBtn.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-weight: bold;");

//         VBox formBox = new VBox(12,
//                 profileImageView,
//                 usernameField,
//                 passwordField,
//                 new Label("Select Subjects:"), subjectsBox,
//                 new Label("Gender:"), genderBox,
//                 forgetLink,
//                 loginBtn
//         );
//         formBox.setAlignment(Pos.CENTER);
//         formBox.setPadding(new Insets(20));

//         BorderPane root = new BorderPane();
//         root.setTop(menuBar);
//         root.setCenter(formBox);

//         Scene scene = new Scene(root, 400, 500);
//         // Optional: Add CSS file
//         // scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

//         primaryStage.setScene(scene);
//         primaryStage.show();
//     }

//     public static void main(String[] args) {
//         launch(args);
//     }
// }