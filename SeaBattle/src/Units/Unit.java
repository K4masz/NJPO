package Units;

import javafx.geometry.Point2D;

public abstract class Unit {
    private Point2D[] unitSize;
    private int health; //TODO health based on size
    public int type;

    public Unit(int unitSize) {
        this.unitSize = new Point2D[unitSize];
    }


    public void hit(){
        this.health--;
    }

    public void deploy(){
        //TODO place
    }

    public boolean isAlive(){
        return this.health > 0;
        //TODO find a way to tell if the object has been destroyed - all Points are null?
    }
}
