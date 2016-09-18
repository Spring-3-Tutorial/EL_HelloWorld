/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karaca.el.helloworld;

/**
 *
 * @author kemalsamikaraca
 */
public class Customer {
    
    private String itemName;
    private Item item;

    /**
     * @return the itemName
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @param itemName the itemName to set
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * @return the item
     */
    public Item getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(Item item) {
        this.item = item;
    }
    
    @Override
    public String toString(){
        return "itemName:" + this.itemName + " -- item:" + this.item;
    }
    
}
