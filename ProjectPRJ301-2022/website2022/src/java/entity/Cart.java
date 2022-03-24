/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Son
 */
public class Cart {

    private List<Item> items;

    public Cart() {
        items = new ArrayList<>();
    }

    public List<Item> getitems() {
        return items;
    }

    private Item getItemByid(int id) {
        for (Item i : items) {
            if (i.getProduct().getId() == id) {
                return i;
            }
        }
        return null;
    }

    public int getQuantityByid(int id) {
        return getItemByid(id).getQuantity();
    }

    public void addItem(Item t) {
        if (getItemByid(t.getProduct().getId()) != null) {
            Item m = getItemByid(t.getProduct().getId());
            m.setQuantity(m.getQuantity() + t.getQuantity());
        } else {
            items.add(t);
        }
    }

    public void removeItem(int id) {
        if (getItemByid(id) != null) {
            items.remove(getItemByid(id));
        }
    }

    public double getTotalmoney() {
        double t = 0;
        for (Item i : items) {
            t += i.getQuantity() * i.getPrice();
        }
        return t;
    }

    private Product getProductByid(int id, List<Product> list) {
        for (Product p : list) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public Cart(String txt, List<Product> list) {
        items = new ArrayList<>();
        try {

            if (txt != null && txt.length() != 0) {
                String[] s = txt.split(",");
                for (String i : s) {
                    String[] n = i.split(":");
                    int id = Integer.parseInt(n[0]);
                    int quantity = Integer.parseInt(n[1]);
                    Product p = getProductByid(id, list);
                    Item t =new Item(p, quantity, p.getPrice()*2);
                    addItem(t);
                }
            }
        } catch (Exception e) {

        }
    }
}
