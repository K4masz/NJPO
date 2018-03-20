package core.elements;

import core.elements.units.Unit;

public class Fragment {

    private Unit parent;
    private boolean destroyed;

    public Fragment(Unit parentObj) {
        this.parent = parent;
        this.destroyed = false;
    }

    public Unit getParent() {
        return parent;
    }

    public void setParent(Unit parent) {
        this.parent = parent;
    }

    public boolean isDestroyed() {
        return destroyed;
    }

    public void setDestroyed(boolean destroyed) {
        this.destroyed = destroyed;
    }
}
