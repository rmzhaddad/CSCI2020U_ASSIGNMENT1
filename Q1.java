
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.util.Random;


public class Q1 extends Application {

	
	/*****************************************************************************************
	* 
	* 						Name: Ramzi Haddad
	* 						StudentId: 100664575
	* 
	*****************************************************************************************/
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Q1");
		// Generate a random value
		Random Rand = new Random();

		// creating the imageViews for the children using the random function
		ImageView FirstCard = new ImageView("imageFiles/" + Rand.nextInt(54) + ".png");
		ImageView SecondCard = new ImageView("imageFiles/" + Rand.nextInt(54) + ".png");
		ImageView ThirdCard = new ImageView("imageFiles/" + Rand.nextInt(54) + ".png");
		// resizing the images to fit in hbox

		// first image
		FirstCard.setFitHeight(100);
		FirstCard.setFitWidth(100);
		// Second image
		SecondCard.setFitHeight(100);
		SecondCard.setFitWidth(100);
		// Third image
		ThirdCard.setFitHeight(100);
		ThirdCard.setFitWidth(100);

		// creating the hbox
		HBox hbox = new HBox(FirstCard, SecondCard, ThirdCard);

		// creating and assigning the scene.
		Scene scene = new Scene(hbox);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
