package pastaApp;

import builderPattern.Pasta;
import builderPattern.PastaBuilder;
import builderPattern.Shapes;

public class Main {

	public static void main(String[] args) {
		Pasta pasta = new PastaBuilder().withShape(Shapes.Penne).withChicken(false).withOlive(true).build();
		
		System.out.println(pasta.getType());
		if(pasta.getOlive()!=null)
			System.out.println(pasta.getOlive().getType());
		if(pasta.getChicken()!=null)
			System.out.println(pasta.getChicken().getType());
	}

}
