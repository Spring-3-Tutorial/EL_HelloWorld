
package com.karaca.el.helloworld;

/**
 *
 * @author kemalsamikaraca
 */
public class Item {
    
    private String name;
    private int quantity;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    @Override
    public String toString(){
       return " name:" + this.name + " -- quantity:" + this.quantity; 
    }
    
}
