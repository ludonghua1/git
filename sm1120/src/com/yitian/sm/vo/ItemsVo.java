package com.yitian.sm.vo;

import com.yitian.sm.model.Items;
import com.yitian.sm.model.Orders;

import java.io.Serializable;

public class ItemsVo implements Serializable {
    private Orders orders;
    private Items items;
    private int shoppingCount;

    public Orders getOrders() {
        return orders;
    }
    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Items getItems() {
        return items;
    }
    public void setItems(Items items) {
        this.items = items;
    }
    public int getShoppingCount() {
        return shoppingCount;
    }
    public void setShoppingCount(int shoppingCount) {
        this.shoppingCount = shoppingCount;
    }

    @Override
    public String toString() {
        return "ItemsVo{" +
                "items=" + items +
                ", shoppingCount=" + shoppingCount +
                '}';
    }
}
