package mazel.tov;

import java.util.ArrayList;
import java.util.List;


public class Backpack {


    private int backPackSize;

    private List<Item> items = new ArrayList<Item>();


    private void addItem(Item item)
    {
        items.add(item);
    }


    public void removeItem(int id)
    {
        for(Item it : items)
        {
            if(it.getItemID()==id)
            {
                items.remove(it);
                Item.setCounter(Item.getCounter()-1);

                int counter=1;
                for(Item i : items)
                {
                    i.setItemID(counter);
                    counter++;
                }

                break;
            }
        }
    }


    public Item getItem(float value, int weight)
    {
        for(Item it : items)
        {
            if(it.getItemWeight()==weight && it.getItemValue()==value)
            {
                return it;
            }
        }
        return null;
    }


    public Item getItem(int id)
    {
        for(Item it : items)
        {
            if(it.getItemID()==id)
            {
                return it;
            }
        }
        return null;
    }


    public void setBackPackSize(int backPackSize) {
        this.backPackSize = backPackSize;
    }


    public int getBackPackSize() {
        return backPackSize;
    }


    public void setItemsArray(List<Item> items) {
        this.items = items;
    }


    public List<Item> getItems() {
        return items;
    }
}
