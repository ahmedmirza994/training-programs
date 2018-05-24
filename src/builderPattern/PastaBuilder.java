package builderPattern;

import builderPattern.Chicken.ChickenType;
import builderPattern.Olive.OliveType;

public class PastaBuilder {
	
	public boolean isChicken;
    public boolean isOlives;
    
    Types type = Types.Rigatoni;
    Shapes shape = Shapes.Macaroni;
    
    public PastaBuilder withShape(Shapes shape){
        this.shape = shape;
        return this;
    }

    public PastaBuilder withType(Types type){
        this.type = type;
        return this;
    }

    public PastaBuilder withOlive(boolean isOlives){
        this.isOlives = isOlives;
        return this;
    }

    public PastaBuilder withChicken(boolean isChicken){
        this.isChicken = isChicken;
        return this;
    }

    public Pasta build(){
        Pasta p1 = new Pasta();
        if(isChicken){
        	p1.setChicken(new Chicken(ChickenType.CHICKENCUBES));
        }
        if(isOlives){
        	p1.setOlive(new Olive(OliveType.BLACKOLIVE));
        }
        p1.setType(type);
        p1.setShape(shape);
        return p1;
    }
}
