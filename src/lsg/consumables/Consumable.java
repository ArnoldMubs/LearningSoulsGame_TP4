package lsg.consumables;

public class Consumable {
    private String name;
    private int capacity;
    private String stat;

    public Consumable(String name, int capacity, String stat) {
        this.name = name;
        this.capacity = capacity;
        this.stat = stat;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getStat() {
        return stat;
    }

    protected void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return this.name+" ["+this.capacity+" "+this.stat+" point(s)]";
    }

    public int use(){
        int cap=this.capacity;
        this.setCapacity(0);
        return  cap;
    }


}
