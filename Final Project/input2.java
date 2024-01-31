public class X {
    Y y;
    int value = 10;
}

public class Y extends Z {
    X x;
    String name = "Example";
}

public class Z {
    boolean active = true;
    void startProcess() {
        System.out.println("Process started!");
    }
}
