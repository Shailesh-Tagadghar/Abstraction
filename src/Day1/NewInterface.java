package Day1;

public interface NewInterface {
    //JDK 8 onwards, we can define CONCRETE METHODS within the interface
    // if we need to define the CONCRETE METHODS within interfaces, use default(instance)
    //static (class method) keyword

    default void one(){
        //can be overridden by child
        System.out.println("Its an instance method pf interface");
    }

    static void two(){
        //cant be overridden by child
        System.out.println("Its an static method pf interface");
    }

}


class NewChild implements NewInterface{
    public void one(){
        System.out.println("Its an instance method pf interface");
    } 

    static void two(){
        System.out.println("Its an static method pf interface");
    }
}