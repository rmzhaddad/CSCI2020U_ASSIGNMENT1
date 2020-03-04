import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
/*****************************************************************************************
* 
* 						Name: Ramzi Haddad
* 						StudentId: 100664575
* 
*****************************************************************************************/
public class Q2 extends Application {

	// creating labels
	Label InvestmentAmountLabel = new Label("Investment Amount");
	Label YearsLabel = new Label("Years");
	Label AnnualInterestLabel = new Label("Annual Interest");
	Label FutureValueLabel = new Label("Future Value");
	// creating a button
	Button CalculateValue = new Button("Calculate");
	// creating TextFields
	TextField InvestmentAmountField = new TextField();
	TextField YearsField = new TextField();
	TextField AnnualInterestField = new TextField();
	TextField FutureValueField = new TextField();

	// calculate the future value
	public void setFutureValue() {
		// create value doubles of textfields
		double futureValue;
		double InvestmentAmount = Double.parseDouble(InvestmentAmountField.getText());
		double YearsValue = Double.parseDouble(YearsField.getText());
		double AnnualInterestValue = Double.parseDouble(AnnualInterestField.getText());

		// calculating the monthly Interest rate by dividing the annual rate/1200
		double MonthlyInterestRate = AnnualInterestValue / 1200;
		// setting and calculating the future value field using the formula given in
		// question using Math.pow()
		FutureValueField.setText(
				String.format("$%.2f", (InvestmentAmount * Math.pow(1 + MonthlyInterestRate, YearsValue * 12))));

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// setting up primary stage
		primaryStage.setTitle("Q2");
		// creating and adding children to grid pane
		GridPane gridPane = new GridPane();
		// adding children to grid
		setupGridPane(gridPane);
		// disables the Future text field
		FutureValueField.setEditable(false);
		// setting the button functionality
		CalculateValue.setOnAction(e -> setFutureValue());
		// creating and showing the scene
		Scene scene = new Scene(gridPane, 400, 200);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	// this function will set the location of children in the gridapane
	private void setupGridPane(GridPane gridPane) {
		gridPane.add(InvestmentAmountLabel, 0, 0, 1, 1);
		gridPane.add(InvestmentAmountField, 1, 0, 1, 1);
		gridPane.add(YearsLabel, 0, 1, 1, 1);
		gridPane.add(YearsField, 1, 1, 1, 1);
		gridPane.add(AnnualInterestLabel, 0, 2, 1, 1);
		gridPane.add(AnnualInterestField, 1, 2, 1, 1);
		gridPane.add(FutureValueLabel, 0, 3, 1, 1);
		gridPane.add(FutureValueField, 1, 3, 1, 1);
		gridPane.add(CalculateValue, 0, 4, 2, 2);
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}