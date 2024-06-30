import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

    public static void main(String[] args) {

        // Hashset unordered
//        Set<String> set = new HashSet<String>();
        // linked will remember
//        Set<String> set = new LinkedHashSet<String>();

        // Natural order
        Set<String> set = new TreeSet<String>();

       set.add("Dog");
       set.add("cat");
       set.add("snake");
       set.add("mouse");
       set.add("ppoop");

       System.out.println(set);

       for (String element : set) {
           System.out.println(element);
       }

       if(set.contains("wee")) {
           System.out.println("Cintaints wee");
       }

       if (set.isEmpty()) {
           System.out.println("True");
       }

       Set<String> set2 = new TreeSet<String>();

       set2.add("Dog");
       set2.add("snake");
       set2.add("lksdfjfgj");

        // Comparing elements
       Set<String> intersection = new HashSet<String>(set);
       System.out.println(intersection.retainAll(set2));

       Set<String> difference = new HashSet<String>(set);
       difference.removeAll(set2);



    }
}
