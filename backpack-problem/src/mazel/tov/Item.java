package mazel.tov;


public class Item {


    private double itemValue;

    private int itemWeight;

    private int itemID;

    private static int counter=1;


    public Item(double itemValue, int itemWeight) {
        this.itemValue = itemValue;
        this.itemWeight = itemWeight;
        this.itemID = counter;
        setCounter(counter+1);
    }


    public static int getCounter() {
        return counter;
    }


    public static void setCounter(int counter) {
        Item.counter = counter;
    }


    public void setItemValue(double itemValue) {
        this.itemValue = itemValue;
    }


    public void setItemWeight(int itemWeight) {
        this.itemWeight = itemWeight;
    }


    public double getItemValue() {
        return itemValue;
    }


    public int getItemWeight() {
        return itemWeight;
    }


    public void setItemID(int itemID) {
        this.itemID = itemID;
    }


    public int getItemID() {
        return itemID;
    }
}
