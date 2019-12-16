import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThingTest {

    @Test
    void it_should_be_commandable() {
        Rover rover = new Rover();
        char[] commands = {'f', 'f', 'l' };

        rover.command(commands);
    }

    @Test
    void it_should_have_initial_coordinates() {
        Rover rover = new Rover(10, 10);
        assertEquals(new Point(10, 10), rover.getPosition());
    }

    @Test
    void it_should_have_initial_direction() {
        Rover rover = new Rover(10, 10);
        assertEquals(0, rover.getDirection());
    }

    @Test
    void can_turn_right() {
        Rover rover = new Rover();
        rover.command(new char[] {'r'});
        assertEquals(90, rover.getDirection());
    }

    @Test
    void can_turn_left() {
        Rover rover = new Rover();
        rover.command(new char[] {'l'});
        assertEquals(270, rover.getDirection());
    }

    @Test
    void can_drive_forward() {
        Rover rover = new Rover();
        rover.command(new char[] {'f'});
        assertEquals(0, rover.getDirection());
        assertEquals(new Point(0, 10), rover.getPosition());
    }

    @Test
    void can_drive_backward() {
        Rover rover = new Rover();
        rover.command(new char[] {'b'});
        assertEquals(0, rover.getDirection());
        assertEquals(new Point(0, -10), rover.getPosition());
    }

    @Test
    void can_turn_left_and_drive_forward() {
        Rover rover = new Rover();
        rover.command(new char[] {'l', 'f'});
        assertEquals(270, rover.getDirection());
        assertEquals(new Point(-10, 0), rover.getPosition());
    }

}
