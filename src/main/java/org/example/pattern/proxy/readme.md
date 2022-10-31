# Proxy
- 서로 다른 원격지에서 메소드를 호출하고 싶을 때 사용하는 방법
- java.rmi.Remote 클래스를 이용한다.
- UnicastRemoteObject : 


### RMI 용어
1. RMI : Remote Method Invocation : 원격 메소드 호출
   - 클라이언트 -> 클라이언트 보조객체 -> (네트워크 IO) -> 서비스 보조객체 -> 서비스
2. stub : 클라이언트 보조객체
3. skeleton : 서비스 보조객체
