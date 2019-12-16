import java.awt.*;

public class Rover implements Movable {

    private PositionComputer position;
    private int direction;

    public Rover() {
        this(0, 0);
    }

    public Rover(int x, int y) {
        this.position = new PositionComputer(x, y);
        this.direction = 0;
    }

    public void command(char[] commands) {
        for (char command : commands) {
            MovementCommand.forCommand(command).apply(this);
        }
    }

    public Point getPosition() {
        return position.getPosition();
    }

    @Override
    public void drive(int distance) {
        position.drive(direction, distance);
    }

    @Override
    public void turn(int direction) {
        this.direction = (direction + 360) % 360;
    }

    public int getDirection() {
        return direction;
    }
}
