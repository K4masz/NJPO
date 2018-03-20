package Game;

public class Pedestrian extends RoadUser {

    @Override
    public char getSign() {
        return this.sign;
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }


    public Pedestrian(RoadUser roadUser){
        this.sign = 'P';
        this.speed = 1;
    }

    public Pedestrian(){
        this.sign = 'P';
        this.speed = 1;
    }

    @Override
    public String toString() {
        return "Pedestrian";
    }
}
