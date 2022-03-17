package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Paint;

public class Form1Controller {

	@FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane Form1;

    @FXML
    private Button button1;

    @FXML
    private ImageView imgMode;

    @FXML
    private Label label1;

    
    private Boolean isMode = false;

    @FXML
    void btn1_Click(ActionEvent event) {
    	isMode = !isMode;
    	if ( isMode )
    	{	// Dark mode
	    	Form1.getStylesheets().remove(getClass().getResource("light_mode.css").toExternalForm());
	    	Form1.getStylesheets().add(getClass().getResource("dark_mode.css").toExternalForm());
	    	label1.setTextFill(Paint.valueOf("#E7E7E7"));
	    	label1.setText("Dark Mode");
	    	Image image = new Image("img/light-mode.png");
	    	imgMode.setImage(image);
    	}
    	else 
    	{	// Light mode
    		Form1.getStylesheets().remove(getClass().getResource("dark_mode.css").toExternalForm());
	    	Form1.getStylesheets().add(getClass().getResource("light_mode.css").toExternalForm());
	    	label1.setTextFill(Paint.valueOf("#000000"));
	    	label1.setText("Light Mode");
	    	Image image = new Image("img/dark-mode.png");
	    	imgMode.setImage(image);
    	}
    }

    @FXML
    void initialize() {

    }

}
