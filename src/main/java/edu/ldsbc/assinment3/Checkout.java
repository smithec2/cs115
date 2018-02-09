package edu.ldsbc.assinment3;

import java.util.ArrayList;
import java.util.List;

public class Checkout {

    List<DessertItem> dessertList = new ArrayList<>();
    public int totalCost()
    {
        int total = 0;
      for (DessertItem item: dessertList)
      {
          total =+ item.calculateItemCost();
      }
      return total;
    }

    public int numberOfItems (){
        return dessertList.size();
    }

    public void add(DessertItem dessertItem){
        dessertList.add(dessertItem);
    }

    @Override
    public String toString() {
        return "Checkout{" +
                "dessertList=" + dessertList +
                "}\r\n";
    }
}
