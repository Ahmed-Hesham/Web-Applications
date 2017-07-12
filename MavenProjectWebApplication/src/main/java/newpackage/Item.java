/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "item")
@SessionScoped
public class Item implements Serializable {
 
    private static final long serialVersionUID = 1L;
    private String item;
    
    OrderBean order;
 
    public String getItem() {
        return item;
    }
 
    public void setItem(String item) {
        this.item = item;
    }
 
   
    public OrderBean getOrder() {
        return order;
    }
 
    public void setOrder(OrderBean order) {
        this.order = order;
    }
    private static final ArrayList<OrderBean> orderList = new ArrayList<OrderBean>();
 
    public ArrayList<OrderBean> getOrderList() {
        return orderList;
    }
 
    public String addAction() {
        OrderBean orderitem = new OrderBean(this.item);
        orderList.add(orderitem);
 
        item = "";
        
        return null;
    }
   
}