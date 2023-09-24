public class Utils {
    public static Fruit[] getFruits() {
        Fruit[] fruits = new Fruit[10];
        
        // Apple (150-200 grams)
        // Banana (120-150 grams)
        // Orange (130-160 grams)
        // Strawberry (5-10 grams per berry)
        // Pineapple (900-1,200 grams)
        // Watermelon (5-7 kilograms)
        // Grapes (5-10 grams per grape)
        // Mango (150-300 grams)
        // Kiwi (100-150 grams)
        // Blueberry (1-2 grams per berry)
        
        fruits[0] = new Fruit("Apple", 150);
        fruits[1] = new Fruit("Banana", 120);
        fruits[2] = new Fruit("Orange", 130);
        fruits[3] = new Fruit("Strawberry", 5);
        fruits[4] = new Fruit("Pineapple", 900);
        fruits[5] = new Fruit("Watermelon", 5000);
        fruits[6] = new Fruit("Grapes", 5);
        fruits[7] = new Fruit("Mango", 150);
        fruits[8] = new Fruit("Kiwi", 100);
        fruits[9] = new Fruit("Blueberry", 1);

        return fruits;
    }
}
