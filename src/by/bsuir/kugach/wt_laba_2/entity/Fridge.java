package by.bsuir.kugach.wt_laba_2.entity;

import java.util.ArrayList;

public class Fridge extends Appliance{
    private int height;
    private int width;
    private int weight;
    private int freezerCapacity;
    private int overallCapacity;
    private int powerConsumption;

    public Fridge(int height, int width, int weight, int freezerCapacity, int overallCapacity, int powerConsumption, int price){
        this.height = height;
        this.width = width;
        this.weight = weight;
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
        this.powerConsumption = powerConsumption;
        this.setPrice(price);
    }
    public static Fridge createInstance(ArrayList<String> params){
        return new Fridge(
                Integer.parseInt(params.get(0)),
                Integer.parseInt(params.get(1)),
                Integer.parseInt(params.get(2)),
                Integer.parseInt(params.get(3)),
                Integer.parseInt(params.get(4)),
                Integer.parseInt(params.get(5)),
                Integer.parseInt(params.get(6))
        );
    }
    public Object getFieldByName(String name) {
        return switch (name){
            case "HEIGHT" -> height;
            case "WIDTH" -> width;
            case "WEIGHT" -> weight;
            case "FREEZER_CAPACITY" -> freezerCapacity;
            case "OVERALL_CAPACITY" -> overallCapacity;
            case "POWER_CONSUMPTION" -> powerConsumption;
            case "PRICE" -> getPrice();
            default -> null;
        };
    }
    public String toString(){
        return "Fridge{" +
                "height = " + height +
                ", width = " + width +
                ", weight = " + weight +
                ", freezerCapacity = " + freezerCapacity +
                ", overallCapacity = " + overallCapacity +
                ", powerConsumption = " + powerConsumption +
                ", price = " + getPrice() +
                "}";
    }
    public int getHeight(){
        return height;
    }
    public int getWidth(){
        return width;
    }
    public int getWeight(){
        return weight;
    }
    public int getFreezerCapacity(){
        return freezerCapacity;
    }
    public int getOverallCapacity(){
        return overallCapacity;
    }
    public int getPowerConsumption(){
        return powerConsumption;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public void setFreezerCapacity(int freezerCapacity){
        this.freezerCapacity = freezerCapacity;
    }
    public void setOverallCapacity(int overallCapacity){
        this.overallCapacity = overallCapacity;
    }
    public void setPowerConsumption(int powerConsumption){
        this.powerConsumption = powerConsumption;
    }
}
