package riverCrossingPack;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;


public class XMLFile {
	
	boolean farmer , farmer2, farmer3,
    sheep, sheep2, sheep3,
    wolf, wolf2, wolf3,
	 plant, plant2, plant3 , boat;
	
	String score;
	
	
	
	public XMLFile(boolean farmer, boolean farmer2, boolean farmer3, boolean sheep, boolean sheep2, boolean sheep3,
			boolean wolf, boolean wolf2, boolean wolf3, boolean plant, boolean plant2, boolean plant3, boolean boat , String score) throws FileNotFoundException, IOException {

				Document doc = new Document();
		Element theRoot = new Element("Visibility");
		doc.setRootElement(theRoot);
		//Element scene[] = new Element[1000];
		//scene[i]=new Element("Scene");
		Element scene = new Element("scene");
		Element isVis = new Element("IsVis");
		String string = new String();
		if(farmer) {
			string="true";
		}
		else {
			string = "false";
		}
		isVis.setAttribute("farmer",string);


		if(farmer2) {
			string="true";
		}
		else {
			string = "false";
		}
		isVis.setAttribute("farmer2",string);


		if(farmer3) {
			string="true";
		}
		else {
			string = "false";
		}
		isVis.setAttribute("farmer3",string);



		if(sheep) {
			string="true";
		}
		else {
			string = "false";
		}
		isVis.setAttribute("sheep",string);


		if(sheep2) {
			string="true";
		}
		else {
			string = "false";
		}
		isVis.setAttribute("sheep2",string);


		if(sheep3) {
			string="true";
		}
		else {
			string = "false";
		}
		isVis.setAttribute("sheep3",string);


		if(wolf) {
			string="true";
		}
		else {
			string = "false";
		}
		isVis.setAttribute("wolf",string);


		if(wolf2) {
			string="true";
		}
		else {
			string = "false";
		}
		isVis.setAttribute("wolf2",string);


		if(wolf3) {
			string="true";
		}
		else {
			string = "false";
		}
		isVis.setAttribute("wolf3",string);


		if(plant) {
			string="true";
		}
		else {
			string = "false";
		}
		isVis.setAttribute("plant",string);


		if(plant2) {
			string="true";
		}
		else {
			string = "false";
		}
		isVis.setAttribute("plant2",string);


		if(plant3) {
			string="true";
		}
		else {
			string = "false";
		}
		
		isVis.setAttribute("plant3",string);
		
		if (boat)
		{
			string="true";
		}
		else
		{
			string = "false";
		}
		
		isVis.setAttribute("boat",string);
		isVis.setAttribute("score", score);
		scene.addContent(isVis);
		theRoot.addContent(scene);
		
		XMLOutputter xmlOutput = new XMLOutputter(Format.getPrettyFormat());
		xmlOutput.output(doc,new FileOutputStream(new File("NewFileTry.xml")));
	

		}	     
	
}

