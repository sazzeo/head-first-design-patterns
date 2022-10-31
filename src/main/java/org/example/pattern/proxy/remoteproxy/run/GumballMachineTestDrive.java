package org.example.pattern.proxy.remoteproxy.run;

import org.example.pattern.proxy.remoteproxy.base.GumballMachine;
import org.example.pattern.proxy.remoteproxy.base.GumballMonitor;

public class GumballMachineTestDrive {

    public static void main(String[] args)  {
        int count = 0;

        GumballMachine gumballMachine= new GumballMachine("서울" ,10);

        GumballMonitor gumballMonitor = new GumballMonitor(gumballMachine);

        gumballMonitor.report();



    }

}
