package Shop;

import Behaviours.IPlay;
import Behaviours.ISell;

public class Product implements ISell {

    private IPlay item;
    private int itemCost;
    private int itemPrice;

    public Product(IPlay item, int itemCost, int itemPrice) {
        this.item = item;
        this.itemCost = itemCost;
        this.itemPrice = itemPrice;
    }

    public IPlay getItem() {
        return item;
    }

    public int getItemCost() {
        return itemCost;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public int calculateMarkup(){
        return itemPrice-itemCost;
    }
}

