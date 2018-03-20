package core.elements.units;

import com.sun.javafx.geom.Point2D;
import core.elements.Fragment;

import java.awt.*;
import java.util.List;

public abstract class Unit {

    private List<Fragment> parts;

    public Unit(List<Fragment> parts) {
        this.parts = parts;
    }


    public boolean isDestroyed() {
        for (Fragment part : this.parts) {
            if (!part.isDestroyed())
                return false;
        }
        return true;
    }


}

