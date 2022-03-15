/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Son
 */
public class Cart { //
    
    private List<Item> items;

    public Cart() {
        items = new ArrayList<>();
    }

    public Cart(List<Item> items) {
        this.items = items;
    }
    
    private Item getItemByid(int id){
        for (Item i : items) {
            if(i.getProduct().getId()==id)
            return i;
        }
        return null;
    }
    
    public int getQuantityByid(int id){
        return getItemByid(id).getQuantity();
    }
    
    // add to cart
    
    public void addItem(Item t){
        //co o cart roi
        if(getItemByid(t.getProduct().getId()) !=null){
            Item i = getItemByid(t.getProduct().getId());
            i.setQuantity(i.getQuantity()+t.getQuantity());
    }else{
            //chua co
            items.add(t);
        }
    }
    
    public void remveItem(int id){
        if(getItemByid(id)!=null){
            items.remove(getItemByid(id));
        }
    }
    public double getTotalMoney(){
        double t = 0;
        for (Item i : items) {
            t+=i.getQuantity()*i.getPrice();
        }
        return  t;
    }
    
    
}
