import edu.navi.creationDesignPatterns.abstractFactoryDesignPattern.ComputerBuilderFactory;
import edu.navi.creationDesignPatterns.builder.Car;
import edu.navi.creationDesignPatterns.factory.ShapeFactory;
import edu.navi.creationDesignPatterns.prototype.ColorProtype;
import edu.navi.creationDesignPatterns.singletonDesignPattern.SingleTon;

import java.util.Scanner;


public class Invoker {
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER PATTERN THAT YOU WANT TEST");
        String pattern = sc.nextLine();
        switch(pattern) {
            case "FactoryPattern":
                testFactoryPattern();
                break;
            case "SingletonPattern":
                testSingleTonPattern();
                break;
            case "AbstractFactoryPattern":
                testAbstractFactoryPattern();
                break;
            case "Builder":
                testBuilderPattern();
                break;
            case "ProtoType":
                testPrototypePattern();
                break;
            default:
                System.out.println(pattern + "Not yet configured");
        }
    }

    private static void testFactoryPattern() {
        ShapeFactory shapeFactory = new ShapeFactory();
        shapeFactory.getShape("CIRCLE").draw();
    }

    private static void testSingleTonPattern() {
        //SingleTon singleTon = new SingleTon(); Not possible
        System.out.println("OBJECT count" + SingleTon.objectCount);
        SingleTon.getSingleTonInstance();
        SingleTon.getSingleTonInstance();
        System.out.println("OBJECT count" + SingleTon.objectCount);
        SingleTon.getSingleTonInstance();
        System.out.println("OBJECT count" + SingleTon.objectCount);
    }

    private static void testAbstractFactoryPattern() {
        ComputerBuilderFactory computerBuilderFactory = new ComputerBuilderFactory();
        computerBuilderFactory.getComputerFactory("INTEL").build();
        computerBuilderFactory.getComputerFactory("ARM").build();
    }

    private static void testBuilderPattern() {
        new Car.Builder().brand("HONDA").makeYear(2014).build();
    }

    private static void testPrototypePattern() throws CloneNotSupportedException {
        ColorProtype.getColorPrototype("RED").drawColor();
        ColorProtype.getColorPrototype("BLACK").drawColor();
    }
}
