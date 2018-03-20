package Game;

public class Cyclist extends RoadUser {
    @Override
    public String toString() {
        return "Cyclist";
    }

    public Cyclist() {
        this.sign = 'B';
        this.speed = 2;
    }

    public Cyclist(RoadUser roadUser) {
        this.sign = 'B';
        this.speed = 2;
    }

    @Override
    public char getSign() {
        return super.getSign();
    }

    @Override
    public int getSpeed() {
        return super.getSpeed();
    }




}
