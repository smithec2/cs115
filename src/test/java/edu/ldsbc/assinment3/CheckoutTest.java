package edu.ldsbc.assinment3;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckoutTest {
    @Test
    public void totalCost() throws Exception {
        Checkout checkout = new Checkout();

        checkout.add(new IceCream("Strawberry Ice Cream",145));
        assertEquals(327,checkout.totalCost());
        checkout.add(new Sundae("Vanilla Ice Cream",105, "Caramel", 50));
        assertEquals(327,checkout.totalCost());
        checkout.add (new Candy("Gummy Worms", 1.33, 89));
        assertEquals(327,checkout.totalCost());
        checkout.add (new Cookie("Chocolate Chip Cookies", 4, 399));
        assertEquals(327,checkout.totalCost());
        checkout.add (new Candy("Salt Water Taffy", 1.5, 209));
        assertEquals(327,checkout.totalCost());
        checkout.add (new Candy("Candy Corn",3.0, 109));
        assertEquals(327,checkout.totalCost());
        System.out.println("\nNumber of items: " + checkout.numberOfItems() + "\n");
        System.out.println("\nTotal cost: " + checkout.totalCost() + "\n");
        System.out.println(checkout);

        assertEquals(327,checkout.totalCost());



    }

    @Test
    public void numberOfItems() throws Exception {
    }

    @Test
    public void add() throws Exception {
    }

}