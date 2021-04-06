package mazel.tov;

import java.util.*;


public class Greedy implements Algorithms {


    @Override
    public Solution solve(Backpack backpack, int currWeight, double currVal, List<Integer> itemId)
    {
        Solution solution = new Solution();
        List<Item> sortedList = backpack.getItems();

        sortedList.sort(new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                return (o1.getItemValue() / o1.getItemWeight()) < (o2.getItemValue() / o2.getItemWeight()) ? 1 : -1;
            }
        });

        for(int i = 0; i< backpack.getItems().size(); i++)
        {
            if(currWeight+sortedList.get(i).getItemWeight()<= backpack.getBackPackSize())
            {
                itemId.add(sortedList.get(i).getItemID());
                currWeight=currWeight+sortedList.get(i).getItemWeight();
                currVal=currVal+sortedList.get(i).getItemValue();
            }
        }

        solution.setBestValue(currVal);
        solution.setBestWeight(currWeight);
        solution.setBestItemID(itemId);

        return solution;
    }


    @Override
    public String description()
    {
        return "Алгоритм жадный-сортирует элементы в порядке убывания, сравнивая отношение значения к весу объекта. Затем он вставляет их последовательно \n" +
                "для рюкзака, начиная с предмета с наибольшим отношением. Если какой-либо элемент не помещается в рюкзак, он пропускается и алгоритм переходит в \n" +
                "на следующий. Алгоритм не оптимален. Вычислительная сложность о (n * logn)";
    }
}
