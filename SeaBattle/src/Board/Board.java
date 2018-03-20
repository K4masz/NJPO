package Board;

import Units.Unit;
import Utils.Config;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

import java.awt.geom.Point2D;
import java.beans.EventHandler;

public class Board extends Parent {

    private VBox rows = new VBox();
    private boolean shootingBoard;
    public int units;

    public Board(boolean isShootingBoard, EventHandler handler) {
        this.shootingBoard = isShootingBoard;
        this.units = Config.MAX_UNITS_PER_BOARD;
        initBoard(handler);
    }

    private void initBoard(EventHandler handler) {
        for (int y = 0; y < 12; y++) {
            HBox row = new HBox();
            for (int x = 0; x < 14; x++) {
                Field f = new Field(EFieldType.LAND, x, y);
                f.setOnMouseClicked((javafx.event.EventHandler<? super MouseEvent>) handler);
                row.getChildren().add(f);
            }

            rows.getChildren().add(row);
        }
        getChildren().add(rows);
    }




    public boolean placeUnit(Unit unit, int x, int y) {
        if(canPlaceUnit(unit,x,y)){
            int length = unit.type;

            if(unit.vertical){
                for (int i = y; i < y + length; i++) {
                    Field cell = get(x, i);
                    cell.ship = ship;
                    if (!enemy) {
                        cell.setFill(Color.WHITE);
                        cell.setStroke(Color.GREEN);
                    }
                }
            }
            else {
                for (int i = x; i < x + length; i++) {
                    Field cell = getCell(i, y);
                    cell.ship = ship;
                    if (!enemy) {
                        cell.setFill(Color.WHITE);
                        cell.setStroke(Color.GREEN);
                    }
                }
            }

            return true;
        }

        return false;
    }

    private boolean canPlaceUnit(Unit unit, int x, int y) {
        return false;
    }

    private boolean isValidPoint(Point2D point) {
        return false;
    }

    private boolean isValidPoint(double x, double y) {
        return false;
    }

  //  public Board.Field getField(int x, int y) {}

    ;
}