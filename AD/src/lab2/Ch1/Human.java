package lab2.Ch1;

public class Human {
    private int health;
    private String name;

    public Human(int health, String humanName){
        this.health = health;
        this.name = humanName;
    }
    public int getHealth(){
        return health;
    }
    public String getName(){
        return name;
    }
    public void decreaseHealth(int damage){
        this.health = this.health - damage;
    }
}
