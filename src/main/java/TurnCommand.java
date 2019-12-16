public class TurnCommand implements MovementCommand {
    private int degreesToTurn;

    public TurnCommand(int degreesToTurn) {
        this.degreesToTurn = degreesToTurn;
    }

    public void apply(Movable rover) {
        rover.turn(degreesToTurn);
    }
}
