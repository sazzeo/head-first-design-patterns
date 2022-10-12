package org.example.pattern.command.classes;

import org.example.pattern.command.interfaces.Command;

//무엇을 할지 구체적으로 정한다.
public class LightOnCommand implements Command {

    private Light light;  //제어할 객체

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
