import java.util.Scanner;
import java.util.stream.StreamSupport;

//// Classes
//class Person {
//    // Instance variables (data or state)
//    String name;
//    int age;
//
//
//    // Classes can contain
//
//    //1. Data
//    //2. Subrountines (methods)
//    void speak(){
//        for (int i =0; i<3; i++) {
//            System.out.println("Hello, my name is " + name + "my age is " + age);
//        }
//    }
//
//    void sayHello () {
//        System.out.println("Hello there");
//    }
//}

//class Person {
//    String name;
//    int age;
//
//    void speak() {
//        System.out.println("My name is "+ name);
//    }
//
//    int calculateYearsToRetirement() {
//        int yearsLeft = 65 - age;
//        return yearsLeft;
//    }
//
//    int getAge() {
//        return age;
//    }
//
//    String getName() {
//        return name;
//    }
//}

//class Robot {
//    public void speak(String message) {
//        System.out.println(message);
//    }
//
//    public void jump(int height) {
//        System.out.println(height);
//    }
//
//    public void move(String direction, int ditance) {
//        System.out.println("Moving " + direction + " " + ditance + "meters");
//    }
//}

//class Frog {
//    private String name;
//    private int age;
//
//    public void setName (String name) {
//        this.name = name;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getName() {
//        return getName();
//    }
//
//    public int getAge() {
//        return getAge();
//    }
//
//    public void setInfo(String name, int age) {
//        setAge(age);
//        setName(name);
//    }
//}

//class Machine {
//    private String name;
//    private int code;
//
//    public Machine() {
//        this("arnie", 9);
//        System.out.println("Construcotr running");
//
//
//    }
//
//    public Machine(String name) {
//        this(name, 0);
//        System.out.println("Second construct running");
//        this.name = name;
//
//    }
//
//    public Machine(String name, int code) {
//        System.out.println("Third consrruct running");
//        this.name = name;
//        this.code = code;
//    }
//}

//class Thing {
//    public final static int LUCKY_NUMBER = 3;
//
//    public String name;
//    public static String description;
//
//    public static int count = 0;
//
//    public int id;
//
//    public Thing(){
//        id = count;
//        count ++;
//
//    }
//
//    public void showName(){
//        System.out.println(name);
//    }
//
//    public static void showInfo() {
//        System.out.println("Hello");
//    }
//}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        // Crteates scanner object
//        Scanner input = new Scanner(System.in);
//
//        // Ouptu promtp
//        System.out.println("Enter a line of text");
//
//        // wait for the user input
//        int value = input.nextInt();
//
//        //Tell them what thet uboiuyt
//        System.out.println(value);

        // I skipped a bunch of variable assignment stuff, stuff there was no need to type up


//        // switches
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Please enter a command: ");
//        String text = input.nextLine();
//
//        switch (text) {
//            case "start":
//                System.out.println("Machine started");
//                break;
//
//            case "stop":
//                System.out.println("Machine stop");
//                break;
//
//            default:
//                System.out.println("Command not recognized");


//        // Arrays
//        int value = 7;
//
//        int[] values;
//
//        values = new int[3];
//
//        values[0] = 10;
//        values[1] = 20;
//        values[2] = 30;
//
//        System.out.println(values[1]);
//
//        for (int i=0; i < values.length; i++) {
//            System.out.println(values[i]);
//        }
//
//        int[] numbers = {5,6,7};
//
//        for (int i=0; i < numbers.length; i ++) {
//            System.out.println(numbers[i]);


//        // Arrays of Strings
//        String[] words = new String[3];
//
//        words[0] = "Hello";
//        words[1] = "to";
//        words[2] = "you";
//
//        System.out.println(words[2]);
//
//        String[] fruits = {"Banana", "Apple", "orange"};
//
//        for(String fruit : fruits) {
//            System.out.println(fruit);
//        }
//
//        String[] texts = new String[2];
//        System.out.println(texts[0]);
//
//        texts[0] = "one";


//        // Multi-Dementional arrays
//        int [] values = {5,3,234};
//
//        System.out.println(values[2]);
//
//        int[][] grid = {
//                {3, 5, 234},
//                {2,4},
//                {4,7,6,3}
//        };
//
//        System.out.println(grid[1][1]);
//        System.out.println(grid[0][2]);
//
//        String[][] texts = new String[2][3];
//
//        System.out.println(texts[0][1]);
//
//        texts[0][1] = "Hello there";
//        System.out.println(texts[0][1]);
//
//        for(int i = 0; i < grid.length; i++) {
//            for(int j=0; j<grid[i].length; j++) {
//                System.out.println(grid[i][j] + "\t");
//            }
//        }
//
//        for (int[] ints : grid) {
//            for (int j = 0; j < ints.length; j++) {
//                System.out.println(ints[j] + "\t");
//            }
//        }
//
//        String[][] words = new String[3][];
//        System.out.println(words[0]);
//        words[0] = new String[3];
//        words[0][1] = "Hello there";
//        System.out.println(words[0][1]);


//        // Classes
//        Person person1 = new Person();
//        person1.name = "Joe blogss";
//        person1.age = 37;
//
//        Person person2 = new Person();
//        person2.name = "Sarah Smith";
//        person2.age = 29;
//
//        System.out.println(person1.name);
//
//        // Mathods
//        person1.speak();
//        person1.sayHello();

        // Getters and ret/rson1.getName();

//        // Method params
//
//        Robot sam = new Robot();
//        sam.speak("Hi im sam");
//
//        sam.jump(245);
//
//        sam.move("east", 245);
//
//        String greeting = "Hello you";
//        sam.speak(greeting);
//
//        int value = 45;
//        sam.jump(value);

//        // Setter and This
//        Frog frog1 = new Frog();
//
//          frog1.setName("Bertie");
//          frog1.setAge(2);
////        frog1.name = "Bertie";
////        frog1.age = 1;

//         CONSTRUCTORS
//        Machine machine1 = new Machine();
//        Machine machine2 = new Machine("Bertie");
//        Machine machine3 = new Machine("Chalky", 234);

//        //Static(final)
//        Thing.description = "I am a thing";
//        Thing.showInfo();
//
//        System.out.println(Thing.count);
//
//        Thing thing1 = new Thing();
//        Thing thing2 = new Thing();
//
//        thing1.name="Bob";
//        thing2.name="sue";
//
//        thing1.showName();
//
//        System.out.println(Math.PI);
//        System.out.println(Thing.LUCKY_NUMBER);
//
//        System.out.println(Thing.count);
//        System.out.println(thing1.id);



    }
}