import java.awt.*;

public class PositionComputer {
    private Point position;

    public PositionComputer(int x, int y) {
        this.position = new Point(x, y);
    }

    public void drive(int direction, int distance) {
        switch (direction) {
            case 0:
                position.y += distance;
                break;
            case 90:
                position.x += distance;
                break;
            case 180:
                position.y -= distance;
                break;
            case 270:
                position.x -= distance;
                break;
        }
    }

    public Point getPosition() {
        return position;
    }
}
