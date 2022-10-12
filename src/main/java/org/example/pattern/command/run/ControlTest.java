package org.example.pattern.command.run;

import org.example.pattern.command.classes.*;

public class ControlTest {

    public static void main(String[] args) {
        LightOnCommand lightOnCommand = new LightOnCommand(new Light());
        DoorOpenCommand doorOpenCommand = new DoorOpenCommand(new Door());
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();

        //simpleRemoteControl => 리모컨 역할 : 실제로 어떤 행동을 하는지는 관심 없음.
        simpleRemoteControl.setCommand(lightOnCommand);
        simpleRemoteControl.buttonWasPressed();

        simpleRemoteControl.setCommand(doorOpenCommand);
        simpleRemoteControl.buttonWasPressed();
    }
}
