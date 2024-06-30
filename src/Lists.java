import java.util.*;

class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        int len1 = o1.length();
        int len2 = o2.length();

        if(len1 > len2) {
            return 1;
        }
        else if (len1 < len2) {
            return -1;
        }

        return 0;
    }
}

class AlphaComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }

}

public class Lists {

        public static void main(String[] args) {
//            ArrayList<Integer> numbers = new ArrayList<Integer>();
//
//            // Adding values
//            numbers.add(10);
//            numbers.add(100);
//
//            // Retrieving
//            numbers.get(0);
//
//            // Indexed for loop interation
//            for (int i = 0; i < numbers.size(); i++) {
//                System.out.println(numbers.get(i));
//
//            }
//
//            for (Integer num : numbers) {
//                System.out.println(num);
//            }
//
//            //removing items (careful)
//            numbers.remove(numbers.size() - 1);
//
//            // Removing items from the first index, will copy every item one step back, very slow
//            // last few items are pretty fast
//
//            List<String> values = new ArrayList<String>();
//
//
//            List<Integer> arrayList = new ArrayList<Integer>();
//            List<Integer> linkedList = new LinkedList<Integer>();
//
//            doTimings("Arraylist", arrayList);
//            doTimings("LinkedList", linkedList);

            List<String> animals = new ArrayList<String>();

            animals.add("cat");
            animals.add("poop");
            animals.add("tiger");
            animals.add("dog");
            animals.add("ele[jamt");
            animals.add("snake");

            Collections.sort(animals, new AlphaComparator());

            for (String animal : animals) {
                System.out.println(animal);
            }

            List<Integer> numbers = new ArrayList<Integer>();

            numbers.add(3);
            numbers.add(9);
            numbers.add(33);
            numbers.add(53);
            numbers.add(43);
            numbers.add(1);

            Collections.sort(numbers, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return -o1.compareTo(o2);
                }
            });

            for(Integer number: numbers) {
                System.out.println(number);
            }

        }

        private static void doTimings(String type, List<Integer> list) {

            for(int i = 0; i <1E5; i++) {
                list.add(i);
            }

            long start = System.currentTimeMillis();

            for(int i = 0; i<1E5; i++) {
                list.add(i);
            }

            long end = System.currentTimeMillis();

            System.out.println("Time taken: " + (end - start) + " ms for " + type);


            long start2 = System.currentTimeMillis();

            for(int i = 0; i<1E5; i++) {
                list.add(0, i);
            }

            long end2 = System.currentTimeMillis();

            System.out.println("Time taken: " + (end2 - start2) + " ms for " + type);

        }

}




