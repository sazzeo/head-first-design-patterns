package org.example.pattern.proxy.remoteproxy.classes;

import org.example.pattern.proxy.remoteproxy.interfaces.MyRemote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class Run {

    public static void main(String[] args) {

        try {
            MyRemote myRemote = new RemoteImpl();
            Naming.rebind("remoteHello" , myRemote);  // 서비스 등록시 이름 지정하기
        } catch (RemoteException | MalformedURLException e) {
            e.printStackTrace();
        }

    }
}
