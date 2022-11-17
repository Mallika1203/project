import java.util.*;  
class treemap{  
 public static void main(String args[]){  
   TreeMap<String,String> names=new TreeMap<String,String>();    
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

      System.out.println("TreeMap elements:");
	  System.out.println(names);   
      
      /* iterating treemap */
      
      for(Map.Entry m:names.entrySet()){    
       System.out.println("Key: " +m.getKey()+", Value: "+m.getValue());    
      }    
 }  
} 