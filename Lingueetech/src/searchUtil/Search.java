package searchUtil;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class Search {
	private Index index;
	static final Comparator<Token> comparatorRelevance = new Comparator<Token>() {
	    public int compare(Token t1, Token t2){
	    	
	    	int res = (new Integer(t2.getIDF())).compareTo(new Integer(t1.getIDF()));
	    	if(res!=0) return res;
	    	else{
	    		return t2.getChaine().compareTo(t1.getChaine());
	    	}
	    }
	};
	
	public Search(Index index){
		this.index=index;
	}
	
	public void searchByKeywords(String keywords){
		Set<Token> tokens = tokenize(keywords);
		HashMap<Token, ArrayList<Document>> hashDocs = new HashMap<>();
		HashMap<Document, Integer> hashDocsScore = new HashMap<>();
		for(Token t : tokens){
			ArrayList<Document> listDoc=index.getDocuments(t);
			hashDocs.put(t, listDoc);
			for(Document d : listDoc)
				/**/
		}
	}
}
