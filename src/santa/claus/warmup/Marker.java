package santa.claus.warmup;

public class Marker {
    private int x, y;

    public Marker(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    public int getTaxiDistance(Marker end) {
        return Math.abs(x - end.getX()) + Math.abs(y - end.getY());
    }

    public int distanceFromOrigin() {
        return getTaxiDistance(new Marker(0,0));
    }

    @Override
    public String toString() {
        return "(" + Integer.toString(x) + ", " + Integer.toString(y) + ")";
    }
}
