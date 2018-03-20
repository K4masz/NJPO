package view;

import core.Field;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import utils.enums.ETerrainType;

import java.util.HashMap;

public class FieldView extends Rectangle { //Obsługa pojedynczego kwadrata z planszy
    private static HashMap<ETerrainType, Color> terrainCodeColors;
    private Field field;

    static {
        terrainCodeColors = new HashMap<>();
        terrainCodeColors.put(ETerrainType.TERRAIN_TYPE_GROUND, Color.GREEN);
        terrainCodeColors.put(ETerrainType.TERRAIN_TYPE_WATER, Color.BLUE);
    }


    public FieldView(int width, int height) {
        super(width, height);
        this.field = new Field();
    }

    public FieldView(int width, int height, ETerrainType terrainType) {
        super(width, height);
        this.field = new Field(terrainType);
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public void applyAppearance() {
        this.setFill(this.getFillColor());
        this.setStroke(Color.BLACK);
    }

    private Color getFillColor() {
        if (this.field.getFragment() == null)
            return this.terrainCodeColors.get(this.field.getTerrainType());
        else
            return Color.BLACK;
    }
}
