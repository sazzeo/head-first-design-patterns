# 헤드퍼스트 디자인패턴
### 디자인 원칙
1. 애플리케이션에서 달라지는 부분을 찾아내고 달라지지 않는 부분과 분리한다. (캡슐화)
2. 구현보다는 인터페이스에 맞춰서 프로그래밍한다.
3. 상속보다는 구성을 활용한다.
4. 상호작용하는 객체 사이에는 가능하면 느슨한 결합을 사용해야 한다.
5. 클래스는 확장에는 열려있어야 하지만 변경에는 닫혀있어야한다.(OCP) => 기존 코드는 수정하지 않으면서 새로운 행동을 추가해야 한다.
6. 

### 객체지향 5원칙
1. OCP (Open Closed Principle) : 개방 폐쇄 원칙   
- 객체는 확장에는 열려있어야 하고 변경에는 닫혀있어야 한다.
2. SRP (Single Responsibility Principle) : 단일 책임 원칙
- 객체는 오직 하나의 책임을 가져야 한다.
3. LSP (Liskov Substitution Principle) : 리스코프 치환 원칙
- 자식클래스는 부모클래스를 항상 대체할 수 있다.
4. ISP (Interface Segregation Principle) : 인터페이스 분리 원칙
- 클라이언트에서 사용하지 않는 메서드는 사용해선 안된다.
5. DIP (Dependency Inversion Principle) : 의존성 역전 원칙

### 구성과 위임의 개념
1. 구성(composition) : 한 클래스가 다른 클래스를 필드로 가지고 있는 것. (has a 관계)
2. 위임(delegation) : 어떤 기능을 자신이 처리하지 않고 다른 객체가 처리하도록 하는 것.

