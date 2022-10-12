package org.example.pattern.command.classes;

import org.example.pattern.command.interfaces.Command;

//커맨드를 호출하는 객체   => 리모컨 역할
// 리모콘은 객체가 뭘하는지 모름 단지 execute만 실행함
// invoker
public class SimpleRemoteControl {

    private Command slot;

    public SimpleRemoteControl() {

    }

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
