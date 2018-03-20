package Game;

public class Field {
    private RoadUser user;

    public Field() {
        user = null;
    }

    public RoadUser getUser() {
        return user;
    }

    public void setUser(RoadUser user) {
        this.user = user;
    }

    public boolean isEmpty(){
        return this.user == null ?  true :  false;
    }
}
