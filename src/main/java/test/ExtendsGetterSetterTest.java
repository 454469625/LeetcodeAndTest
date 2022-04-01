package test;

public class ExtendsGetterSetterTest {
    public static void main(String[] args) {
        Son2 son = new Son2();
        son.setValue(18);
        System.out.println(son.getValue());
    }
}

class Father {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

class Son2 extends Father {
    private int name;

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

}
