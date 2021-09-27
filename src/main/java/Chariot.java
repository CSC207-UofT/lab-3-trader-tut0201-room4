import java.util.ArrayList;

public class Chariot implements Drivable, Tradable {

    private int maxSpeed;
    private int price;
    private ArrayList<Horse> horses = new ArrayList<Horse>();
    private int horsemax;

    public Chariot(int max){
        this.maxSpeed = 0;
        this.price = 20;
        this.horsemax = max;
    }

    @Override
    public int getPrice(){
        return this.price;
    }

    @Override
    public int getMaxSpeed(){
        return this.maxSpeed;
    }

    @Override
    public void upgradeSpeed(){
        this.maxSpeed ++;
    }

    @Override
    public void downgradeSpeed(){
        this.maxSpeed--;
    }

    //Adds extra horse to chariot
    public void Addhorse(Horse horse){
        if (horses.size() < this.horsemax) {
            this.horses.add(horse);
            this.maxSpeed += horse.getMaxSpeed();
        }
    }
}
