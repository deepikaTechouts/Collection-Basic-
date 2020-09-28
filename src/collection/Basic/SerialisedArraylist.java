package collection.Basic;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

public class SerialisedArraylist {

	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<String>();
	     //Adding elements to HashMap
	    arr.add("eleana");
	    arr.add("damon");
	    arr.add("bonnie");
	    arr.add("elizabeth");
		
		try
	    {
	           FileOutputStream fos =
	              new FileOutputStream("arr.ser");
	           ObjectOutputStream oos = new ObjectOutputStream(fos);
	           oos.writeObject(arr);
	           oos.close();
	           fos.close();
	           System.out.printf(" arraylist data is saved in arr.ser");
	    }catch(IOException ioe)
	     {
	           ioe.printStackTrace();
	     }	
		
		
		
		
		
	}

}
