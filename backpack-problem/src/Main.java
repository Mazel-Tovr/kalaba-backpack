import mazel.tov.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Backpack backpack = new Backpack();

        int backPackSize = 200;
        backpack.setBackPackSize(backPackSize);
        //backpack.items
        List<Item> inputData = List.of(
                new Item(3, 10),
                new Item(32, 31),
                new Item(90, 23),
                new Item(34, 11),
                new Item(2, 3),
                new Item(15, 32),
                new Item(42, 8),
                new Item(30, 50),
                new Item(15, 32),
                new Item(11, 5),
                new Item(11, 1),
//                new Item(9, 12),
//                new Item(23, 67),
//                new Item(25, 33),
//                new Item(57, 10),
//                new Item(44, 78),
//                new Item(10, 5),
//                new Item(23, 77),
//                new Item(87, 23),
//                new Item(91, 34),
//                new Item(45, 44),
//                new Item(21, 90),
//                new Item(54, 33),
//                new Item(11, 11),
//                new Item(42, 8),
//                new Item(51, 14),
//                new Item(50, 11),
//                new Item(22, 2),
//                new Item(56, 22),
                new Item(12, 6)
        );

        System.out.println(inputData.size());

        backpack.getItems().addAll(inputData);

        Algorithms search = new BruteForce();
        long currentTime = System.currentTimeMillis();
        Solution solve = search.solve(backpack, 0, 0, new ArrayList<>());
        System.out.println("BrutForce time " + (System.currentTimeMillis() - currentTime));
        System.out.println("Best value "+ solve.getBestValue() + " Best weight "+ solve.getBestWeight());
        search = new RandomSearch();
        backpack = new Backpack();
        backpack.setBackPackSize(backPackSize);
        backpack.getItems().addAll(inputData);
        currentTime = System.currentTimeMillis();
        solve = search.solve(backpack, 0, 0, new ArrayList<>());
        System.out.println("Random time " + (System.currentTimeMillis() - currentTime));
        System.out.println("Best value "+ solve.getBestValue() + " Best weight "+ solve.getBestWeight());

    }

}
