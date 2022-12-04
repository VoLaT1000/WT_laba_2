package by.bsuir.kugach.wt_laba_2.entity;

import java.util.ArrayList;

public class Teakettle extends Appliance{
    private int capacity;
    private int powerConsumption;
    private String color;
    private String material;

    public Teakettle(int capacity, int powerConsumption, String material, String color, int price){
        this.capacity = capacity;
        this.powerConsumption = powerConsumption;
        this.color = color;
        this.material = material;
        this.setPrice(price);
    }
    public static Teakettle createInstance(ArrayList<String> params){
        return new Teakettle(
                Integer.parseInt(params.get(0)),
                Integer.parseInt(params.get(1)),
                params.get(2),
                params.get(3),
                Integer.parseInt(params.get(4))
        );
    }
    public Object getFieldByName(String name){
        return switch (name){
            case "CAPACITY" -> capacity;
            case "POWER_CONSUMPTION" -> powerConsumption;
            case "COLOR" -> color;
            case "MATERIAL" -> material;
            case "PRICE" -> getPrice();
            default -> null;
        };
    }
    public String toString(){
        return "Teakettle{" +
                "capacity = " + capacity +
                ", powerConsumption = " + powerConsumption +
                ", color = " + color +
                ", material = " + material +
                "}";
    }
    public int getCapacity(){
        return capacity;
    }
    public int getPowerConsumption(){
        return powerConsumption;
    }
    public String getColor(){
        return color;
    }
    public String getMaterial(){
        return material;
    }
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    public void setPowerConsumption(int powerConsumption){
        this.powerConsumption = powerConsumption;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setMaterial(String material){
        this.material = material;
    }
}
