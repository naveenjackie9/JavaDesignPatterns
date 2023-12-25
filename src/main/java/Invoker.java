import edu.navi.creationDesignPatterns.abstractFactoryDesignPattern.ComputerBuilderFactory;
import edu.navi.creationDesignPatterns.builder.Car;
import edu.navi.creationDesignPatterns.factory.ShapeFactory;
import edu.navi.creationDesignPatterns.prototype.ColorProtype;
import edu.navi.creationDesignPatterns.singletonDesignPattern.SingleTon;
import edu.navi.structuralDesignPatterns.Adapter.Sparrow;
import edu.navi.structuralDesignPatterns.Adapter.SqueakyDuckAdapter;
import edu.navi.structuralDesignPatterns.Bridge.AssembleWorkShop;
import edu.navi.structuralDesignPatterns.Bridge.BikeVehicle;
import edu.navi.structuralDesignPatterns.Bridge.CarVehicle;
import edu.navi.structuralDesignPatterns.Bridge.ProduceWorkShop;
import edu.navi.structuralDesignPatterns.Decorator.Circle;
import edu.navi.structuralDesignPatterns.Decorator.Rectangle;
import edu.navi.structuralDesignPatterns.Decorator.RedOutLineShapeDecorator;
import edu.navi.structuralDesignPatterns.Iterator.CarIterator;

import java.util.Iterator;
import java.util.List;
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
            case "Adapter":
                testAdapterPattern();
                break;
            case "Bridge":
                testBridgePattern();
                break;
            case "Decorator":
                testDecorator();
                break;
            case "Iterator":
                testIterator();
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

    private static void testAdapterPattern() {
        Sparrow sparrow = new Sparrow();
        SqueakyDuckAdapter squeakyDuckAdapter = new SqueakyDuckAdapter(sparrow);
        squeakyDuckAdapter.squeak();
    }

    private static void testBridgePattern() {
        AssembleWorkShop assembleWorkShop = new AssembleWorkShop();
        ProduceWorkShop produceWorkShop = new ProduceWorkShop();

        BikeVehicle bikeVehicle = new BikeVehicle(List.of(assembleWorkShop, produceWorkShop));
        CarVehicle carVehicle = new CarVehicle(List.of(assembleWorkShop));

        bikeVehicle.manufacture();
        carVehicle.manufacture();
    }

    private static void testDecorator() {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        RedOutLineShapeDecorator redOutLineShapeDecorator = new RedOutLineShapeDecorator(circle);
        redOutLineShapeDecorator.draw();
        redOutLineShapeDecorator = new RedOutLineShapeDecorator(rectangle);
        redOutLineShapeDecorator.draw();
    }

    private static void testIterator() {
        CarIterator carIterator = new CarIterator();
        carIterator.addCar("MARUTI");
        carIterator.addCar("HONDA");
        Iterator<String> carIterators = carIterator.iterator();
        while (carIterators.hasNext()) {
            System.out.println(carIterators.next());
        }
    }
}
