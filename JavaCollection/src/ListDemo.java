import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) throws Exception {

        Collection<Fruit> fruits = new ArrayList<>();

        for (Fruit fruit : Utils.getFruits()) {
            fruits.add(fruit);
        }

        // for (Fruit fruit : fruits) {
        //     System.out.println(fruit.getName() + " " + fruit.getSize());
        // }

        // print size of the collection
        System.out.println("Size of the collection: " + fruits.size());

        // iterate over the collection using iterator
        Iterator<Fruit> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            Fruit fruit = iterator.next();
            // System.out.println(fruit.getName() + " " + fruit.getSize());

            // remove if weight is greater than 100
            if (fruit.getSize() > 100) {
                iterator.remove();
            }
        }

        System.out.println("After removing fruits with weight > 100");
        // print size of the collection
        System.out.println("Size of the collection: " + fruits.size());

        System.out.println("=====================================");

        // iterate over the collection using for-each loop
        for (Fruit fruit : fruits) {
            System.out.println(fruit);
        }

        List<Fruit> fruits2 = new ArrayList<>();
        // copy all elements from fruits to fruits2
        fruits2.addAll(fruits);

        // sorting
        Collections.sort(fruits2);

        System.out.println("------- After sorting -------");
        for (Fruit fruit : fruits2) {
            System.out.println(fruit);
        }
    }
}
