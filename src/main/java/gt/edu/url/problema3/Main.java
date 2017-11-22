package gt.edu.url.problema3;

public class Main {
	Animal bambi = new Animal("salvaje", 10, "100 lbs.", "cafecito");
	LeakyStack<Animal> animalHistory = new ImplLeakyStack<>(1);
	bambi = animalHistory.saveHistory(bambi); //Push
	bambi.setSkinColor("cafe");
	bambi = animalHistory.saveHistory(bambi); //Push
	bambi.setSkinColor("cafe salvaje");
	System.out.println(bambi.getSkinColor());// Imprime caf´e salvaje
	bambi = animalHistory.undo(); //Pop
	System.out.println(bambi.getSkinColor());// Imprime caf´e
	bambi = animalHistory.undo(); //Lanza IllegalArgumentException por capacidad
}
