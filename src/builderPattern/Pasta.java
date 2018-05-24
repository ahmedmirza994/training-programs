package builderPattern;

public class Pasta {
	
    public Chicken chicken;
    public Olive olive;
    
    public Types type = Types.Rigatoni;
    public Shapes shape = Shapes.Macaroni;

    Pasta(){

    }

    public Shapes getShape() {
		return shape;
	}
    
    public Types getType() {
		return type;
	}

	public Chicken getChicken() {
		return chicken;
	}

	void setChicken(Chicken chicken) {
		this.chicken = chicken;
	}

	public Olive getOlive() {
		return olive;
	}

	void setOlive(Olive olive) {
		this.olive = olive;
	}

	void setType(Types type) {
		this.type = type;
	}

	void setShape(Shapes shape) {
		this.shape = shape;
	}
    
    
    
}
