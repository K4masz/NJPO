package core;

import core.elements.units.Unit;
import utils.GameConfig;

import java.util.HashSet;

public class Board {

    private Field[][] fields;
    private int numberOfUnits;
    private int numberOfVehicles;
    private int numberOfShips;
    private int numberOfPlanes;

    public Board() {
        this.fields = new Field[GameConfig.BOARD_WIDTH][GameConfig.BOARD_HEIGHT];
    }

    public Board(int width, int height) {
        this.fields = new Field[width][height];
    }

    public Field[][] getFields() {
        return fields;
    }

    public void setField(Field field, int columnIndex, int rowIndex) {
        fields[columnIndex][rowIndex] = field;
    }

    public Field getField(int columnIndex, int rowIndex) {
        return fields[columnIndex][rowIndex];
    }

    public void analyzeBoard(){
        //init numberOfUnits, numberOfVehicles, numberOfShips, numberOfPlanes;


    }

    public int getUnitsQuantity() {
        HashSet<Unit> units = new HashSet<>();

        for (int x = 0; x < GameConfig.BOARD_WIDTH - 1; x++) {
            for (int y = 0; y < GameConfig.BOARD_HEIGHT - 1; y++) {
                if((fields[x][y]).getFragment() == null)
                    continue;
                else{
                    Unit tempUnit = fields[x][y].getFragment().getParent();
                    units.add(tempUnit);
                }
            }
        }
        return units.size();
    }

    public int getNumberOfVehicles() {
        return numberOfVehicles;
    }

    public int getNumberOfShips() {
        return numberOfShips;
    }

    public int getNumberOfPlanes() {
        return numberOfPlanes;
    }
}
