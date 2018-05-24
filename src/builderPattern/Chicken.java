package builderPattern;

public class Chicken {
	private ChickenType type;
	public enum ChickenType{
		CHICKENCUBES,
	}
	public Chicken(ChickenType chickenType) {
		// TODO Auto-generated constructor stub
		this.setType(chickenType);
	}
	public ChickenType getType() {
		return type;
	}
	public void setType(ChickenType type) {
		this.type = type;
	}
	
}
