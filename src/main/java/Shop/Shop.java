package Shop;

import Behaviours.IPlay;
import Behaviours.ISell;

import javax.sound.midi.Instrument;
import java.util.ArrayList;

public class Shop{

    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<>();
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void addItems(ISell product) {
        this.stock.add(product);
    }

    public void removeItems(ISell product){
        this.stock.remove(product);
    }

    public int potentialProfit(){
        int profit = 0;
        for(ISell item: stock){
            profit += item.calculateMarkup();
        }
        return profit;
    }

}


