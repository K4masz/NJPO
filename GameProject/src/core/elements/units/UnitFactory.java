package core.elements.units;

import utils.enums.EUnitType;

public class UnitFactory {
    public static Unit createUnit(EUnitType type) {
        switch (type) {
            case SHIP:
             //   return new Ship();
            break;
            case PLANE:
             //   return new Plane();
            break;
            case VEHICLE:
              //  return new Vehicle();
            break;
        }
        return null;
    }
}
