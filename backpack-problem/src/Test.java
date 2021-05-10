import mazel.tov.*;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        new Test().Test1();
    }

    public void Test1() {
        Backpack backpack = new Backpack();

        int backPackSize = 10;
        backpack.setBackPackSize(backPackSize);

        List<Item> inputData = List.of(
                new Item(3, 1),
                new Item(3, 3),
                new Item(9, 5),
                new Item(3, 8),
                new Item(2, 4)
        );
        backpack.getItems().addAll(inputData);

        Algorithms search = new RandomSearch();
        Solution solve = search.solve(backpack, 0, 0, new ArrayList<>());
        assert(solve.bestWeight == 9);
        assert(solve.bestValue == 15);
    }
}
