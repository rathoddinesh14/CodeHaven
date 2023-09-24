import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set<Fruit> fruits = new HashSet<>();

        Fruit[] fruitsArray = Utils.getFruits();

        // Adding fruits to the set using Utils.getFruits()
        for (Fruit fruit : fruitsArray) {
            fruits.add(fruit);
        }

        // Printing the size of the set
        System.out.println("Size of the set: " + fruits.size());
        System.out.println("=====================================");
        for (Fruit fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println("=====================================");
        
        System.out.println("Adding duplicate fruits");
        // add duplicate fruits
        for (Fruit fruit : fruitsArray) {
            fruits.add(fruit);
        }
        System.out.println("After adding duplicate fruit, Size of the set: " + fruits.size());

        // Iterating over the set using an iterator
        Iterator<Fruit> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            Fruit fruit = iterator.next();

            // Removing fruits with weight greater than 100
            if (fruit.getSize() > 100) {
                iterator.remove();
            }
        }

        System.out.println("After removing fruits with weight > 100");
        System.out.println("Size of the set: " + fruits.size());
        System.out.println("=====================================");

        // Iterating over the set using a for-each loop
        for (Fruit fruit : fruits) {
            System.out.println(fruit);
        }

        SortedSet<Fruit> sortedFruits = new TreeSet<>();
        for (Fruit fruit : fruitsArray) {
            if (sortedFruits.add(fruit)) {
                System.out.println("Added " + fruit);
            } else {
                System.out.println("Duplicate " + fruit);
            }
        }

        System.out.println("=====================================");
        System.out.println("Sorted fruits");
        for (Fruit fruit : sortedFruits) {
            System.out.println(fruit);
        }
        System.out.println("=====================================");

        // remove if weight is greater than 100
        fruits.removeIf(fruit -> fruit.getSize() > 100);
        System.out.println("After removing fruits with weight > 100");
        System.out.println("Size of the set: " + fruits.size());
        System.out.println("=====================================");


        // =========== NavigableSet ===========
        NavigableSet<Fruit> fruits2 = new TreeSet<>();
        for (Fruit fruit : fruitsArray) {
            fruits2.add(fruit);
        }

        // Get the first fruit (lowest element)
        System.out.println("First fruit: " + fruits2.first());

        // Get the last fruit (highest element)
        System.out.println("Last fruit: " + fruits2.last());

        // Get the closest fruit greater than or equal to a specified fruit
        Fruit searchFruit = new Fruit("Mango", 140);
        Fruit ceilingFruit = fruits2.ceiling(searchFruit);
        System.out.println("Fruit greater than or equal to " + searchFruit.getName() + ": " + ceilingFruit);

        // Get the closest fruit less than or equal to a specified fruit
        Fruit floorFruit = fruits2.floor(searchFruit);
        System.out.println("Fruit less than or equal to " + searchFruit.getName() + ": " + floorFruit);

        // Get elements within a specified range
        NavigableSet<Fruit> subSet = fruits2.subSet(new Fruit("Banana", 130), true, new Fruit("Orange", 6000), true);
        System.out.println("Fruits in the range [Banana, Orange]:");
        for (Fruit fruit : subSet) {
            System.out.println(fruit);
        }
    }
}
