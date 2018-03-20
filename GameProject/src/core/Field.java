package core;



import core.elements.Fragment;
import core.elements.units.Plane;
import core.elements.units.Ship;
import core.elements.units.Vehicle;
import utils.enums.ETerrainType;
import utils.exceptions.InvalidTerrainException;

import java.util.Random;

public class Field{

    private ETerrainType terrainType;
    private Fragment fragment;

    public Field(ETerrainType terrainType) {
        this.terrainType = terrainType;
    }

    public Field(){
        this.terrainType = this.randTerrein();
    }

    public Fragment getFragment() {
        return fragment;
    }

    public void placeFragment(Fragment fragment) throws InvalidTerrainException { //TODO decompose on separate method, enums, classes?
        if (fragment.getParent() instanceof Plane)
            this.fragment = fragment;
        else if (fragment.getParent() instanceof Ship && this.terrainType.equals(ETerrainType.TERRAIN_TYPE_WATER))
            this.fragment = fragment;
        else if (fragment.getParent() instanceof Vehicle && this.terrainType.equals(ETerrainType.TERRAIN_TYPE_GROUND))
            this.fragment = fragment;
        else
            throw new InvalidTerrainException("Can't place"); //TODO append Unit.toString on Field.terrainType.toString();
    }

    public static ETerrainType randTerrein(){ //TODO rename
        ETerrainType[] terrains = ETerrainType.values();
        return terrains[new Random().nextInt(2)];
    }

    public ETerrainType getTerrainType() {
        return terrainType;
    }
}
