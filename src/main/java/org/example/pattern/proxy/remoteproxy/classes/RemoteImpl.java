package org.example.pattern.proxy.remoteproxy.classes;

import org.example.pattern.proxy.remoteproxy.interfaces.MyRemote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class RemoteImpl extends UnicastRemoteObject implements MyRemote {

    private static final long serialVersionUID = 2L;

    public RemoteImpl() throws RemoteException {
    }

    @Override
    public String sayHello() throws RemoteException {
        return "serverSayHello";
    }


}
