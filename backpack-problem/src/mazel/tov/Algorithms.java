package mazel.tov;

import java.util.List;


public interface Algorithms {


    Solution solve(Backpack backpack, int currWeight, double currVal, List<Integer> itemId);


    String description();
}
