package riverCrossingPack;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HowToPlayController {

	
	public void onPressBack(ActionEvent event) throws IOException
	{
		Parent userPage = FXMLLoader.load(getClass().getResource("Level1.fxml"));
		Scene userScene = new Scene(userPage);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(userScene);
		window.show();
	}

	
	public void onPress2(ActionEvent event) throws IOException
	{
		Parent userPage = FXMLLoader.load(getClass().getResource("Level2.fxml"));
		Scene userScene = new Scene(userPage);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(userScene);
		window.show();
	}
	
}
