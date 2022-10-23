package riverCrossingPack;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class NewGame2Controller {
	public void onPressNewGame(ActionEvent event) throws IOException
	{
		XMLFile2 file = new XMLFile2(true,false, false,false,true,false,false, true, false,false, false, true,false, false,
				false,true,false,false,false,true,"0");
		Parent userPage = FXMLLoader.load(getClass().getResource("HowToPlay2.fxml"));
		Scene userScene = new Scene(userPage);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(userScene);
		window.show();
	}
	public void onPressLoadGame(ActionEvent event) throws IOException
	{
		Parent userPage = FXMLLoader.load(getClass().getResource("Level2.fxml"));
		Scene userScene = new Scene(userPage);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(userScene);
		window.show();
	}
	public void onPressBack(ActionEvent event) throws IOException
	{
		Parent userPage = FXMLLoader.load(getClass().getResource("LevelSelect.fxml"));
		Scene userScene = new Scene(userPage);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(userScene);
		window.show();
	}
}
