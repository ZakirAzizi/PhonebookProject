package homebookproject;

import java.util.Arrays;
import java.util.Objects;

public class directory {

   person[] book = new person [0];
   private Objects alphabet;
   
   public void addperson(person newperson) {
	   person [] temp = new person [book.length + 1];
	    
	    for (int i = 0; i < book.length; i++) {
	    	temp[i] = book[i];
	    	
	    	temp[temp.length - 1  = newperson;{
	    			book = temp;
	    	
	    }
      public void printAlpabetArray(person[] list) {
    	  String[] alphabet = new String [list.length];
    	  for (int i = 0; i < list.length; i++) {
    		  alphabet[i] = list[i].getFirstName();
    		  
    		  
    		  
    		  Arrays.sort(alphabet);
    		  for (int i1 = 0; < lphabet.length; i1++) {
    			  for (int j = 0; i1 < book.length; j++) {
    				  boolean l;
					if  (alphabet[i1] = book[j].void getFirstName() {
    					  book[j].getperson();
    				  }
    		  
    	  
      
	}


