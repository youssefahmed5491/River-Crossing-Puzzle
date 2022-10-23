package riverCrossingPack;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.input.SAXBuilder;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Level2Controller {
	
	List<ICrosser> right = new ArrayList<>();
	List<ICrosser> left = new ArrayList<>();
	List<ICrosser> boat = new ArrayList<>();
	
	CareTaker careTaker = new CareTaker();
	Originator origin = new Originator();

	
	static int i;
	Story2 story = Story2.getInstance();
	XMLFile2 file;
	
	@FXML
	private Label invalid;
	
	@FXML
	private ImageView farmerImage;
	

	@FXML
	private ImageView fatFarmerImage;
	
	
	@FXML
	private ImageView ladyFarmerImage;
	
	
	@FXML
	private ImageView boyFarmerImage;
	
	@FXML
	private ImageView sheepImage;
	
	@FXML
	private ImageView farmerImage2;
	

	@FXML
	private ImageView fatFarmerImage2;
	
	
	@FXML
	private ImageView ladyFarmerImage2;
	
	
	@FXML
	private ImageView boyFarmerImage2;
	
	@FXML
	private ImageView sheepImage2;
	
	@FXML
	private ImageView farmerImage3;
	

	@FXML
	private ImageView fatFarmerImage3;
	
	
	@FXML
	private ImageView ladyFarmerImage3;
	
	
	@FXML
	private ImageView boyFarmerImage3;
	
	@FXML
	private ImageView sheepImage3;
	
	@FXML
	private ImageView farmerImage4;
	

	@FXML
	private ImageView fatFarmerImage4;
	
	
	@FXML
	private ImageView ladyFarmerImage4;
	
	
	@FXML
	private ImageView boyFarmerImage4;
	
	@FXML
	private ImageView boatImage;
	
	@FXML
	private ImageView winImage;
	
	@FXML
	private Label score;
	
	public void initialize()
	{
		i=0;
		right = story.getInitialCrossers();
		SAXBuilder builder = new SAXBuilder();
        try{
            Document readDoc = builder.build(new File ("NewFileTry2.xml"));
            String string = new String();        
            string = readDoc.getRootElement().getChild("scene").getChild("IsVis").getAttributeValue("farmer");
            if (string.equals("true")) {
            	farmerImage.setVisible(true);
            }
            else {
            	farmerImage.setVisible(false);
            }
            string = readDoc.getRootElement().getChild("scene").getChild("IsVis").getAttributeValue("farmer2");
            if (string.equals("true")) {
            	farmerImage2.setVisible(true);
            }
            else {
            	farmerImage2.setVisible(false);
            }
            string = readDoc.getRootElement().getChild("scene").getChild("IsVis").getAttributeValue("farmer3");
            if (string.equals("true")) {
            	farmerImage3.setVisible(true);
            }
            else {
            	farmerImage3.setVisible(false);
            }
            string = readDoc.getRootElement().getChild("scene").getChild("IsVis").getAttributeValue("farmer4");
            if (string.equals("true")) {
            	farmerImage4.setVisible(true);
            }
            else {
            	farmerImage4.setVisible(false);
            }
            string = readDoc.getRootElement().getChild("scene").getChild("IsVis").getAttributeValue("sheep");
            if (string.equals("true")) {
            	sheepImage.setVisible(true);
            }
            else {
            	sheepImage.setVisible(false);
            }
            string = readDoc.getRootElement().getChild("scene").getChild("IsVis").getAttributeValue("sheep2");
            if (string.equals("true")) {
            	sheepImage2.setVisible(true);
            }
            else {
            	sheepImage2.setVisible(false);
            }
            string = readDoc.getRootElement().getChild("scene").getChild("IsVis").getAttributeValue("sheep3");
            if (string.equals("true")) {
            	sheepImage3.setVisible(true);
            }
            else {
            	sheepImage3.setVisible(false);
            }
            string = readDoc.getRootElement().getChild("scene").getChild("IsVis").getAttributeValue("fatFarmer");
            if (string.equals("true")) {
            	fatFarmerImage.setVisible(true);
            }
            else {
            	fatFarmerImage.setVisible(false);
            }
            string = readDoc.getRootElement().getChild("scene").getChild("IsVis").getAttributeValue("fatFarmer2");
            if (string.equals("true")) {
            	fatFarmerImage2.setVisible(true);
            }
            else {
            	fatFarmerImage2.setVisible(false);
            }
            string = readDoc.getRootElement().getChild("scene").getChild("IsVis").getAttributeValue("fatFarmer3");
            if (string.equals("true")) {
            	fatFarmerImage3.setVisible(true);
            }
            else {
            	fatFarmerImage3.setVisible(false);
            }
            string = readDoc.getRootElement().getChild("scene").getChild("IsVis").getAttributeValue("fatFarmer4");
            if (string.equals("true")) {
            	fatFarmerImage4.setVisible(true);
            }
            else {
            	fatFarmerImage4.setVisible(false);
            }
            string = readDoc.getRootElement().getChild("scene").getChild("IsVis").getAttributeValue("ladyFarmer");
            if (string.equals("true")) {
            	ladyFarmerImage.setVisible(true);
            }
            else {
            	ladyFarmerImage.setVisible(false);
            }
            string = readDoc.getRootElement().getChild("scene").getChild("IsVis").getAttributeValue("ladyFarmer2");
            if (string.equals("true")) {
            	ladyFarmerImage2.setVisible(true);
            }
            else {
            	ladyFarmerImage2.setVisible(false);
            }
            string = readDoc.getRootElement().getChild("scene").getChild("IsVis").getAttributeValue("ladyFarmer3");
            if (string.equals("true")) {
            	ladyFarmerImage3.setVisible(true);
            }
            else {
            	ladyFarmerImage3.setVisible(false);
            }
            string = readDoc.getRootElement().getChild("scene").getChild("IsVis").getAttributeValue("ladyFarmer4");
            if (string.equals("true")) {
            	ladyFarmerImage4.setVisible(true);
            }
            else {
            	ladyFarmerImage4.setVisible(false);
            }
            string = readDoc.getRootElement().getChild("scene").getChild("IsVis").getAttributeValue("boyFarmer");
            if (string.equals("true")) {
            	boyFarmerImage.setVisible(true);
            }
            else {
            	boyFarmerImage.setVisible(false);
            }
            string = readDoc.getRootElement().getChild("scene").getChild("IsVis").getAttributeValue("boyFarmer2");
            if (string.equals("true")) {
            	boyFarmerImage2.setVisible(true);
            }
            else {
            	boyFarmerImage2.setVisible(false);
            }
            string = readDoc.getRootElement().getChild("scene").getChild("IsVis").getAttributeValue("boyFarmer3");
            if (string.equals("true")) {
            	boyFarmerImage3.setVisible(true);
            }
            else {
            	boyFarmerImage3.setVisible(false);
            }
            string = readDoc.getRootElement().getChild("scene").getChild("IsVis").getAttributeValue("boyFarmer4");
            if (string.equals("true")) {
            	boyFarmerImage4.setVisible(true);
            }
            else {
            	boyFarmerImage4.setVisible(false);
            }
            string = readDoc.getRootElement().getChild("scene").getChild("IsVis").getAttributeValue("boat");
            if (string.equals("true")) {
            	boatImage.setX(0);
            }
            else {
            	boatImage.setX(-220);
            	farmerImage2.setX(-220);
            	sheepImage2.setX(-220);
            	fatFarmerImage2.setX(-220);
            	ladyFarmerImage2.setX(-220);
            	boyFarmerImage2.setX(-220);
            	farmerImage3.setX(-220);
            	sheepImage3.setX(-220);
            	fatFarmerImage3.setX(-220);
            	ladyFarmerImage3.setX(-220);
            	boyFarmerImage3.setX(-220);
            }
 ArrayList<String> list = new ArrayList<String>();
			
			
		    list.add(Boolean.toString(farmerImage.isVisible()));
		    list.add(Boolean.toString(farmerImage2.isVisible()));
		    list.add(Boolean.toString(farmerImage3.isVisible()));
		    list.add(Boolean.toString(farmerImage4.isVisible()));
		    list.add(Boolean.toString(sheepImage.isVisible()));
		    list.add(Boolean.toString(sheepImage2.isVisible()));
		    list.add(Boolean.toString(sheepImage3.isVisible()));
		    list.add(Boolean.toString(fatFarmerImage.isVisible()));
		    list.add(Boolean.toString(fatFarmerImage2.isVisible()));
		    list.add(Boolean.toString(fatFarmerImage3.isVisible()));
		    list.add(Boolean.toString(fatFarmerImage4.isVisible()));
		    list.add(Boolean.toString(ladyFarmerImage.isVisible()));
		    list.add(Boolean.toString(ladyFarmerImage2.isVisible()));
		    list.add(Boolean.toString(ladyFarmerImage3.isVisible()));
		    list.add(Boolean.toString(ladyFarmerImage4.isVisible()));
		    list.add(Boolean.toString(boyFarmerImage.isVisible()));
		    list.add(Boolean.toString(boyFarmerImage2.isVisible()));
		    list.add(Boolean.toString(boyFarmerImage3.isVisible()));
		    list.add(Boolean.toString(boyFarmerImage4.isVisible()));
		    list.add(Boolean.toString(boatImage.getX()==0));
			origin.setArticle(list);
			careTaker.addMemento(origin.storeInMemento());
			i++;
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
		

	}


	boolean boatloc=true;
	public void onPressExit(ActionEvent event) throws IOException
	{
		
		
		if (boatImage.getX()==0)
		{
			boatloc= true;
		}
		else
		{
		boatloc=false;	
		}
		file = new XMLFile2(farmerImage.isVisible(), farmerImage2.isVisible(),
				farmerImage3.isVisible(),farmerImage4.isVisible(), sheepImage.isVisible(), sheepImage2.isVisible(),
				sheepImage3.isVisible(), fatFarmerImage.isVisible(), fatFarmerImage2.isVisible(),
				fatFarmerImage3.isVisible(),fatFarmerImage4.isVisible(), ladyFarmerImage.isVisible(),
				ladyFarmerImage2.isVisible(), ladyFarmerImage3.isVisible() ,ladyFarmerImage4.isVisible(),
				boyFarmerImage.isVisible(),boyFarmerImage2.isVisible(),boyFarmerImage3.isVisible(),boyFarmerImage4.isVisible(), boatloc, score.getText());
		
		Parent userPage = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
		Scene userScene = new Scene(userPage);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(userScene);
		window.show();
	}
	
	public void undo()
	{
		if(i>=0)
		{
		System.out.println("alolo");
		ArrayList<String> tempList = new ArrayList<String>();
		tempList=origin.restoreFromMomento(careTaker.getMemento(i-1));
		farmerImage.setVisible(Boolean.parseBoolean(tempList.get(0)));
		farmerImage2.setVisible(Boolean.parseBoolean(tempList.get(1)));
		farmerImage3.setVisible(Boolean.parseBoolean(tempList.get(2)));
		farmerImage4.setVisible(Boolean.parseBoolean(tempList.get(3)));
		sheepImage.setVisible(Boolean.parseBoolean(tempList.get(4)));
		sheepImage2.setVisible(Boolean.parseBoolean(tempList.get(5)));
		sheepImage3.setVisible(Boolean.parseBoolean(tempList.get(6)));
		fatFarmerImage.setVisible(Boolean.parseBoolean(tempList.get(7)));
		fatFarmerImage2.setVisible(Boolean.parseBoolean(tempList.get(8)));
		fatFarmerImage3.setVisible(Boolean.parseBoolean(tempList.get(9)));
		fatFarmerImage4.setVisible(Boolean.parseBoolean(tempList.get(10)));
		ladyFarmerImage.setVisible(Boolean.parseBoolean(tempList.get(11)));
		ladyFarmerImage2.setVisible(Boolean.parseBoolean(tempList.get(12)));
		ladyFarmerImage3.setVisible(Boolean.parseBoolean(tempList.get(13)));
		ladyFarmerImage4.setVisible(Boolean.parseBoolean(tempList.get(14)));
		boyFarmerImage.setVisible(Boolean.parseBoolean(tempList.get(15)));
		boyFarmerImage2.setVisible(Boolean.parseBoolean(tempList.get(16)));
		boyFarmerImage3.setVisible(Boolean.parseBoolean(tempList.get(17)));
		boyFarmerImage4.setVisible(Boolean.parseBoolean(tempList.get(18)));
		if (Boolean.parseBoolean(tempList.get(19)))
		{
			System.out.println("boooooat");
		boatImage.setX(0);
		farmerImage2.setX(0);
		sheepImage2.setX(0);
		fatFarmerImage2.setX(0);
		ladyFarmerImage2.setX(0);
		boyFarmerImage2.setX(0);
		farmerImage3.setX(0);
		fatFarmerImage3.setX(0);
		ladyFarmerImage3.setX(0);
		boyFarmerImage3.setX(0);
		
		}
		else
		{
			boatImage.setX(-220);
			farmerImage2.setX(-220);
			sheepImage2.setX(-220);
			fatFarmerImage2.setX(-220);
			ladyFarmerImage2.setX(-220);
			boyFarmerImage2.setX(-220);
			farmerImage3.setX(-220);
			fatFarmerImage3.setX(-220);
			ladyFarmerImage3.setX(-220);
			boyFarmerImage3.setX(-220);
				
		}
		score.setText((Integer.parseInt(score.getText())+1)+"");
		i--;
		}
		else
		{
			System.out.println("leh kda bas");
		}
	}
	
	public void setVisibilityfarmerToBoat()
	{
		invalid.setText("");
		if (boatImage.getX()==0)
		{
			if(!(fatFarmerImage2.isVisible()||ladyFarmerImage2.isVisible()||boyFarmerImage2.isVisible()))
			{
				farmerImage2.setVisible(true);
				farmerImage.setVisible(false);
			}
			else if (!(fatFarmerImage3.isVisible()||ladyFarmerImage3.isVisible()||boyFarmerImage3.isVisible()))
			{
				farmerImage3.setVisible(true);
				farmerImage.setVisible(false);
			}
			
		}
		
		else {
			invalid.setText("Invalid move!!");
		}
	
	}
	
	public void setVisibilityfatfarmerToBoat()
	{
		invalid.setText("");
		if (boatImage.getX()==0)
		{
			if(!(farmerImage2.isVisible()||ladyFarmerImage2.isVisible()||boyFarmerImage2.isVisible()))
			{
				fatFarmerImage2.setVisible(true);
				fatFarmerImage.setVisible(false);
			}
			else if(!(farmerImage3.isVisible()||ladyFarmerImage3.isVisible()||boyFarmerImage3.isVisible()))
			{
				fatFarmerImage3.setVisible(true);
				fatFarmerImage.setVisible(false);
			}
			
		}
		
		else {
			invalid.setText("Invalid move!!");
		}
	
	}
	
	public void setladyVisibilityfarmerToBoat()
	{
		invalid.setText("");
		if (boatImage.getX()==0)
		{
			if(!(fatFarmerImage2.isVisible()||farmerImage2.isVisible()||boyFarmerImage2.isVisible()))
			{
				ladyFarmerImage2.setVisible(true);
				ladyFarmerImage.setVisible(false);
			}
			else if(!(fatFarmerImage3.isVisible()||farmerImage3.isVisible()||boyFarmerImage3.isVisible()))
			{
				ladyFarmerImage3.setVisible(true);
				ladyFarmerImage.setVisible(false);
			}
			
		}
		
		else {
			invalid.setText("Invalid move!!");
		}
	
	}
	public void setVisibilityboyfarmerToBoat()
	{
		invalid.setText("");
		if (boatImage.getX()==0)
		{
			if(!(fatFarmerImage2.isVisible()||ladyFarmerImage2.isVisible()||farmerImage2.isVisible()))
			{
				boyFarmerImage2.setVisible(true);
				boyFarmerImage.setVisible(false);
			}
			else if(!(fatFarmerImage3.isVisible()||ladyFarmerImage3.isVisible()||farmerImage3.isVisible()))
			{
				boyFarmerImage3.setVisible(true);
				boyFarmerImage.setVisible(false);
			}
			
		}
		
		else {
			invalid.setText("Invalid move!!");
		}
	
	}
	public void setVisibilitysheepToBoat()
	{
		invalid.setText("");
		if (boatImage.getX()==0)
		{
			if(!(fatFarmerImage3.isVisible()||ladyFarmerImage3.isVisible()||boyFarmerImage3.isVisible()||farmerImage3.isVisible()))
			{
				sheepImage2.setVisible(true);
				sheepImage.setVisible(false);
			}
			
			
		}
		
		else {
			invalid.setText("Invalid move!!");
		}
	
	}
	
	
	
	
	
	public void setVisibilityfarmerFromBoat()
	{
	invalid.setText("");
		if(boatImage.getX()==0) {
			if(farmerImage2.isVisible()) {
		farmerImage2.setVisible(false);
		farmerImage.setVisible(true);
		}
			else
			{
				farmerImage3.setVisible(false);
				farmerImage.setVisible(true);
			}
		}
		else {
			farmerImage2.setVisible(false);
			farmerImage3.setVisible(false);
			farmerImage4.setVisible(true);
		}
		if(farmerImage4.isVisible()&&fatFarmerImage4.isVisible()&&ladyFarmerImage4.isVisible()&&boyFarmerImage4.isVisible()&&sheepImage3.isVisible())
		{
			winImage.setVisible(true);
		}
	}
	public void setVisibilityfatfarmerFromBoat()
	{
		invalid.setText("");
		if(boatImage.getX()==0) {
			if(fatFarmerImage2.isVisible()) {
		fatFarmerImage2.setVisible(false);
		fatFarmerImage.setVisible(true);
		}
			else
			{
				fatFarmerImage3.setVisible(false);
				fatFarmerImage.setVisible(true);
			}
		}
		else {
			fatFarmerImage2.setVisible(false);
			fatFarmerImage3.setVisible(false);
			fatFarmerImage4.setVisible(true);}
		if(farmerImage4.isVisible()&&fatFarmerImage4.isVisible()&&ladyFarmerImage4.isVisible()&&boyFarmerImage4.isVisible()&&sheepImage3.isVisible())
		{
			winImage.setVisible(true);
		}
	}
	public void setVisibilityboyfarmerFromBoat()
	{
		invalid.setText("");
		if(boatImage.getX()==0) {
			if(boyFarmerImage2.isVisible()) {
		boyFarmerImage2.setVisible(false);
		boyFarmerImage.setVisible(true);
		}
			else
			{
				boyFarmerImage3.setVisible(false);
				boyFarmerImage.setVisible(true);
			}
		}
		else {
			boyFarmerImage2.setVisible(false);
	 	    boyFarmerImage3.setVisible(false);
		    boyFarmerImage4.setVisible(true);}
		if(farmerImage4.isVisible()&&fatFarmerImage4.isVisible()&&ladyFarmerImage4.isVisible()&&boyFarmerImage4.isVisible()&&sheepImage3.isVisible())
		{
			winImage.setVisible(true);
		}
	}
	public void setVisibilityladyfarmerFromBoat()
	{
		invalid.setText("");
		if(boatImage.getX()==0) {
			if(ladyFarmerImage2.isVisible()) {
		ladyFarmerImage2.setVisible(false);
		ladyFarmerImage.setVisible(true);
		}
			else
			{
				ladyFarmerImage3.setVisible(false);
				ladyFarmerImage.setVisible(true);
			}
		}
		else {
			ladyFarmerImage2.setVisible(false);
			ladyFarmerImage3.setVisible(false);
			ladyFarmerImage4.setVisible(true);
			}
		if(farmerImage4.isVisible()&&fatFarmerImage4.isVisible()&&ladyFarmerImage4.isVisible()&&boyFarmerImage4.isVisible()&&sheepImage3.isVisible())
		{
			winImage.setVisible(true);
		}
	}
	public void setVisibilitysheepFromBoat()
	{
		invalid.setText("");
		if(boatImage.getX()==0) {
		sheepImage2.setVisible(false);
		sheepImage.setVisible(true);
		}
		else {
			sheepImage2.setVisible(false);
			sheepImage3.setVisible(true);
		}
		if(farmerImage4.isVisible()&&fatFarmerImage4.isVisible()&&ladyFarmerImage4.isVisible()&&boyFarmerImage4.isVisible()&&sheepImage3.isVisible())
		{
			winImage.setVisible(true);
		}
	}
	
	
	
	public void setVisibilityfarmerToBoat2()
	{
		invalid.setText("");
		if (boatImage.getX()!=0)
		{
			if(!(fatFarmerImage2.isVisible()||ladyFarmerImage2.isVisible()||boyFarmerImage2.isVisible()))
			{
				farmerImage2.setVisible(true);
				farmerImage4.setVisible(false);
			}
			else if (!(fatFarmerImage3.isVisible()||ladyFarmerImage3.isVisible()||boyFarmerImage3.isVisible()))
			{
				farmerImage3.setVisible(true);
				farmerImage4.setVisible(false);
			}
			
		}
		
		
		else {
			invalid.setText("Invalid move!!");
		}
	
	}
	
	public void setVisibilityfatfarmerToBoat2()
	{
		invalid.setText("");
		if (boatImage.getX()!=0)
		{
			if(!(farmerImage2.isVisible()||ladyFarmerImage2.isVisible()||boyFarmerImage2.isVisible()))
			{
				fatFarmerImage2.setVisible(true);
				fatFarmerImage4.setVisible(false);
			}
			else if(!(farmerImage3.isVisible()||ladyFarmerImage3.isVisible()||boyFarmerImage3.isVisible()))
			{
				fatFarmerImage3.setVisible(true);
				fatFarmerImage4.setVisible(false);
			}
			
		}
		
		else {
			invalid.setText("Invalid move!!");
		}
	
	}
	
	public void setladyVisibilityfarmerToBoat2()
	{
		invalid.setText("");
		if (boatImage.getX()!=0)
		{
			if(!(fatFarmerImage2.isVisible()||farmerImage2.isVisible()||boyFarmerImage2.isVisible()))
			{
				ladyFarmerImage2.setVisible(true);
				ladyFarmerImage4.setVisible(false);
			}
			else if(!(fatFarmerImage3.isVisible()||farmerImage3.isVisible()||boyFarmerImage3.isVisible()))
			{
				ladyFarmerImage3.setVisible(true);
				ladyFarmerImage4.setVisible(false);
			}
			
		}
		
		else {
			invalid.setText("Invalid move!!");
		}
	
	}
	public void setVisibilityboyfarmerToBoat2()
	{
		invalid.setText("");
		if (boatImage.getX()!=0)
		{
			if(!(fatFarmerImage2.isVisible()||ladyFarmerImage2.isVisible()||farmerImage2.isVisible()))
			{
				boyFarmerImage2.setVisible(true);
				boyFarmerImage4.setVisible(false);
			}
			else if(!(fatFarmerImage3.isVisible()||ladyFarmerImage3.isVisible()||farmerImage3.isVisible()))
			{
				boyFarmerImage3.setVisible(true);
				boyFarmerImage4.setVisible(false);
			}
			
		}
		
		else {
			invalid.setText("Invalid move!!");
		}
	
	}
	public void setVisibilitysheepToBoat2()
	{
		invalid.setText("");
		if (boatImage.getX()!=0)
		{
			if(!(fatFarmerImage3.isVisible()||ladyFarmerImage3.isVisible()||boyFarmerImage3.isVisible()||farmerImage3.isVisible()))
			{
				sheepImage2.setVisible(true);
				sheepImage3.setVisible(false);
			}
			
			
		}
		
		else {
			invalid.setText("Invalid move!!");
		}
	
	}
	
	
	
	
	
	
	
public void onpressmove()  {
		
		invalid.setText("");
		
	    right = story.listreturner(fatFarmerImage.isVisible() , farmerImage.isVisible() , ladyFarmerImage.isVisible() ,boyFarmerImage.isVisible() ,sheepImage.isVisible());
	    left = story.listreturner(fatFarmerImage4.isVisible() , farmerImage4.isVisible() , ladyFarmerImage4.isVisible() ,boyFarmerImage4.isVisible() ,sheepImage3.isVisible());
	    boat = story.listreturner(fatFarmerImage2.isVisible()||fatFarmerImage3.isVisible() , farmerImage2.isVisible()||farmerImage3.isVisible() , ladyFarmerImage2.isVisible()||ladyFarmerImage3.isVisible() ,boyFarmerImage2.isVisible()||boyFarmerImage3.isVisible() ,sheepImage2.isVisible());
		
	    
	    
	    if (story.isValid(right, left, boat))
	    {
	    	score.setText((Integer.parseInt(score.getText())+1)+"");
            ArrayList<String> list = new ArrayList<String>();
			
			
		    list.add(Boolean.toString(farmerImage.isVisible()));
		    list.add(Boolean.toString(farmerImage2.isVisible()));
		    list.add(Boolean.toString(farmerImage3.isVisible()));
		    list.add(Boolean.toString(farmerImage4.isVisible()));
		    list.add(Boolean.toString(sheepImage.isVisible()));
		    list.add(Boolean.toString(sheepImage2.isVisible()));
		    list.add(Boolean.toString(sheepImage3.isVisible()));
		    list.add(Boolean.toString(fatFarmerImage.isVisible()));
		    list.add(Boolean.toString(fatFarmerImage2.isVisible()));
		    list.add(Boolean.toString(fatFarmerImage3.isVisible()));
		    list.add(Boolean.toString(fatFarmerImage4.isVisible()));
		    list.add(Boolean.toString(ladyFarmerImage.isVisible()));
		    list.add(Boolean.toString(ladyFarmerImage2.isVisible()));
		    list.add(Boolean.toString(ladyFarmerImage3.isVisible()));
		    list.add(Boolean.toString(ladyFarmerImage4.isVisible()));
		    list.add(Boolean.toString(boyFarmerImage.isVisible()));
		    list.add(Boolean.toString(boyFarmerImage2.isVisible()));
		    list.add(Boolean.toString(boyFarmerImage3.isVisible()));
		    list.add(Boolean.toString(boyFarmerImage4.isVisible()));
		    list.add(Boolean.toString(boatImage.getX()==0));
			origin.setArticle(list);
			careTaker.addMemento(origin.storeInMemento());
			i++;
	    TranslateTransition BoatTransition=new TranslateTransition();

		 final Duration SEC_2 = Duration.millis(1500);

	     Timeline timeline = new Timeline();
	     if(boatImage.getX()==0) 
	     {

	     KeyFrame end = new KeyFrame(SEC_2,
	             new KeyValue(boatImage.xProperty(), -220),
	             new KeyValue(boatImage.yProperty(), 0));
	    
	     KeyFrame end2 = new KeyFrame(SEC_2,
	             new KeyValue(farmerImage2.xProperty(), -220),
                 new KeyValue(farmerImage2.yProperty(), 0));
	     
	     KeyFrame end3 = new KeyFrame(SEC_2,
	             new KeyValue(sheepImage2.xProperty(), -220),
                 new KeyValue(sheepImage2.yProperty(), 0));
	     
	     KeyFrame end4 = new KeyFrame(SEC_2,
	             new KeyValue(fatFarmerImage2.xProperty(), -220),
                 new KeyValue(fatFarmerImage2.yProperty(), 0));
	     
	     KeyFrame end5 = new KeyFrame(SEC_2,
	             new KeyValue(ladyFarmerImage2.xProperty(), -220),
                 new KeyValue(ladyFarmerImage2.yProperty(), 0));
	     KeyFrame end6 = new KeyFrame(SEC_2,
	             new KeyValue(boyFarmerImage2.xProperty(), -220),
                 new KeyValue(boyFarmerImage2.yProperty(), 0));
	     KeyFrame end7 = new KeyFrame(SEC_2,
	             new KeyValue(farmerImage3.xProperty(), -220),
                 new KeyValue(farmerImage3.yProperty(), 0));
	     
	     KeyFrame end9 = new KeyFrame(SEC_2,
	             new KeyValue(fatFarmerImage3.xProperty(), -220),
                 new KeyValue(fatFarmerImage3.yProperty(), 0));
	     
	     KeyFrame end10 = new KeyFrame(SEC_2,
	             new KeyValue(ladyFarmerImage3.xProperty(), -220),
                 new KeyValue(ladyFarmerImage3.yProperty(), 0));
	     KeyFrame end11 = new KeyFrame(SEC_2,
	             new KeyValue(boyFarmerImage3.xProperty(), -220),
                 new KeyValue(boyFarmerImage3.yProperty(), 0));
         /*
         new KeyValue(boatImage.xProperty(), -220),
         new KeyValue(boatImage.yProperty(), 0));
         new KeyValue(boatImage.xProperty(), -220),
         new KeyValue(boatImage.yProperty(), 0));
*/
	     timeline.getKeyFrames().add(end);
	     timeline.getKeyFrames().add(end2);
	     timeline.getKeyFrames().add(end3);
	     timeline.getKeyFrames().add(end4);
	     timeline.getKeyFrames().add(end5);
	     timeline.getKeyFrames().add(end6);
	     timeline.getKeyFrames().add(end7);
	     timeline.getKeyFrames().add(end9);
	     timeline.getKeyFrames().add(end10);
	     timeline.getKeyFrames().add(end11);
	     timeline.play();
	     
	timeline.setOnFinished(event->    boatImage.setScaleX(-1)
	);
	timeline.setOnFinished(event->    farmerImage2.setScaleX(-1)
			);
	timeline.setOnFinished(event->    sheepImage2.setScaleX(-1)
			);
	timeline.setOnFinished(event->    fatFarmerImage2.setScaleX(-1)
			);
	timeline.setOnFinished(event->    ladyFarmerImage2.setScaleX(-1)
			);
	timeline.setOnFinished(event->    boyFarmerImage2.setScaleX(-1)
			);
	timeline.setOnFinished(event->    farmerImage3.setScaleX(-1)
			);
	timeline.setOnFinished(event->    fatFarmerImage3.setScaleX(-1)
			);
	timeline.setOnFinished(event->    ladyFarmerImage3.setScaleX(-1)
			);
	timeline.setOnFinished(event->    boyFarmerImage3.setScaleX(-1)
			);
	     }
	     else {
	    	 
	    	 KeyFrame end = new KeyFrame(SEC_2,
	                 new KeyValue(boatImage.xProperty(), 0),
	                 new KeyValue(boatImage.yProperty(), 0));
	    	 KeyFrame end2 = new KeyFrame(SEC_2,
	                 new KeyValue(farmerImage2.xProperty(), 0),
	                 new KeyValue(farmerImage2.yProperty(), 0));
	    	 KeyFrame end3 = new KeyFrame(SEC_2,
	                 new KeyValue(sheepImage2.xProperty(), 0),
	                 new KeyValue(sheepImage2.yProperty(), 0));
	    	 KeyFrame end4 = new KeyFrame(SEC_2,
	                 new KeyValue(fatFarmerImage2.xProperty(), 0),
	                 new KeyValue(fatFarmerImage2.yProperty(), 0));
	    	 KeyFrame end5 = new KeyFrame(SEC_2,
	                 new KeyValue(ladyFarmerImage2.xProperty(), 0),
	                 new KeyValue(ladyFarmerImage2.yProperty(), 0));
	    	 KeyFrame end6 = new KeyFrame(SEC_2,
	                 new KeyValue(boyFarmerImage2.xProperty(), 0),
	                 new KeyValue(boyFarmerImage2.yProperty(), 0));
	    	 KeyFrame end7 = new KeyFrame(SEC_2,
	                 new KeyValue(farmerImage3.xProperty(), 0),
	                 new KeyValue(farmerImage3.yProperty(), 0));
	    	 KeyFrame end9 = new KeyFrame(SEC_2,
	                 new KeyValue(fatFarmerImage3.xProperty(), 0),
	                 new KeyValue(fatFarmerImage3.yProperty(), 0));
	    	 KeyFrame end10 = new KeyFrame(SEC_2,
	                 new KeyValue(ladyFarmerImage3.xProperty(), 0),
	                 new KeyValue(ladyFarmerImage3.yProperty(), 0));
	    	 KeyFrame end11 = new KeyFrame(SEC_2,
	                 new KeyValue(boyFarmerImage3.xProperty(), 0),
	                 new KeyValue(boyFarmerImage3.yProperty(), 0));


	         timeline.getKeyFrames().add(end);
	         timeline.getKeyFrames().add(end2);
	         timeline.getKeyFrames().add(end3);
	         timeline.getKeyFrames().add(end4);
	         timeline.getKeyFrames().add(end5);
	         timeline.getKeyFrames().add(end6);
	         timeline.getKeyFrames().add(end7);
	         timeline.getKeyFrames().add(end9);
	         timeline.getKeyFrames().add(end10);
	         timeline.getKeyFrames().add(end11);
	         
	         timeline.play();
	         
	         timeline.setOnFinished(event->    boatImage.setScaleX(1)
	         );
	         timeline.setOnFinished(event->    farmerImage2.setScaleX(1)
	    	         );
	         timeline.setOnFinished(event->    sheepImage2.setScaleX(1)
	    	         );
	         timeline.setOnFinished(event->    fatFarmerImage2.setScaleX(1)
	    	         );
	         timeline.setOnFinished(event->    ladyFarmerImage2.setScaleX(1)
	    	         );
	         timeline.setOnFinished(event->    boyFarmerImage2.setScaleX(1)
	    	         );   	 

	         timeline.setOnFinished(event->    farmerImage3.setScaleX(1)
	    	         );
	         timeline.setOnFinished(event->    fatFarmerImage3.setScaleX(1)
	    	         );
	         timeline.setOnFinished(event->    ladyFarmerImage3.setScaleX(1)
	    	         );
	         timeline.setOnFinished(event->    boyFarmerImage3.setScaleX(1)
	    	         );   	 
	     
	         
	     }


	}
		else {
			 invalid.setText("Invalid move!!");
	    	 System.out.println("lol");
	     }
}
}

