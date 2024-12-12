import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExamples {
    public void TreeSetExamplesOneAdd() {
        TreeSet<Integer> num_Treeset = new TreeSet<>();
        num_Treeset.add(20);
        num_Treeset.add(5);
        num_Treeset.add(15);
        num_Treeset.add(25);
        num_Treeset.add(10);
// Call iterator() method to define Iterator for TreeSet
        Iterator<Integer> iter_set = num_Treeset.iterator();
        System.out.print("TreeSet using Iterator: ");
// Access TreeSet elements using Iterator
        while (iter_set.hasNext()) {
            System.out.print(iter_set.next());
            System.out.print(", ");
        }
    }

    public void TreeSetExamplesTwoRemove() {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);
        // Using the remove() method
        boolean value1 = numbers.remove(5);
        System.out.println("Is 5 removed? " + value1);
        // Using the removeAll() method
        boolean value2 = numbers.removeAll(numbers);
        System.out.println("Are all elements removed? " + value2);
    }

    public void Navigation() {

    }

    public void Comparator() {

    }

    public class cities_Comparator implements Comparator<String> {
        //override compare method to compare two elements of the TreeSet
        @Override
        public int compare(String cities_one, String cities_two) {
            int value = cities_one.compareTo(cities_two);
// sort elements in reverse order
            if (value > 0) {
                return -1;
            } else if (value < 0) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public void TreeSetExampleCom() {
        // Create a TreeSet with user-defined comparator
        TreeSet<String> cities = new TreeSet<>(new cities_Comparator());
//add elements to the comparator
        cities.add("UAE");
        cities.add("Mumbai");
        cities.add("NewYork");
        cities.add("Hyderabad");
        cities.add("Karachi");
        cities.add("Xanadu");
        cities.add("Lahore");
        cities.add("Zagazig");
        cities.add("Yingkou");
//print the contents of TreeSet
        System.out.println("TreeSet: " + cities);
    }
}
