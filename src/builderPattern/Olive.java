package builderPattern;

public class Olive {
	private OliveType type;
	public enum OliveType {
		WHITEOLIVE,
		BLACKOLIVE,
	}
	public Olive(OliveType oliveType){
		this.setType(oliveType);
	}
	public OliveType getType() {
		return type;
	}
	public void setType(OliveType type) {
		this.type = type;
	}
}
