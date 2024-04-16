import java.util.Collections;

import java.util.ArrayList;


public class ArraySwap {

	public static void main(String[] args) {
		 ArrayList<String> word = new ArrayList<String>();
	      word.add("Hello");
	      word.add("World");
	      System.out.println("Before Swap the ArrayList ");
	      swapFirstList(word);
	
	}
	private static  void  swapFirstList (ArrayList<String>word) {     
	
	      if(word.size()>1) {
	    	  Collections.swap(word, 1, 0);
	    	  System.out.println(word);
	      }
	      else 
	    	  if(word.size()==1) {
	    		  System.out.println(word);
	      }
	         
	    	  else if(word.size()<1) {
	    		  System.out.println(word);
	      }
	}
	      
	      
	    	  
	    	  

	

}
