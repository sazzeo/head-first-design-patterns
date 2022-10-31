package org.example.pattern.proxy.run;

import org.example.pattern.proxy.base.GumballMachine;
import org.example.pattern.proxy.base.GumballMonitor;
import org.example.pattern.proxy.classes.RemoteImpl;
import org.example.pattern.proxy.interfaces.MyRemote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class GumballMachineTestDrive {

    public static void main(String[] args)  {
        int count = 0;

        GumballMachine gumballMachine= new GumballMachine("서울" ,10);

        GumballMonitor gumballMonitor = new GumballMonitor(gumballMachine);

        gumballMonitor.report();



    }

}
