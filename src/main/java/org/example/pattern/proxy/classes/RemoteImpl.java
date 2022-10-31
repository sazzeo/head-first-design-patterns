package org.example.pattern.proxy.classes;

import org.example.pattern.proxy.interfaces.MyRemote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class RemoteImpl extends UnicastRemoteObject implements MyRemote {

    private static final long serialVersionUID = 1L;

    public RemoteImpl() throws RemoteException {
    }

    @Override
    public String sayHello() throws RemoteException {
        return "serverSayHello";
    }

    public static void main(String[] args) {

        try {
            MyRemote myRemote = new RemoteImpl();
            Naming.rebind("remoteHello" , myRemote);  // 서비스 등록시 이름 지정하기
        } catch (RemoteException | MalformedURLException e) {
            e.printStackTrace();
        }

    }
}
