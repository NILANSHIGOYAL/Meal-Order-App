package com.example.a11feb;

public class Order {
    private long orderId;
    private String meal_name;
    private String price;
    private String quantity;
    private String tip;
    private String tax;
    private String cost;

    public Order(long orderId, String meal_name, String price, String quantity, String tip, String cost, String tax){
        this.orderId =orderId;
        this.meal_name=meal_name;
        this.price=price;
        this.quantity=quantity;
        this.tip=tip;
        this.tax=tax;
        this.cost=cost;
    }

    public Order(){

    }
    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }
    public String getMealName()
    {
        return meal_name;
    }
    public void setMealName(String meal_name) {

        this.meal_name = meal_name;
    }
    public String getPrice(){

        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public String getQuantity()
    {
        return quantity;
    }
    public void setQuantity(String quantity)
    {
        this.quantity = quantity;
    }
    public String getTip(){

        return tip;
    }
    public void setTip(String tip)
    {
        this.tip = tip;
    }
    public String getTax(){

        return tax;
    }
    public void setTax(String tax) {

        this.tax= tax;
    }
    public String getCost(){

        return cost;
    }
    public void setCost(String cost) {

        this.cost= cost;
    }

    public String toString(){
        return "Order id: "+getOrderId()+ "\n" +
                "Meal Name: "+getMealName() + "\n" +
                "Price :"+getPrice() + "\n" +
                "Quantity: "+getQuantity() + "\n" +
                "Tip: "+getTip() +"\n" +
                "Tax: "+getTax() +"\n" +
                "Total Cost: "+getCost() +"\n" ;


    }




}

