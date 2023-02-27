import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        Task3 task3 = new Task3();
        Task4 task4 = new Task4();
        Task5 task5 = new Task5();

        ArrayList<String> names = new ArrayList<>();
        names.add("Cardan");
        names.add("Riz");
        names.add("Cassian");
        names.add("Kieran");
        names.add("Nikolai");
        names.add("Darkling");
        System.out.println(task1.sortednames(names));
        System.out.println(task2.sortednames(names));

        String[] mass = {"1, 2, 0", "4, 5, 66, 7"};
        System.out.println(task3.getNumbers(mass));

        System.out.println(task4.generator(25214903917L, 11L, (long)Math.pow(2,48)));

        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 5, 77, 44);
        Stream<Integer> stream2 = Stream.of(10, 20, 30, 40);


    }
}