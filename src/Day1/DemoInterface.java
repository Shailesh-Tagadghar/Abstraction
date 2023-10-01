package Day1;

public interface DemoInterface {
    //public static final 
    int num = 10;
    double PI = 3.14;
    //final : declaration
    //final var value assignment : at the time of declaration only.
    //in interface we can not create constructor because they have static value so we can't create instance variable as well.

    //public and abstract methods
    void print();
    void show();
}

class Child implements DemoInterface{
    @Override
    public void print(){

    }

    @Override
     public void show(){

    }
}
