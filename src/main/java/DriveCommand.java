public class DriveCommand implements MovementCommand {

    private int distance;

    public DriveCommand(int distance) {
        this.distance = distance;
    }

    @Override
    public void apply(Movable rover) {
        rover.drive(distance);
    }
}
