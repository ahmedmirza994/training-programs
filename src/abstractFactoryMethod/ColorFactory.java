package abstractFactoryMethod;

public class ColorFactory extends AbstractFactory {

	@Override
	public Color getColor(String color) {
		if(color == null){
			return null;
		}
		else if(color.equalsIgnoreCase("red")){
			return new Red();
		}
		else if(color.equalsIgnoreCase("green")){
			return new Green();
		}
		else if(color.equalsIgnoreCase("blue")){
			return new Blue();
		}
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
