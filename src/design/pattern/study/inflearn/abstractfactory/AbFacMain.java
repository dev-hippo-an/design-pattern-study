package design.pattern.study.inflearn.abstractfactory;

import design.pattern.study.inflearn.abstractfactory.Concrete.ConcreteFactory;
import design.pattern.study.inflearn.abstractfactory.Concrete.FactoryInstance;
import design.pattern.study.inflearn.abstractfactory.abst.*;
import design.pattern.study.inflearn.abstractfactory.linux.LinuxGuiFactory;
import design.pattern.study.inflearn.abstractfactory.win.WIinGuiFactory;

public class AbFacMain {

    public static void main(String[] args) {
        BikeFactory factory = new ConcreteFactory();

        Body body = factory.createBody();
        Wheel wheel = factory.createWheel();

        System.out.println(body.getClass());
        System.out.println(wheel.getClass());


        GuiFactory factory1 = FactoryInstance.getGuiFactory();
        Button button = factory1.createButton();
        button.click();
        TextArea textArea = factory1.createTextArea();
        textArea.input();
    }
}
