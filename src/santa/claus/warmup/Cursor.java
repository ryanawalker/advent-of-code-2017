package santa.claus.warmup;

import java.util.ArrayList;

public class Cursor {

    private int x, y;
    private ArrayList<Marker> markersA = new ArrayList<>();
    private ArrayList<Marker> markersB = new ArrayList<>();

    public Cursor() {
        x = 0;
        y = 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public ArrayList<Marker> getMarkersA() {
        return new ArrayList<>(markersA);
    }

    public ArrayList<Marker> getMarkersB() {
        return new ArrayList<>(markersB);
    }

    public void moveRight() {
        x += 1;
    }

    public void moveLeft() {
        x -= 1;
    }

    public void moveUp() {
        y += 1;
    }

    public void moveDown() {
        y -= 1;
    }

    public void placeA() {
        markersA.add(new Marker(x, y));
    }

    public void placeB() {
        markersB.add(new Marker(x, y));
    }
}
