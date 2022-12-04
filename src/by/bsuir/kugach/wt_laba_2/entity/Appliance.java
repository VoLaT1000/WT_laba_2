package by.bsuir.kugach.wt_laba_2.entity;

public class Appliance implements Comparable<Appliance>{
    private int price;
    public Object getFieldByName(String name){return null;}
    public  int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public int compareTo(Appliance o)
    {
        return this.getPrice() - o.getPrice();
    }
}
