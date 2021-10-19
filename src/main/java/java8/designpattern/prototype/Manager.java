package java8.designpattern.prototype;

import java.util.HashMap;

public class Manager {
    /**
     * register를 통해 HashMap에  key:value로 인스턴스를 저장합니다.
     * create에서 protoname(==key)를 인자값으로 받아 HashMap에서 꺼내어 해당 인스턴스의 구현 메서드인 createClone()을 호출해 메서드를 복사해 반환합니다.
     * Product라는 인터페이스이름만 가지고 사용하고 있기에 실제 구현클래스와의 관계를 맺지 않습니다.
     */

    private final HashMap<String, Product> showcase = new HashMap<>();
    public void register(String name, Product product){
        showcase.put(name, product);
    }

    public Product create(String protoname){
        Product p = showcase.get(protoname);
        return p.createClone();
    }
}
