package riverCrossingPack;

import java.util.ArrayList;

public class Originator {

	    private ArrayList<String> list=new ArrayList<String>();

	    public void setArticle(ArrayList<String> list) {
	        System.out.println("From The Originator : Current Version of Article\n"+list+"\n");
	        this.list = list;
	    }
	    public Memento storeInMemento(){
	        System.out.println("From The Originator : Saving to Memento");
	        return new Memento(list);
	    }
	    public ArrayList<String> restoreFromMomento(Memento memento){
	        list = memento.getArticle();
	        System.out.println("From Originator: Previous Article Saved in Memento\n"+list+"\n");
	        return list;
	    }
	}
	

