package riverCrossingPack;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainMenuController {

	
	public void onPressStart(ActionEvent event) throws IOException
	{
		Parent userPage = FXMLLoader.load(getClass().getResource("LevelSelect.fxml"));
		Scene userScene = new Scene(userPage);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(userScene);
		window.show();
	}

	public void onPressExit(ActionEvent event) throws IOException
	{
	Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
	window.close();	
	}

	public void onPressHowToPlay(ActionEvent event) throws IOException
	{
		Parent userPage = FXMLLoader.load(getClass().getResource("HowToPlay.fxml"));
		Scene userScene = new Scene(userPage);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(userScene);
		window.show();
	}
	
}
