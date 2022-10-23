package riverCrossingPack;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;


public class XMLFile2 {
	
	boolean farmer , farmer2, farmer3,farmer4,
    sheep, sheep2, sheep3,
    fatFarmer, fatFarmer2, fatFarmer3,fatFarmer4,
	 ladyFarmer, ladyFarmer2, ladyFarmer3 ,ladyFarmer4,
	 boyFarmer,boyFarmer2,boyFarmer3,boyFarmer4,boat;
	
	String score;
	
	public XMLFile2(boolean farmer, boolean farmer2, boolean farmer3,boolean farmer4, boolean sheep, boolean sheep2, boolean sheep3,
			boolean fatFarmer, boolean fatFarmer2, boolean fatFarmer3,boolean fatFarmer4, boolean ladyFarmer, boolean ladyFarmer2, 
			boolean ladyFarmer3,boolean ladyFarmer4, boolean boyFarmer,boolean boyFarmer2,boolean boyFarmer3,boolean boyFarmer4, boolean boat , String score) throws FileNotFoundException, IOException {

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
		
		if(farmer4) {
			string="true";
		}
		else {
			string = "false";
		}
		
		isVis.setAttribute("farmer4",string);



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


		if(fatFarmer) {
			string="true";
		}
		else {
			string = "false";
		}
		isVis.setAttribute("fatFarmer",string);


		if(fatFarmer2) {
			string="true";
		}
		else {
			string = "false";
		}
		isVis.setAttribute("fatFarmer2",string);


		if(fatFarmer3) {
			string="true";
		}
		else {
			string = "false";
		}
		isVis.setAttribute("fatFarmer3",string);

		if(fatFarmer4) {
			string="true";
		}
		else {
			string = "false";
		}
		isVis.setAttribute("fatFarmer4",string);


		if(ladyFarmer) {
			string="true";
		}
		else {
			string = "false";
		}
		isVis.setAttribute("ladyFarmer",string);


		if(ladyFarmer2) {
			string="true";
		}
		else {
			string = "false";
		}
		isVis.setAttribute("ladyFarmer2",string);

		if(ladyFarmer3) {
			string="true";
		}
		else {
			string = "false";
		}
		isVis.setAttribute("ladyFarmer3",string);
		if(ladyFarmer4) {
			string="true";
		}
		else {
			string = "false";
		}
		isVis.setAttribute("ladyFarmer4",string);
		
		if(boyFarmer) {
			string="true";
		}
		else {
			string = "false";
		}
		isVis.setAttribute("boyFarmer",string);

		if(boyFarmer2) {
			string="true";
		}
		else {
			string = "false";
		}
		isVis.setAttribute("boyFarmer2",string);
		
		if(boyFarmer3) {
			string="true";
		}
		else {
			string = "false";
		}
		isVis.setAttribute("boyFarmer3",string);
		if(boyFarmer4) {
			string="true";
		}
		else {
			string = "false";
		}
		isVis.setAttribute("boyFarmer4",string);



		
		if (boat)
		{
			string="true";
		}
		else
		{
			string = "false";
		}
		
		isVis.setAttribute("boat",string);
		isVis.setAttribute("score",score);
		scene.addContent(isVis);
		theRoot.addContent(scene);
		
		XMLOutputter xmlOutput = new XMLOutputter(Format.getPrettyFormat());
		xmlOutput.output(doc,new FileOutputStream(new File("NewFileTry2.xml")));
	

		}	     
	
}
