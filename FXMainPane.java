import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.collections.ObservableList;
import javafx.stage.Stage;


public class FXMainPane extends VBox {

	public void start(Stage stage) {

		HBox hb1 = new HBox();

		HBox hb2 = new HBox();

		DataManager Dobject=new DataManager();

		TextField tF = new TextField();

		Label labelVal = new Label("FeedBack:");
		
		Button b1 = new Button("Hello");

		b1.setOnAction(new EventHandler<ActionEvent>() {

			@Override public void handle(ActionEvent a)

			{
				tF.setText(Dobject.getHello());
			}
		});

		Button b2 = new Button("Howdy");

		b2.setOnAction(new EventHandler<ActionEvent>() {
			@Override public void handle(ActionEvent a)
			{
				tF.setText(Dobject.getHowdy());
			}
		});

		Button b3 = new Button("Chinese");

		b3.setOnAction(new EventHandler<ActionEvent>()	{
			@Override public void handle(ActionEvent a) {
				tF.setText(Dobject.getChinese());
			}
		});

		Button b4 = new Button("Clear");

		b4.setOnAction(new EventHandler<ActionEvent>() {
			@Override public void handle(ActionEvent a)	{
				tF.setText(" ");
			}
		});

		Button b5 = new Button("Exit");

		b5.setOnAction(new EventHandler<ActionEvent>() {
			@Override public void handle(ActionEvent a)	{
				System.exit(0);
			}
		});

		VBox vBox =new VBox(50);
		vBox.setAlignment(Pos.CENTER);

		Insets keroub = new Insets(20, 20, 20, 20);

		vBox.setSpacing(10);

		VBox.setMargin(tF, new Insets(20, 20, 20, 20));
		VBox.setMargin(b1, new Insets(20, 20, 20, 20));
		VBox.setMargin(b2, new Insets(20, 20, 20, 20));
		VBox.setMargin(b3, new Insets(20, 20, 20, 20));
		VBox.setMargin(b4, new Insets(20, 20, 20, 20));
		VBox.setMargin(b5, new Insets(20, 20, 20, 20));

		hb1.setAlignment(Pos.CENTER);

		hb1.getChildren().addAll(labelVal, tF, hb2);
		
		ObservableList<Node> listVal = vBox.getChildren();

		listVal.addAll(tF, b1,b2,b3,b4,b5,hb1);

		Scene kerb = new Scene(vBox);

		stage.setScene(kerb);

		stage.show();
	}
}