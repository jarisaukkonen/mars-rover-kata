public interface MovementCommand {
    void apply(Movable rover);

    static MovementCommand forCommand(char command) {
        switch (command) {
            case 'r': return new TurnCommand(90);
            case 'l': return new TurnCommand(-90);
            case 'f': return new DriveCommand(10);
            case 'b': return new DriveCommand(-10);
            default: throw new IllegalArgumentException();
        }
    }
}
