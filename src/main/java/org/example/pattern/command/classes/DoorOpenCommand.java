package org.example.pattern.command.classes;

import org.example.pattern.command.interfaces.Command;

public class DoorOpenCommand implements Command {

    private Door door;

    public DoorOpenCommand(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.openDoor();
    }
}
