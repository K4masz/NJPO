package Units;

public class UnitFactory {

    public static Unit createUnit(EUnit type){

        switch (type){
            case AIRUNIT:
             //   return new AirUnit();

            case LANDUNIT:
             //   return new LandUnit();

            case WATERUNIT:
              //  return new WaterUnit();
        }
        return null;
    }
}
