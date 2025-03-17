
/**
 * Write a description of class Item here.
 * 
 * @author Wiebe 
 * @version 1.2
 */
import java.util.ArrayList;
public class Item implements ItemInterface{
    //Implemented in your own way
    
    String description;
    String name;
    
    public Item (String itemName, String itemDescription) {
        name = itemName;
        description = itemDescription;
    }
    
    public Item (){
        name = "Longbow";
        description = "A bow that's long, duh";
    }
    
    public String getName (){
        return name;
    }
    
    public String getDescription(){
        return description;
    }
}
