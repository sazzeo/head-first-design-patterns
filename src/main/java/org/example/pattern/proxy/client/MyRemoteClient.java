package org.example.pattern.proxy.client;

import org.example.pattern.proxy.interfaces.MyRemote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;


//클라이언트 객체
public class MyRemoteClient {

    public void go() throws MalformedURLException {
        try {
            MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/remoteHello");
            String message = service.sayHello();

            System.out.println(message);
        }
        catch (NotBoundException | RemoteException e) {
            throw new RuntimeException(e);
        }


    }
}
