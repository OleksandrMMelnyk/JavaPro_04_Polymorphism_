package task2.obstacles;

public class Treadmill extends Obstacle {
    private int lenght;

    public Treadmill(String name, int lenght) {
        super(name);
        this.lenght = lenght;
    }

    public int getLenght() {
        return lenght;
    }

    public boolean overcome(int dist) {
        return dist >= lenght;
    }
}