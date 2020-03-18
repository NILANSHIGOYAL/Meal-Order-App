package com.example.a11feb;

public class Order {
    private long orderId;
    private String meal_name;
    private int price;
    private int quantity;
    private double tip;
    private double tax;
    private double cost;

    public Order(long orderId, String meal_name, int price, int quantity, double tip, double tax, double cost){
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
    public int getPrice(){

        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getQuantity()
    {
        return quantity;
    }
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    public double getTip(){

        return tip;
    }
    public void setTip(double tip)
    {
        this.tip = tip;
    }
    public double getTax(){

        return tax;
    }
    public void setTax(double tax) {

        this.tax= tax;
    }
    public double getCost(){

        return cost;
    }
    public void setCost(double cost) {

        this.cost= cost;
    }






}

