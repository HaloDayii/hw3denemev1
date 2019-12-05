public class Ingredient implements IUncountableItem {
    private String name;
    private int amount;

    //constructors
    public Ingredient(){
        this(null,0);
    }
    public Ingredient(String name){
        this(name, 0);
    }
    public Ingredient(String name, int amount){
        setName(name);
        setAmount(amount);
    }


    //getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }



}
