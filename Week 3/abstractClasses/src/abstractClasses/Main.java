package abstractClasses;

public class Main {

	public static void main(String[] args) {
		// abstract bir sınıfın abstract olabilmesi için içinde 'abstract' imzası barındırması gerekir.
		// abstract classlar newlenmez
		GameCalculator gameCalculator = new WomanGameCalculator();
	}

}
