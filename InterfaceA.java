public interface InterfaceA {

    default void whereAmI() {
        System.out.println("I'm in InterfaceA");
    }

    void otherMethod();
}