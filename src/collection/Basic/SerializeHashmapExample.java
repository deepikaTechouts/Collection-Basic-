package collection.Basic;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class SerializeHashmapExample {
public static void main(String []args)
{
	 HashMap<Integer, String> hmap = new HashMap<Integer, String>();
     //Adding elements to HashMap
     hmap.put(1, "AB");
     hmap.put(2, "CD");
     hmap.put(3, "EF");
     hmap.put(5, "GH");
     hmap.put(6, "IJ");
	
	try
    {
           FileOutputStream fos =
              new FileOutputStream("hmap.ser");
           ObjectOutputStream oos = new ObjectOutputStream(fos);
           oos.writeObject(hmap);
           oos.close();
           fos.close();
           System.out.printf(" HashMap data is saved in hmap.ser");
    }catch(IOException ioe)
     {
           ioe.printStackTrace();
     }	
	
	}
}
