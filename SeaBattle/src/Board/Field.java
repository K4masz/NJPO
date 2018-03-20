package Board;

import Units.Unit;
import javafx.geometry.Point2D;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


public class Field extends Rectangle {
    private EFieldType type;
    private Unit unit;
    private Point2D location;
    public boolean wasShot;
    private Board board;

    public Field(EFieldType type, Point2D location) {
        super(30, 30);
        this.type = type;
        this.location = location;
        this.unit = null;
        this.wasShot = false;
    }

    public Field(EFieldType type, int x, int y) {
        super(30, 30);
        this.type = type;
        this.location = new Point2D(x, y);
        this.unit = null;
        this.wasShot = false;
    }

    public boolean shoot() {
        wasShot = true;
        setFill(Color.BLACK);

        if(this.unit != null){
            unit.hit();
            setFill(Color.RED);
            if(!unit.isAlive()){
                board.units--;
            }
            return true;
        }
        return false;
    }

    public EFieldType getType() {
        return type;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public boolean isEmpty() {
        return this.unit == null ? true : false;
    }
}
