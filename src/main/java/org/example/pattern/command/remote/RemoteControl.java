package org.example.pattern.command.remote;

import org.example.pattern.command.interfaces.Command;


//커맨드 리모콘 확장하기 =>여러 커맨드 객체들이 존재할경우

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;

    public RemoteControl() {
        this.onCommands = new Command[7];
        this.offCommands = new Command[7];
    }

    public void setOnCommands(int i , Command onCommands) {
        this.onCommands[i] = onCommands;
    }

    public void setOffCommands(int i,Command offCommands) {
        this.offCommands[i] = offCommands;
    }

    public void onButtonWasPushed(int i) {
        onCommands[i].execute();
    }

    public void offButtonWasPushed(int i) {
        offCommands[i].execute();
    }
}
