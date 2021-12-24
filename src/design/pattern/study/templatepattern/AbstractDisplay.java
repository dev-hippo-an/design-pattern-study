package design.pattern.study.templatepattern;

import java.util.stream.Stream;

public abstract class AbstractDisplay {
    public final void display() {
        open();
        for(int i = 0; i < 5; i++) {
            print();
        }
        close();
    }

    abstract void open();
    abstract void print();
    abstract void close();
}
