public interface InterfaceB {

    default void whereAmI() {
        System.out.println("I'm in InterfaceB");
    }

    void otherMethod();
}