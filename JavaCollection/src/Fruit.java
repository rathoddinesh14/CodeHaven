public class Fruit implements Comparable<Fruit> {
    public String name;
    public int size;

    public Fruit(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    @Override
    public int compareTo(Fruit other) {
        return this.size - other.size;
    }

    @Override
    public String toString() {
        return "Fruit [name=" + name + ", size=" + size + "]";
    }
}
