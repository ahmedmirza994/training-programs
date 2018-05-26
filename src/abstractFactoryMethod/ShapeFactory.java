package abstractFactoryMethod;

public class ShapeFactory extends AbstractFactory {
	public Shape getShape(String shapeType){
		if(shapeType == null){
			return null;
		}
		if(shapeType.equalsIgnoreCase("circle")){
			return new Circle();
		}
		else if(shapeType.equalsIgnoreCase("square")){
			return new Square();
		}
		else if(shapeType.equalsIgnoreCase("triangle")){
			return new Triangle();
		}
		return null;
	}

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}
}
