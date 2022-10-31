package org.example.pattern.proxy.remoteproxy.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;



//클라이언트가 되는 클래스
//Remote클래스를 상속한다.
public interface MyRemote  extends Remote {


    //항상 필요한 RemoteException
    //전송될 return 값들은 serializable 필요함
    String sayHello() throws RemoteException;
}
