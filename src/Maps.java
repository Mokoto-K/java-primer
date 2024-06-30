import java.util.*;

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id=id;
        this.name=name;
    }

    public String toString() {
        return id + ": " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

public class Maps {

    public static void main(String[] args) {

        // Hashmaps
//        HashMap<Integer, String> map = new HashMap<Integer, String>();

//        map.put(5, "five");
//        map.put(4, "four");
//        map.put(3, "three");
//        map.put(2, "two");
//
//        String text = map.get(3);
//
//        System.out.println(text);
//
//        for (Map.Entry<Integer, String> entry : map.entrySet()) {
//            int key = entry.getKey();
//            String value = entry.getValue();
//
//            System.out.println(key + " " + value);
//        }
//
//        // Sorted maps
//        //Order in which items were put in
//        LinkedHashMap<Integer, String> linkedhash = new LinkedHashMap<Integer, String>();
//
//        // Order of the keys
//        TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();
//
//        testMap(linkedhash);
//        testMap(treemap);

        Person p1 = new Person(0, "Bob");
        Person p2 = new Person(1, "Sue");
        Person p3 = new Person(2, "Mike");
        Person p4 = new Person(1, "Sue");

        Map<Person, Integer> map = new LinkedHashMap<Person, Integer>();

        map.put(p1, 1);
        map.put(p2, 2);
        map.put(p3, 3);
        map.put(p4, 4);

        for (Person key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }

        Set<Person> set = new LinkedHashSet<Person>();

        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);



    }

    public static void testMap(Map<Integer, String> map) {
        map.put(9, "fox");
        map.put(4, "snake");
        map.put(8, "bird");
        map.put(1, "penguin");
        map.put(7, "dog");
        map.put(0, "rex");
        map.put(19, "cat");

        for (Integer key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " " + value);
        }
    }

}
