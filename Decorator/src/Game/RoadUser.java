package Game;


public class RoadUser implements RoadObject {

    char sign;
    int speed;
    private int x, y;

    public RoadUser() {
        this.sign = 'U';
        this.speed = 0;
    }


    public char getSign() {
        return sign;
    }

    public int getSpeed() {
        return speed;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
