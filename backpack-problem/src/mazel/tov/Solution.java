package mazel.tov;

import java.util.ArrayList;
import java.util.List;


public class Solution {


    public double bestValue=0;

    public int bestWeight=0;

    public List<Integer> bestItemID = new ArrayList<>();


    public double getBestValue() {
        return bestValue;
    }


    public void setBestValue(double bestValue) {
        this.bestValue = bestValue;
    }


    public int getBestWeight() {
        return bestWeight;
    }


    public void setBestWeight(int bestWeight) {
        this.bestWeight = bestWeight;
    }


    public List<Integer> getBestItemID() {
        return bestItemID;
    }


    public void setBestItemID(List<Integer> bestItemID) {
        this.bestItemID = bestItemID;
    }
}
