# 커맨드 패턴
- 작업을 요청하는 쪽(invoker)과 작업을 처리(receiver)하는 쪽을 분리함.
- 클라이언트(main클래스)가 호출 => invoker => receiver의 순서


## 구성
1. 커맨드 인터페이스
    -  excute만 존재한다.
2. 리모컨 역할 (invoker)
   - Command 구현체를 받아 excute를 실행한다.
   - 구현체는 필요에 따라 여러개를 받을 수 있다.
3. 실제 행동 객체 (Receiver)
   - command 구현체에 포함된 객체로 실제 행동을 가지고 있다. 
   - Door , Light 클래스
   