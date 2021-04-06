package mazel.tov;

import java.util.ArrayList;
import java.util.List;


public class BruteForce implements Algorithms {


    @Override
    public Solution solve(Backpack backpack, int currWeight, double currVal, List<Integer> itemId) {
        Solution solution = new Solution();

        for (int i = 0; i < backpack.getItems().size(); i++) {
            if (!itemId.contains(backpack.getItems().get(i).getItemID()) && currWeight + backpack.getItems().get(i).getItemWeight() <= backpack.getBackPackSize()) {
                itemId.add(backpack.getItems().get(i).getItemID());
                currWeight = currWeight + backpack.getItems().get(i).getItemWeight();
                currVal = currVal + backpack.getItems().get(i).getItemValue();

                Solution tmpSol = solve(backpack, currWeight, currVal, itemId);

                if (tmpSol.getBestValue() > solution.getBestValue())
                    solution = tmpSol;

                itemId.remove(Integer.valueOf(backpack.getItems().get(i).getItemID()));
                currWeight = currWeight - backpack.getItems().get(i).getItemWeight();
                currVal = currVal - backpack.getItems().get(i).getItemValue();
            }
        }
        if (solution.getBestValue() < currVal) {
            solution.setBestValue(currVal);
            solution.setBestWeight(currWeight);
            solution.setBestItemID(new ArrayList<>(itemId));
        }
        return solution;
    }

    @Override
    public String description() {
        return "Полный обзор-вычислительно неэффективный метод, но оптимальный (проверяет каждый случай). Вычислительная сложность о(2^n)";
    }
}
