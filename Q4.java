
import com.sun.javafx.css.CalculatedValue;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

public class Q4 extends Application {

	// set values for the histogram
	public double[] histovalues = new double[26];

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Histogram");

		// list of characters
		char[] characters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
				'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		// this method will reset the values in histogram for zeros
		resetvalues();

		// names for the x and the y axis
		CategoryAxis xAxis = new CategoryAxis();
		xAxis.setLabel("Series1");

		NumberAxis yAxis = new NumberAxis();
		yAxis.setLabel("Series2");

		//creates series one for the bar.
		XYChart.Series dataSeries1 = new XYChart.Series();
		dataSeries1.setName("Histogram");
		XYChart.Series dataSeries2 = new XYChart.Series();
		dataSeries2.setName("characters");

		// this code will cerate a pain
		FlowPane pane = new FlowPane();
		// this code will create and the label, field and the button
		Label filenamelabel = new Label("File Name");
		TextField filenameField = new TextField();
		Button UpdateData = new Button("UpdateData");
		// this code will create btnonclick action
		UpdateData.setOnAction(e -> {
			ChangeValues(filenameField.getText());
			resetvalues();
			fillData(characters, dataSeries1, filenameField);
		});
		// this function will create and Data in Histogoram values
		fillData(characters, dataSeries1, filenameField);

		// creates the bar chart
		BarChart barChart = new BarChart(xAxis, yAxis);
		// set barchart data
		barChart.getData().add(dataSeries2);
		barChart.getData().add(dataSeries1);
		// Hides the legend
		barChart.setLegendVisible(false);

		// create the container for ui controls
		HBox otherContainer = new HBox();
		// create the vbox for histogram
		VBox histoContainer = new VBox(barChart, otherContainer);
		// add the UI controls to the pane
		otherContainer.getChildren().addAll(filenamelabel, filenameField, UpdateData);
		pane.getChildren().addAll(histoContainer, otherContainer);
		Scene scene = new Scene(pane, 800, 500);

		// setting up and showing the stage.
		primaryStage.setScene(scene);
		primaryStage.setHeight(800);
		primaryStage.setWidth(500);

		primaryStage.show();

	}

	private void resetvalues() {
		// initialize and cleans the histovalues
		for (int x = 0; x < 26; x++) {
			histovalues[x] = 0;
		}
	}

	private void fillData(char[] characters, XYChart.Series dataSeries1, TextField filenameField) {
		// gets the filename and calls in the adjusting method
		String filename = filenameField.getText();
		ChangeValues(filename);
		// fill series one of data
		for (int x = 0; x < histovalues.length; x++) {
			dataSeries1.getData().add(new XYChart.Data("" + characters[x] + "", histovalues[x]));

		}
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

	/*
	 * this function will add the value of the occurrence number of each letter if
	 * match the cases, it update the histovalues increasingly, chars occurrence
	 * will increase the number in the double array based on their values
	 * accordingly, here histovalue[0] means 'a' ,histovalue[1] means 'b'.
	 * ..histovalue[25] means 'z'
	 *
	 */
	public void ChangeValues(String Text) {

		// switch statement to assign data   histovalue[0]=a histovalue[25]=z
		// then it will update the value accordingly
		for (int x = 0; x < Text.length(); x++) {
			switch (Text.charAt(x)) {
			case 'a':
				histovalues[0]++;
				continue;
			case 'b':
				histovalues[1]++;
				continue;
			case 'c':
				histovalues[2]++;
				continue;
			case 'd':
				histovalues[3]++;
				continue;
			case 'e':
				histovalues[4]++;
				continue;
			case 'f':
				histovalues[5]++;
				continue;
			case 'g':
				histovalues[6]++;
				continue;
			case 'h':
				histovalues[7]++;
				continue;
			case 'i':
				histovalues[8]++;
				continue;
			case 'j':
				histovalues[9]++;
				continue;
			case 'k':
				histovalues[10]++;
				continue;
			case 'l':
				histovalues[11]++;
				continue;
			case 'm':
				histovalues[12]++;
				continue;
			case 'n':
				histovalues[13]++;
				continue;
			case 'o':
				histovalues[14]++;
				continue;
			case 'p':
				histovalues[15]++;
				continue;
			case 'q':
				histovalues[16]++;
				continue;
			case 'r':
				histovalues[17]++;
				continue;
			case 's':
				histovalues[18]++;
				continue;
			case 't':
				histovalues[19]++;
				continue;
			case 'u':
				histovalues[20]++;
				continue;
			case 'v':
				histovalues[21]++;
				continue;
			case 'w':
				histovalues[22]++;
				continue;
			case 'x':
				histovalues[23]++;
				continue;
			case 'y':
				histovalues[24]++;
				continue;
			case 'z':
				histovalues[25]++;
				continue;
			}

		}

	}

}