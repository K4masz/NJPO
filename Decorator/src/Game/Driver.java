package Game;

public class Driver extends RoadUser {

    @Override
    public char getSign() {
        return super.getSign();
    }

    @Override
    public int getSpeed() {
        return super.getSpeed();
    }



    public Driver(RoadUser roadUser) {
        this.sign = 'C';
        this.speed = 3;
    }

    public Driver() {
        this.sign = 'C';
        this.speed = 3;
    }

    @Override
    public String toString() {
        return "Driver";
    }
}
