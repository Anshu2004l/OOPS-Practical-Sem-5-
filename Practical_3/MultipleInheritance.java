
interface Printable {

    void print();
}

interface Scannable {

    void scan();
}

class AllInOnePrinter implements Printable, Scannable {

    public void print() {
        System.out.println("Printing document...");
    }

    public void scan() {
        System.out.println("Scanning document...");
    }
}

// A hybrid structure combines class inheritance with interface implementation.
class Machine {

    void powerOn() {
        System.out.println("Machine is powered on.");
    }
}

interface Faxable {

    void fax();
}

class MultiFunctionPrinter extends Machine implements Printable, Scannable, Faxable {

    public void print() {
        System.out.println("Multi-function printer is printing...");
    }

    public void scan() {
        System.out.println("Multi-function printer is scanning...");
    }

    public void fax() {
        System.out.println("Multi-function printer is sending a fax...");
    }
}

public class MultipleInheritance {

    public static void main(String[] args) {

        AllInOnePrinter printer = new AllInOnePrinter();

        printer.print();
        printer.scan();

        System.out.println("\nHybrid inheritance demonstration:");
        MultiFunctionPrinter multiFunctionPrinter = new MultiFunctionPrinter();
        multiFunctionPrinter.powerOn();
        multiFunctionPrinter.print();
        multiFunctionPrinter.scan();
        multiFunctionPrinter.fax();

        // Java classes can extend only one class, avoiding ambiguity when
        // different parent classes define the same method or field. A class
        // can implement multiple interfaces, so it can provide several
        // capabilities without inheriting multiple class implementations.
    }
}
