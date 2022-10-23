package riverCrossingPack;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

import java.awt.Button;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.Text;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
public class Level1Controller {
	Story1 story = Story1.getInstance();
	static int i;
	CareTaker careTaker = new CareTaker();
	Originator origin = new Originator();
/////////////////////////////////////////////////////////////////////////////////////////////
	
	@FXML
	private Label invalid;
	
	@FXML
	private ImageView farmerImage;
	

	@FXML
	private ImageView farmerImage2;
	
	
	@FXML
	private ImageView farmerImage3;
	
	
	@FXML
	private ImageView wolfImage;
	

	@FXML
	private ImageView wolfImage2;
	
	@FXML
	private ImageView wolfImage3;
	
	@FXML
	private ImageView sheepImage;
	

	@FXML
	private ImageView sheepImage2;
	
	@FXML
	private ImageView sheepImage3;
	
	@FXML
	private ImageView plantImage;
	

	@FXML
	private ImageView plantImage2;
	
	@FXML
	private ImageView plantImage3;
		
	@FXML
	private ImageView boatImage;
	
	@FXML
	private ImageView winImage;
	
	@FXML
	private Label score;
	
//	@FXML
//	private Button undoButton;
	//////////////////////////////////////////////////////////////////////////////////////////
	
	XMLFile file;
	
	List<ICrosser> right = new ArrayList<>();
	List<ICrosser> left = new ArrayList<>();
	List<ICrosser> boat = new ArrayList<>();
	
	
	
	public void initialize()
	{
		i=0;
				right = story.getInitialCrossers();
		SAXBuilder builder = new SAXBuilder();
		
        try{
            Document readDoc = builder.build(new File ("NewFileTry.xml"));
            String string = new String();        
            string = readDoc.getRootElement().getChild("scene").getChild("IsVis").getAttributeValue("farmer");
            
            System.out.println(readDoc.getRootElement().getChild("scene").getChild("IsVis").getAttributeValue("farmer2"));
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
            string = readDoc.getRootElement().getChild("scene").getChild("IsVis").getAttributeValue("wolf");
            if (string.equals("true")) {
            	wolfImage.setVisible(true);
            }
            else {
            	wolfImage.setVisible(false);
            }
            string = readDoc.getRootElement().getChild("scene").getChild("IsVis").getAttributeValue("wolf2");
            if (string.equals("true")) {
            	wolfImage2.setVisible(true);
            }
            else {
            	wolfImage2.setVisible(false);
            }
            string = readDoc.getRootElement().getChild("scene").getChild("IsVis").getAttributeValue("wolf3");
            if (string.equals("true")) {
            	wolfImage3.setVisible(true);
            }
            else {
            	wolfImage3.setVisible(false);
            }
            string = readDoc.getRootElement().getChild("scene").getChild("IsVis").getAttributeValue("plant");
            if (string.equals("true")) {
            	plantImage.setVisible(true);
            }
            else {
            	plantImage.setVisible(false);
            }
            string = readDoc.getRootElement().getChild("scene").getChild("IsVis").getAttributeValue("plant2");
            if (string.equals("true")) {
            	plantImage2.setVisible(true);
            }
            else {
            	plantImage2.setVisible(false);
            }
            string = readDoc.getRootElement().getChild("scene").getChild("IsVis").getAttributeValue("plant3");
            if (string.equals("true")) {
            	plantImage3.setVisible(true);
            }
            else {
            	plantImage3.setVisible(false);
            }
            string = readDoc.getRootElement().getChild("scene").getChild("IsVis").getAttributeValue("boat");
            if (string.equals("true")) {
            	boatImage.setX(0);
            }
            else {
            	boatImage.setX(-220);
            	farmerImage.setX(-220);
            	sheepImage.setX(-220);
            	plantImage.setX(-220);
            	wolfImage.setX(-220);
            }
            score.setText(readDoc.getRootElement().getChild("scene").getChild("IsVis").getAttributeValue("score"));
            ArrayList<String> list = new ArrayList<String>();
    		
    		
    	    list.add(Boolean.toString(farmerImage.isVisible()));
    	    list.add(Boolean.toString(farmerImage2.isVisible()));
    	    list.add(Boolean.toString(farmerImage3.isVisible()));
    	    list.add(Boolean.toString(sheepImage.isVisible()));
    	    list.add(Boolean.toString(sheepImage2.isVisible()));
    	    list.add(Boolean.toString(sheepImage3.isVisible()));
    	    list.add(Boolean.toString(wolfImage.isVisible()));
    	    list.add(Boolean.toString(wolfImage2.isVisible()));
    	    list.add(Boolean.toString(wolfImage3.isVisible()));
    	    list.add(Boolean.toString(plantImage.isVisible()));
    	    list.add(Boolean.toString(plantImage2.isVisible()));
    	    list.add(Boolean.toString(plantImage3.isVisible()));
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
		file = new XMLFile(farmerImage.isVisible(), farmerImage2.isVisible(),
				farmerImage3.isVisible(), sheepImage.isVisible(), sheepImage2.isVisible(),
				sheepImage3.isVisible(), wolfImage.isVisible(), wolfImage2.isVisible(),
				wolfImage3.isVisible(), plantImage.isVisible(), plantImage2.isVisible(), plantImage3.isVisible() , boatloc , score.getText());
		Parent userPage = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
		Scene userScene = new Scene(userPage);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(userScene);
		window.show();
	}
	
	
	
	
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void setVisibilityfarmerToBoat()
	{
		invalid.setText("");
		if (boatImage.getX()==0)
		{
ArrayList<String> list = new ArrayList<String>();
			
			
		    list.add(Boolean.toString(farmerImage.isVisible()));
		    list.add(Boolean.toString(farmerImage2.isVisible()));
		    list.add(Boolean.toString(farmerImage3.isVisible()));
		    list.add(Boolean.toString(sheepImage.isVisible()));
		    list.add(Boolean.toString(sheepImage2.isVisible()));
		    list.add(Boolean.toString(sheepImage3.isVisible()));
		    list.add(Boolean.toString(wolfImage.isVisible()));
		    list.add(Boolean.toString(wolfImage2.isVisible()));
		    list.add(Boolean.toString(wolfImage3.isVisible()));
		    list.add(Boolean.toString(plantImage.isVisible()));
		    list.add(Boolean.toString(plantImage2.isVisible()));
		    list.add(Boolean.toString(plantImage3.isVisible()));
		    list.add(Boolean.toString(boatImage.getX()==0));
			origin.setArticle(list);
			careTaker.addMemento(origin.storeInMemento());
			i++;
		farmerImage.setVisible(true);
		farmerImage2.setVisible(false);
		}
		else {
			invalid.setText("Invalid move!!");
		}
		/*ICrosser x = new Farmer();
		int i = 0 ;
		while (i<4) {
			i++;
			if (right.get(i)==x)
			{
				right.remove(i);
				break;
			}
		}
		boat.add(x);*/
	}
	
	public void setVisibilityfarmerToBoat2()
	{
		invalid.setText("");
		if (boatImage.getX()!=0)
		{
ArrayList<String> list = new ArrayList<String>();
			
			
		    list.add(Boolean.toString(farmerImage.isVisible()));
		    list.add(Boolean.toString(farmerImage2.isVisible()));
		    list.add(Boolean.toString(farmerImage3.isVisible()));
		    list.add(Boolean.toString(sheepImage.isVisible()));
		    list.add(Boolean.toString(sheepImage2.isVisible()));
		    list.add(Boolean.toString(sheepImage3.isVisible()));
		    list.add(Boolean.toString(wolfImage.isVisible()));
		    list.add(Boolean.toString(wolfImage2.isVisible()));
		    list.add(Boolean.toString(wolfImage3.isVisible()));
		    list.add(Boolean.toString(plantImage.isVisible()));
		    list.add(Boolean.toString(plantImage2.isVisible()));
		    list.add(Boolean.toString(plantImage3.isVisible()));
		    list.add(Boolean.toString(boatImage.getX()==0));
			origin.setArticle(list);
			careTaker.addMemento(origin.storeInMemento());
			i++;
		farmerImage.setVisible(true);
		farmerImage3.setVisible(false);
		
		}
		else {
			invalid.setText("Invalid move!!");
			System.out.println("aaaaaaa");
		}
	}
	
	public void setVisibilityfarmerFromBoat()
	{
		invalid.setText("");
		if(farmerImage.getX()==0) {
ArrayList<String> list = new ArrayList<String>();
			
			
		    list.add(Boolean.toString(farmerImage.isVisible()));
		    list.add(Boolean.toString(farmerImage2.isVisible()));
		    list.add(Boolean.toString(farmerImage3.isVisible()));
		    list.add(Boolean.toString(sheepImage.isVisible()));
		    list.add(Boolean.toString(sheepImage2.isVisible()));
		    list.add(Boolean.toString(sheepImage3.isVisible()));
		    list.add(Boolean.toString(wolfImage.isVisible()));
		    list.add(Boolean.toString(wolfImage2.isVisible()));
		    list.add(Boolean.toString(wolfImage3.isVisible()));
		    list.add(Boolean.toString(plantImage.isVisible()));
		    list.add(Boolean.toString(plantImage2.isVisible()));
		    list.add(Boolean.toString(plantImage3.isVisible()));
		    list.add(Boolean.toString(boatImage.getX()==0));
			origin.setArticle(list);
			careTaker.addMemento(origin.storeInMemento());
			i++;
		farmerImage.setVisible(false);
		farmerImage2.setVisible(true);
		}
		else {
ArrayList<String> list = new ArrayList<String>();
			
			
		    list.add(Boolean.toString(farmerImage.isVisible()));
		    list.add(Boolean.toString(farmerImage2.isVisible()));
		    list.add(Boolean.toString(farmerImage3.isVisible()));
		    list.add(Boolean.toString(sheepImage.isVisible()));
		    list.add(Boolean.toString(sheepImage2.isVisible()));
		    list.add(Boolean.toString(sheepImage3.isVisible()));
		    list.add(Boolean.toString(wolfImage.isVisible()));
		    list.add(Boolean.toString(wolfImage2.isVisible()));
		    list.add(Boolean.toString(wolfImage3.isVisible()));
		    list.add(Boolean.toString(plantImage.isVisible()));
		    list.add(Boolean.toString(plantImage2.isVisible()));
		    list.add(Boolean.toString(plantImage3.isVisible()));
		    list.add(Boolean.toString(boatImage.getX()==0));
			origin.setArticle(list);
			careTaker.addMemento(origin.storeInMemento());
			i++;
			farmerImage.setVisible(false);
			farmerImage3.setVisible(true);
		}
	}
	
	public void setVisibilityfarmerFromBoat2()
	{
		invalid.setText("");
		if (boatImage.getX()!=0)
		{
ArrayList<String> list = new ArrayList<String>();
			
			
		    list.add(Boolean.toString(farmerImage.isVisible()));
		    list.add(Boolean.toString(farmerImage2.isVisible()));
		    list.add(Boolean.toString(farmerImage3.isVisible()));
		    list.add(Boolean.toString(sheepImage.isVisible()));
		    list.add(Boolean.toString(sheepImage2.isVisible()));
		    list.add(Boolean.toString(sheepImage3.isVisible()));
		    list.add(Boolean.toString(wolfImage.isVisible()));
		    list.add(Boolean.toString(wolfImage2.isVisible()));
		    list.add(Boolean.toString(wolfImage3.isVisible()));
		    list.add(Boolean.toString(plantImage.isVisible()));
		    list.add(Boolean.toString(plantImage2.isVisible()));
		    list.add(Boolean.toString(plantImage3.isVisible()));
		    list.add(Boolean.toString(boatImage.getX()==0));
			origin.setArticle(list);
			careTaker.addMemento(origin.storeInMemento());
			i++;
		farmerImage.setVisible(true);
		farmerImage3.setVisible(false);
		}
		else {
			invalid.setText("Invalid move!!");
			System.out.println("aaaaaaa");
		}
	}
	
	public void setVisibilitysheepToBoat()
	{
		invalid.setText("");
		if (boatImage.getX()==0 && story.stackCheck( plantImage.isVisible() , wolfImage.isVisible() , sheepImage.isVisible()))
		{
			ArrayList<String> list = new ArrayList<String>();
			
			
		    list.add(Boolean.toString(farmerImage.isVisible()));
		    list.add(Boolean.toString(farmerImage2.isVisible()));
		    list.add(Boolean.toString(farmerImage3.isVisible()));
		    list.add(Boolean.toString(sheepImage.isVisible()));
		    list.add(Boolean.toString(sheepImage2.isVisible()));
		    list.add(Boolean.toString(sheepImage3.isVisible()));
		    list.add(Boolean.toString(wolfImage.isVisible()));
		    list.add(Boolean.toString(wolfImage2.isVisible()));
		    list.add(Boolean.toString(wolfImage3.isVisible()));
		    list.add(Boolean.toString(plantImage.isVisible()));
		    list.add(Boolean.toString(plantImage2.isVisible()));
		    list.add(Boolean.toString(plantImage3.isVisible()));
		    list.add(Boolean.toString(boatImage.getX()==0));
			origin.setArticle(list);
			careTaker.addMemento(origin.storeInMemento());
			i++;
			sheepImage.setVisible(true);
		sheepImage2.setVisible(false);
		
		}
		else {
			invalid.setText("Invalid move!!");
			System.out.println("aaaaaaa");
		}
	}
	
	public void setVisibilitysheepToBoat2()
	{
		invalid.setText("");
		if (boatImage.getX()!=0&& story.stackCheck( plantImage.isVisible() , wolfImage.isVisible() , sheepImage.isVisible()))
		{
ArrayList<String> list = new ArrayList<String>();
			
			
		    list.add(Boolean.toString(farmerImage.isVisible()));
		    list.add(Boolean.toString(farmerImage2.isVisible()));
		    list.add(Boolean.toString(farmerImage3.isVisible()));
		    list.add(Boolean.toString(sheepImage.isVisible()));
		    list.add(Boolean.toString(sheepImage2.isVisible()));
		    list.add(Boolean.toString(sheepImage3.isVisible()));
		    list.add(Boolean.toString(wolfImage.isVisible()));
		    list.add(Boolean.toString(wolfImage2.isVisible()));
		    list.add(Boolean.toString(wolfImage3.isVisible()));
		    list.add(Boolean.toString(plantImage.isVisible()));
		    list.add(Boolean.toString(plantImage2.isVisible()));
		    list.add(Boolean.toString(plantImage3.isVisible()));
		    list.add(Boolean.toString(boatImage.getX()==0));
			origin.setArticle(list);
			careTaker.addMemento(origin.storeInMemento());
			i++;
		sheepImage.setVisible(true);
		sheepImage3.setVisible(false);
		}
		else {
			invalid.setText("Invalid move!!");
			System.out.println("aaaaaaa");
		}
	}
	
	public void setVisibilitysheepFromBoat()
	{
		invalid.setText("");
		if(sheepImage.getX()==0) {
ArrayList<String> list = new ArrayList<String>();
			
			
		    list.add(Boolean.toString(farmerImage.isVisible()));
		    list.add(Boolean.toString(farmerImage2.isVisible()));
		    list.add(Boolean.toString(farmerImage3.isVisible()));
		    list.add(Boolean.toString(sheepImage.isVisible()));
		    list.add(Boolean.toString(sheepImage2.isVisible()));
		    list.add(Boolean.toString(sheepImage3.isVisible()));
		    list.add(Boolean.toString(wolfImage.isVisible()));
		    list.add(Boolean.toString(wolfImage2.isVisible()));
		    list.add(Boolean.toString(wolfImage3.isVisible()));
		    list.add(Boolean.toString(plantImage.isVisible()));
		    list.add(Boolean.toString(plantImage2.isVisible()));
		    list.add(Boolean.toString(plantImage3.isVisible()));
		    list.add(Boolean.toString(boatImage.getX()==0));
			origin.setArticle(list);
			careTaker.addMemento(origin.storeInMemento());
			i++;
		sheepImage.setVisible(false);
		sheepImage2.setVisible(true);
		
		}
		else {
ArrayList<String> list = new ArrayList<String>();
			
			
		    list.add(Boolean.toString(farmerImage.isVisible()));
		    list.add(Boolean.toString(farmerImage2.isVisible()));
		    list.add(Boolean.toString(farmerImage3.isVisible()));
		    list.add(Boolean.toString(sheepImage.isVisible()));
		    list.add(Boolean.toString(sheepImage2.isVisible()));
		    list.add(Boolean.toString(sheepImage3.isVisible()));
		    list.add(Boolean.toString(wolfImage.isVisible()));
		    list.add(Boolean.toString(wolfImage2.isVisible()));
		    list.add(Boolean.toString(wolfImage3.isVisible()));
		    list.add(Boolean.toString(plantImage.isVisible()));
		    list.add(Boolean.toString(plantImage2.isVisible()));
		    list.add(Boolean.toString(plantImage3.isVisible()));
		    list.add(Boolean.toString(boatImage.getX()==0));
			origin.setArticle(list);
			careTaker.addMemento(origin.storeInMemento());
			i++;
			sheepImage.setVisible(false);
			sheepImage3.setVisible(true);
		}
		if(plantImage3.isVisible() && wolfImage3.isVisible() && sheepImage3.isVisible())
		{
			winImage.setVisible(true);
//			undoButton.setVisible(false);
		}
	}
	public void setVisibilitywolfToBoat()
	{
		invalid.setText("");
		if (boatImage.getX()==0 && story.stackCheck( plantImage.isVisible() , wolfImage.isVisible() , sheepImage.isVisible()))
		{
ArrayList<String> list = new ArrayList<String>();
			
			
		    list.add(Boolean.toString(farmerImage.isVisible()));
		    list.add(Boolean.toString(farmerImage2.isVisible()));
		    list.add(Boolean.toString(farmerImage3.isVisible()));
		    list.add(Boolean.toString(sheepImage.isVisible()));
		    list.add(Boolean.toString(sheepImage2.isVisible()));
		    list.add(Boolean.toString(sheepImage3.isVisible()));
		    list.add(Boolean.toString(wolfImage.isVisible()));
		    list.add(Boolean.toString(wolfImage2.isVisible()));
		    list.add(Boolean.toString(wolfImage3.isVisible()));
		    list.add(Boolean.toString(plantImage.isVisible()));
		    list.add(Boolean.toString(plantImage2.isVisible()));
		    list.add(Boolean.toString(plantImage3.isVisible()));
		    list.add(Boolean.toString(boatImage.getX()==0));
			origin.setArticle(list);
			careTaker.addMemento(origin.storeInMemento());
			i++;
		wolfImage.setVisible(true);
		wolfImage2.setVisible(false);
		}
		else {
			invalid.setText("Invalid move!!");
			System.out.println("aaaaaaa");
		}
	}
	
	public void setVisibilitywolfToBoat2()
	{
		invalid.setText("");
		if (boatImage.getX()!=0&& story.stackCheck( plantImage.isVisible() , wolfImage.isVisible() , sheepImage.isVisible()))
		{
ArrayList<String> list = new ArrayList<String>();
			
			
		    list.add(Boolean.toString(farmerImage.isVisible()));
		    list.add(Boolean.toString(farmerImage2.isVisible()));
		    list.add(Boolean.toString(farmerImage3.isVisible()));
		    list.add(Boolean.toString(sheepImage.isVisible()));
		    list.add(Boolean.toString(sheepImage2.isVisible()));
		    list.add(Boolean.toString(sheepImage3.isVisible()));
		    list.add(Boolean.toString(wolfImage.isVisible()));
		    list.add(Boolean.toString(wolfImage2.isVisible()));
		    list.add(Boolean.toString(wolfImage3.isVisible()));
		    list.add(Boolean.toString(plantImage.isVisible()));
		    list.add(Boolean.toString(plantImage2.isVisible()));
		    list.add(Boolean.toString(plantImage3.isVisible()));
		    list.add(Boolean.toString(boatImage.getX()==0));
			origin.setArticle(list);
			careTaker.addMemento(origin.storeInMemento());
			i++;
		wolfImage.setVisible(true);
		wolfImage3.setVisible(false);
		}
		else {
			invalid.setText("Invalid move!!");
			System.out.println("aaaaaaa");
		}
	}
	
	public void setVisibilitywolfFromBoat()
	{
		invalid.setText("");
		if(wolfImage.getX()==0) {
ArrayList<String> list = new ArrayList<String>();
			
			
		    list.add(Boolean.toString(farmerImage.isVisible()));
		    list.add(Boolean.toString(farmerImage2.isVisible()));
		    list.add(Boolean.toString(farmerImage3.isVisible()));
		    list.add(Boolean.toString(sheepImage.isVisible()));
		    list.add(Boolean.toString(sheepImage2.isVisible()));
		    list.add(Boolean.toString(sheepImage3.isVisible()));
		    list.add(Boolean.toString(wolfImage.isVisible()));
		    list.add(Boolean.toString(wolfImage2.isVisible()));
		    list.add(Boolean.toString(wolfImage3.isVisible()));
		    list.add(Boolean.toString(plantImage.isVisible()));
		    list.add(Boolean.toString(plantImage2.isVisible()));
		    list.add(Boolean.toString(plantImage3.isVisible()));
		    list.add(Boolean.toString(boatImage.getX()==0));
			origin.setArticle(list);
			careTaker.addMemento(origin.storeInMemento());
			i++;
		wolfImage.setVisible(false);
		wolfImage2.setVisible(true);
		}
		else {
ArrayList<String> list = new ArrayList<String>();
			
			
		    list.add(Boolean.toString(farmerImage.isVisible()));
		    list.add(Boolean.toString(farmerImage2.isVisible()));
		    list.add(Boolean.toString(farmerImage3.isVisible()));
		    list.add(Boolean.toString(sheepImage.isVisible()));
		    list.add(Boolean.toString(sheepImage2.isVisible()));
		    list.add(Boolean.toString(sheepImage3.isVisible()));
		    list.add(Boolean.toString(wolfImage.isVisible()));
		    list.add(Boolean.toString(wolfImage2.isVisible()));
		    list.add(Boolean.toString(wolfImage3.isVisible()));
		    list.add(Boolean.toString(plantImage.isVisible()));
		    list.add(Boolean.toString(plantImage2.isVisible()));
		    list.add(Boolean.toString(plantImage3.isVisible()));
		    list.add(Boolean.toString(boatImage.getX()==0));
			origin.setArticle(list);
			careTaker.addMemento(origin.storeInMemento());
			i++;
			wolfImage.setVisible(false);
			wolfImage3.setVisible(true);
		}
		if(plantImage3.isVisible() && wolfImage3.isVisible() && sheepImage3.isVisible())
		{
			winImage.setVisible(true);
			//undoButton.setVisible(false);
		}
	}
	public void setVisibility5assayaToBoat()
	{
		invalid.setText("");
		if (boatImage.getX()==0 && story.stackCheck( plantImage.isVisible() , wolfImage.isVisible() , sheepImage.isVisible()))
		{
ArrayList<String> list = new ArrayList<String>();
			
			
		    list.add(Boolean.toString(farmerImage.isVisible()));
		    list.add(Boolean.toString(farmerImage2.isVisible()));
		    list.add(Boolean.toString(farmerImage3.isVisible()));
		    list.add(Boolean.toString(sheepImage.isVisible()));
		    list.add(Boolean.toString(sheepImage2.isVisible()));
		    list.add(Boolean.toString(sheepImage3.isVisible()));
		    list.add(Boolean.toString(wolfImage.isVisible()));
		    list.add(Boolean.toString(wolfImage2.isVisible()));
		    list.add(Boolean.toString(wolfImage3.isVisible()));
		    list.add(Boolean.toString(plantImage.isVisible()));
		    list.add(Boolean.toString(plantImage2.isVisible()));
		    list.add(Boolean.toString(plantImage3.isVisible()));
		    list.add(Boolean.toString(boatImage.getX()==0));
			origin.setArticle(list);
			careTaker.addMemento(origin.storeInMemento());
			i++;
		plantImage.setVisible(true);
		plantImage2.setVisible(false);
		}
		else {
			invalid.setText("Invalid move!!");
			System.out.println("aaaaxxxxxxaaa");
		}
	}
	
	public void setVisibility5assayaToBoat2()
	{
		invalid.setText("");
		if (boatImage.getX()!=0&& story.stackCheck( plantImage.isVisible() , wolfImage.isVisible() , sheepImage.isVisible()))
		{
ArrayList<String> list = new ArrayList<String>();
			
			
		    list.add(Boolean.toString(farmerImage.isVisible()));
		    list.add(Boolean.toString(farmerImage2.isVisible()));
		    list.add(Boolean.toString(farmerImage3.isVisible()));
		    list.add(Boolean.toString(sheepImage.isVisible()));
		    list.add(Boolean.toString(sheepImage2.isVisible()));
		    list.add(Boolean.toString(sheepImage3.isVisible()));
		    list.add(Boolean.toString(wolfImage.isVisible()));
		    list.add(Boolean.toString(wolfImage2.isVisible()));
		    list.add(Boolean.toString(wolfImage3.isVisible()));
		    list.add(Boolean.toString(plantImage.isVisible()));
		    list.add(Boolean.toString(plantImage2.isVisible()));
		    list.add(Boolean.toString(plantImage3.isVisible()));
		    list.add(Boolean.toString(boatImage.getX()==0));
			origin.setArticle(list);
			careTaker.addMemento(origin.storeInMemento());
			i++;
		plantImage.setVisible(true);
		plantImage.setVisible(false);
		}
		else {
			invalid.setText("Invalid move!!");
			System.out.println("aaaaaaa");
		}
	}
	
	public void setVisibility5assayaFromBoat()
	{
		invalid.setText("");
		if(plantImage.getX()==0) {
			ArrayList<String> list = new ArrayList<String>();
			
			
		    list.add(Boolean.toString(farmerImage.isVisible()));
		    list.add(Boolean.toString(farmerImage2.isVisible()));
		    list.add(Boolean.toString(farmerImage3.isVisible()));
		    list.add(Boolean.toString(sheepImage.isVisible()));
		    list.add(Boolean.toString(sheepImage2.isVisible()));
		    list.add(Boolean.toString(sheepImage3.isVisible()));
		    list.add(Boolean.toString(wolfImage.isVisible()));
		    list.add(Boolean.toString(wolfImage2.isVisible()));
		    list.add(Boolean.toString(wolfImage3.isVisible()));
		    list.add(Boolean.toString(plantImage.isVisible()));
		    list.add(Boolean.toString(plantImage2.isVisible()));
		    list.add(Boolean.toString(plantImage3.isVisible()));
		    list.add(Boolean.toString(boatImage.getX()==0));
			origin.setArticle(list);
			careTaker.addMemento(origin.storeInMemento());
			i++;

		plantImage.setVisible(false);
		plantImage2.setVisible(true);
		
		}
		else {
ArrayList<String> list = new ArrayList<String>();
			
			
		    list.add(Boolean.toString(farmerImage.isVisible()));
		    list.add(Boolean.toString(farmerImage2.isVisible()));
		    list.add(Boolean.toString(farmerImage3.isVisible()));
		    list.add(Boolean.toString(sheepImage.isVisible()));
		    list.add(Boolean.toString(sheepImage2.isVisible()));
		    list.add(Boolean.toString(sheepImage3.isVisible()));
		    list.add(Boolean.toString(wolfImage.isVisible()));
		    list.add(Boolean.toString(wolfImage2.isVisible()));
		    list.add(Boolean.toString(wolfImage3.isVisible()));
		    list.add(Boolean.toString(plantImage.isVisible()));
		    list.add(Boolean.toString(plantImage2.isVisible()));
		    list.add(Boolean.toString(plantImage3.isVisible()));
		    list.add(Boolean.toString(boatImage.getX()==0));
			origin.setArticle(list);
			careTaker.addMemento(origin.storeInMemento());
			i++;
			plantImage.setVisible(false);
			plantImage3.setVisible(true);

		}
		if(plantImage3.isVisible() && wolfImage3.isVisible() && sheepImage3.isVisible())
		{
			winImage.setVisible(true);
			//undoButton.setVisible(false);
		}
	}

	
	
	
	
	public void Undo()
	{
		if(i>=0)
		{
		System.out.println("alolo");
		ArrayList<String> tempList = new ArrayList<String>();
		tempList=origin.restoreFromMomento(careTaker.getMemento(i-1));
		farmerImage.setVisible(Boolean.parseBoolean(tempList.get(0)));
		farmerImage2.setVisible(Boolean.parseBoolean(tempList.get(1)));
		farmerImage3.setVisible(Boolean.parseBoolean(tempList.get(2)));
		sheepImage.setVisible(Boolean.parseBoolean(tempList.get(3)));
		sheepImage2.setVisible(Boolean.parseBoolean(tempList.get(4)));
		sheepImage3.setVisible(Boolean.parseBoolean(tempList.get(5)));
		wolfImage.setVisible(Boolean.parseBoolean(tempList.get(6)));
		wolfImage2.setVisible(Boolean.parseBoolean(tempList.get(7)));
		wolfImage3.setVisible(Boolean.parseBoolean(tempList.get(8)));
		plantImage.setVisible(Boolean.parseBoolean(tempList.get(9)));
		plantImage2.setVisible(Boolean.parseBoolean(tempList.get(10)));
		plantImage3.setVisible(Boolean.parseBoolean(tempList.get(11)));
		
		if (Boolean.parseBoolean(tempList.get(12)))
		{
			System.out.println("boooooat");
		boatImage.setX(0);
		farmerImage.setX(0);
		sheepImage.setX(0);
		wolfImage.setX(0);
		plantImage.setX(0);
		}
		else
		{
			boatImage.setX(-220);
			farmerImage.setX(-220);
			sheepImage.setX(-220);
			wolfImage.setX(-220);
			plantImage.setX(-220);
				
		}
		i--;
		score.setText((Integer.parseInt(score.getText())+1)+"");
		}
		else
		{
			System.out.println("leh kda bas");
		}
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void onpressmove() throws FileNotFoundException, IOException  {
		

		
		invalid.setText("");
		
		right = story.listreturner(farmerImage2.isVisible() , plantImage2.isVisible() , wolfImage2.isVisible() , sheepImage2.isVisible());
		left = story.listreturner(farmerImage3.isVisible() , plantImage3.isVisible() , wolfImage3.isVisible() , sheepImage3.isVisible());
		boat = story.listreturner(farmerImage.isVisible() , plantImage.isVisible() , wolfImage.isVisible() , sheepImage.isVisible());
		
		
		/*if(boatImage.getX() == 0.0) {
			Collections.copy(right,boat);
		}
		else {
			Collections.copy(left,boat);
		}*/
		
		//story.isValid(left , right , boat);
		
		
		if(story.isValid(right , left , boat))
		{
			score.setText((Integer.parseInt(score.getText())+1)+"");
			ArrayList<String> list = new ArrayList<String>();
			
			
		    list.add(Boolean.toString(farmerImage.isVisible()));
		    list.add(Boolean.toString(farmerImage2.isVisible()));
		    list.add(Boolean.toString(farmerImage3.isVisible()));
		    list.add(Boolean.toString(sheepImage.isVisible()));
		    list.add(Boolean.toString(sheepImage2.isVisible()));
		    list.add(Boolean.toString(sheepImage3.isVisible()));
		    list.add(Boolean.toString(wolfImage.isVisible()));
		    list.add(Boolean.toString(wolfImage2.isVisible()));
		    list.add(Boolean.toString(wolfImage3.isVisible()));
		    list.add(Boolean.toString(plantImage.isVisible()));
		    list.add(Boolean.toString(plantImage2.isVisible()));
		    list.add(Boolean.toString(plantImage3.isVisible()));
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
	             new KeyValue(farmerImage.xProperty(), -220),
                 new KeyValue(farmerImage.yProperty(), 0));
	     
	     KeyFrame end3 = new KeyFrame(SEC_2,
	             new KeyValue(sheepImage.xProperty(), -220),
                 new KeyValue(sheepImage.yProperty(), 0));
	     
	     KeyFrame end4 = new KeyFrame(SEC_2,
	             new KeyValue(wolfImage.xProperty(), -220),
                 new KeyValue(wolfImage.yProperty(), 0));
	     
	     KeyFrame end5 = new KeyFrame(SEC_2,
	             new KeyValue(plantImage.xProperty(), -220),
                 new KeyValue(plantImage.yProperty(), 0));
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
	     timeline.play();
	     
	timeline.setOnFinished(event->    boatImage.setScaleX(-1)
	);
	timeline.setOnFinished(event->    farmerImage.setScaleX(-1)
			);
	timeline.setOnFinished(event->    sheepImage.setScaleX(-1)
			);
	timeline.setOnFinished(event->    wolfImage.setScaleX(-1)
			);
	timeline.setOnFinished(event->    plantImage.setScaleX(-1)
			);
	     }
	     else {
	    	 
	    	 KeyFrame end = new KeyFrame(SEC_2,
	                 new KeyValue(boatImage.xProperty(), 0),
	                 new KeyValue(boatImage.yProperty(), 0));
	    	 KeyFrame end2 = new KeyFrame(SEC_2,
	                 new KeyValue(farmerImage.xProperty(), 0),
	                 new KeyValue(farmerImage.yProperty(), 0));
	    	 KeyFrame end3 = new KeyFrame(SEC_2,
	                 new KeyValue(sheepImage.xProperty(), 0),
	                 new KeyValue(sheepImage.yProperty(), 0));
	    	 KeyFrame end4 = new KeyFrame(SEC_2,
	                 new KeyValue(wolfImage.xProperty(), 0),
	                 new KeyValue(wolfImage.yProperty(), 0));
	    	 KeyFrame end5 = new KeyFrame(SEC_2,
	                 new KeyValue(plantImage.xProperty(), 0),
	                 new KeyValue(plantImage.yProperty(), 0));


	         timeline.getKeyFrames().add(end);
	         timeline.getKeyFrames().add(end2);
	         timeline.getKeyFrames().add(end3);
	         timeline.getKeyFrames().add(end4);
	         timeline.getKeyFrames().add(end5);
	         timeline.play();
	         
	         timeline.setOnFinished(event->    boatImage.setScaleX(1)
	         );
	         timeline.setOnFinished(event->    farmerImage.setScaleX(1)
	    	         );
	         timeline.setOnFinished(event->    sheepImage.setScaleX(1)
	    	         );
	         timeline.setOnFinished(event->    wolfImage.setScaleX(1)
	    	         );
	         timeline.setOnFinished(event->    plantImage.setScaleX(1)
	    	         );
	 		
	     }
	     
	     
	     
	     
	     




	}
		 else {
			 invalid.setText("Invalid move!!");
	    	 System.out.println("lol");
	     }
	}
	
}
