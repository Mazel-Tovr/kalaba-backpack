package mazel.tov;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class RandomSearch implements Algorithms {


    @Override
    public Solution solve(Backpack backpack, int currWeight, double currVal, List<Integer> itemId) {

        Solution solution= new Solution();

        for(int i=0; i<100; i++)
        {
            while (currWeight<= backpack.getBackPackSize())
            {
                int r=new Random().nextInt(backpack.getItems().size());
                if(!itemId.contains(backpack.getItems().get(r).getItemID()) && currWeight+ backpack.getItems().get(r).getItemWeight()<= backpack.getBackPackSize())
                {
                    itemId.add(backpack.getItems().get(r).getItemID());
                    currWeight=currWeight+ backpack.getItems().get(r).getItemWeight();
                    currVal=currVal+ backpack.getItems().get(r).getItemValue();
                }
                else
                    break;
            }
            if(solution.getBestValue()<currVal)
            {
                solution.setBestValue(currVal);
                solution.setBestWeight(currWeight);
                solution.setBestItemID(new ArrayList<>(itemId));
            }
            itemId.clear();
            currWeight=0;
            currVal=0;
        }

        return solution;
    }


    @Override
    public String description() {
        return "Случайный обзор-алгоритм выбирает случайный предмет до тех пор, пока вы не исчерпаете пространство в вашем рюкзаке";
    }
}
