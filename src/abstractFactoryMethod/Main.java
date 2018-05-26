package abstractFactoryMethod;

public class Main {

	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
		Shape shape1 = shapeFactory.getShape("square");
		shape1.draw();
		Shape shape2 = shapeFactory.getShape("circle");
		shape2.draw();
		Shape shape3 = shapeFactory.getShape("triangle");
		shape3.draw();
		System.out.println("\n\n\n\n");
		AbstractFactory colorFactory = FactoryProducer.getFactory("color");
		Color color1 = colorFactory.getColor("red");
		color1.fill();
		Color color2 = colorFactory.getColor("green");
		color2.fill();
		Color color3 = colorFactory.getColor("blue");
		color3.fill();
	}

}
