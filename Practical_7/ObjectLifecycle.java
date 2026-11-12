class LifecycleExample {

    LifecycleExample() {
        System.out.println("LifecycleExample object constructed.");
    }

    void use() {
        System.out.println("Using the object.");
    }
}

public class ObjectLifecycle {

    public static void main(String[] args) {
        LifecycleExample example = new LifecycleExample();
        example.use();

        example = null; // No reachable reference to this object remains.
        System.out.println("Reference cleared; object may now be garbage collected.");
        System.gc(); // A request only; the JVM may ignore or delay it.
        System.out.println("Garbage collection was requested.");

        // Java manages memory automatically. An unreachable object is eligible
        // for collection, but collection time is not guaranteed. Unlike C++,
        // Java has no deterministic destructor; use try-with-resources for
        // resources that need prompt cleanup. Correctness must not depend on GC.
    }
}
