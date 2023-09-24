import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Fruit> fruitMap = new HashMap<>();

        // Adding fruits to the map with their names as keys
        Fruit[] fruitsArray = Utils.getFruits();
        for (Fruit fruit : fruitsArray) {
            fruitMap.put(fruit.getName(), fruit);
        }

        // Printing the size of the map
        System.out.println("Size of the map: " + fruitMap.size());

        // Accessing a specific fruit by name
        String fruitName = "Banana";
        Fruit banana = fruitMap.get(fruitName);
        System.out.println(fruitName + ": " + banana);

        // Iterating over the map and printing all fruits
        System.out.println("=====================================");
        for (Map.Entry<String, Fruit> entry : fruitMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("=====================================");

        // =========== SortedMap ===========
        SortedMap<String, Fruit> sortedFruitMap = new TreeMap<>();
        for (Fruit fruit : fruitsArray) {
            sortedFruitMap.put(fruit.getName(), fruit);
        }
        
        System.out.println("=== Printing sorted map ====");
        for (Map.Entry<String, Fruit> entry : sortedFruitMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("=====================================");

        // Printing the size of the sorted map
        System.out.println("Size of the sorted map: " + sortedFruitMap.size());

        // Accessing the first and last fruits (in sorted order)
        System.out.println("First fruit: " + sortedFruitMap.firstKey());
        System.out.println("Last fruit: " + sortedFruitMap.lastKey());

        // Getting a submap of fruits within a specified range
        SortedMap<String, Fruit> subMap = sortedFruitMap.subMap("Banana", "Orange");
        System.out.println("Fruits in the range [Banana, Orange]:");
        for (Fruit fruit : subMap.values()) {
            System.out.println(fruit);
        }

        // ========= NavigableMap =========
        System.out.println("=====================================");
        System.out.println("=== NavigableMap ===");
        System.out.println("=====================================");

        NavigableMap<String, Fruit> navigableMap = new TreeMap<>();

        for (Fruit fruit : fruitsArray) {
            navigableMap.put(fruit.getName(), fruit);
        }

        // Get the first fruit (lowest element)
        System.out.println("First fruit: " + navigableMap.firstEntry().getValue());
        System.out.println("First key: " + navigableMap.firstKey());

        // Get the last fruit (highest element)
        System.out.println("Last fruit: " + navigableMap.lastEntry().getValue());
        System.out.println("Last key: " + navigableMap.lastKey());

        // Getting the closest fruit greater than or equal to a specified key
        String searchKey = "Mango";
        NavigableMap<String, Fruit> tailMap = navigableMap.tailMap(searchKey, false);
        if (!tailMap.isEmpty()) {
            System.out.println("Fruit greater than or equal to " + searchKey + ": " + tailMap.firstEntry().getValue());
        } else {
            System.out.println("No fruit found greater than or equal to " + searchKey);
        }

        // Getting the closest fruit less than or equal to a specified key
        NavigableMap<String, Fruit> headMap = navigableMap.headMap(searchKey, false);
        if (!headMap.isEmpty()) {
            System.out.println("Fruit less than or equal to " + searchKey + ": " + headMap.lastEntry().getValue());
        } else {
            System.out.println("No fruit found less than or equal to " + searchKey);
        }
    }
}
