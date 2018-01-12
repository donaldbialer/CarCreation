package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class hashExample {

    public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<>();

        phoneBook.put("John", "4443335555");
        phoneBook.put("Chase", "665442233");
        phoneBook.put("Chasew", "6365442233");


        //String var = phoneBook.get("John");
        //System.out.println(var);

        System.out.println("For Loop:");
        for (Map.Entry me : phoneBook.entrySet()) {
            System.out.println("Key: "+me.getKey() + " & Value: " + me.getValue());
        }
        //WHILE LOOP & ITERATOR
        System.out.println("While Loop:");
        Iterator iterator = phoneBook.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry me2 = (Map.Entry) iterator.next();
            System.out.println("Key: "+me2.getKey() + " & Value: " + me2.getValue());
        }
    }
    }



