import java.util.*;
import java.util.stream.*;
import java.util.Map.*;
 
class sortmap
{
    // Program to convert names to an array in Java
    public static void main(String[] args)
    {
        Map<String, String> names = new HashMap<>();
        names.put("SE20UCSE086","Mallika");    
        names.put("SE20UCSE087","Malveeka");    
        names.put("SE20UCSE088","Manoj");    
        names.put("SE20UCSE089","Manas");
        names.put("SE20UCSE090","Manasa");   
        names.put("SE20UCSE090","Maneesh");  
        names.put("SE20UCSE091","Siddhant");
        names.put("SE20UCSE092","Amogha");
        names.put("SE20UCSE093","Shashwat");  
        names.put("SE20UCSE094","Sravanthi");
        names.put("SE20UCSE095","Pranav");

        System.out.println("HashMap elements:");
	    System.out.println(names); 

        TreeMap<String, String> sorted = new TreeMap<>(names); 
        Set<Entry<String, String>> mappings = sorted.entrySet(); 
        System.out.println("HashMap after sorting by keys in ascending order: "); 
        for(Entry<String, String> mapping : mappings){ 
            System.out.println(mapping.getKey() + " - " + mapping.getValue()); 
        }

        

        

    }
}