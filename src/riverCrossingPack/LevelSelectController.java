package riverCrossingPack;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LevelSelectController {

	public void onPressLevel1(ActionEvent event) throws IOException
	{
		Parent userPage = FXMLLoader.load(getClass().getResource("NewGame1.fxml"));
		Scene userScene = new Scene(userPage);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(userScene);
		window.show();
	}
	public void onPressLevel2(ActionEvent event) throws IOException
	{
		Parent userPage = FXMLLoader.load(getClass().getResource("NewGame2.fxml"));
		Scene userScene = new Scene(userPage);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(userScene);
		window.show();
	}
	public void onPressBack(ActionEvent event) throws IOException
	{
		Parent userPage = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
		Scene userScene = new Scene(userPage);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(userScene);
		window.show();
	}
	
	
}
