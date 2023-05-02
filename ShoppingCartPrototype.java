package com.dal.PrototypeApr19;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartPrototype {
    
    // Define the data structures required for the shopping cart
    private List<Item> items;
    
    // Define the constructor for the shopping cart
    public ShoppingCartPrototype() {
        items = new ArrayList<>();
    }
    
    // Define the method to add an item to the cart
    public void addItem(Item item) {
        items.add(item);
    }
    
    // Define the method to remove an item from the cart
    public void removeItem(Item item) {
        items.remove(item);
    }
    
    // Define the method to calculate the total cost of items in the cart
    public double getTotalCost() {
        double totalCost = 0.0;
        for (Item item : items) {
            totalCost += item.getPrice();
        }
        return totalCost;
    }
    
    // Define the method to display the items in the cart
    public void displayItems() {
        System.out.println("Shopping Cart:");
        for (Item item : items) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
    }
    
    // Define the Item class
    private static class Item {
        private String name;
        private double price;
        
        public Item(String name, double price) {
            this.name = name;
            this.price = price;
        }
        
        public String getName() {
            return name;
        }
        
        public double getPrice() {
            return price;
        }
    }
    
    // Define the main method to test the shopping cart prototype
    public static void main(String[] args) {
        ShoppingCartPrototype cart = new ShoppingCartPrototype();
        cart.addItem("Shirt", 20.00);
        cart.addItem("Jeans", 30.00);
        cart.addItem("Socks", 5.00);
        
        cart.displayItems();
        System.out.println("Total Cost: $" + cart.getTotalCost());
        
        cart.removeItem("Jeans", 30.00);
        
        cart.displayItems();
        System.out.println("Total Cost: $" + cart.getTotalCost());
    }

	private void removeItem(String string, double d) {
		// TODO Auto-generated method stub
		
	}

	private void addItem(String string, double d) {
		// TODO Auto-generated method stub
		
	}
} 