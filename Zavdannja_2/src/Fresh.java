import java.util.ArrayList;

public class Fresh {
	ArrayList<Fruit> Juices = new ArrayList<>();
	private ArrayList<Fruit> Slices = new ArrayList<>();
	boolean isFruit;
	
	public void addToJuices(Fruit fruit) {
		isFruit = checkFruit(Juices, fruit);
		System.out.println(isFruit);
		if (!isFruit) {
			Juices.add(fruit);
			//System.out.println("Success");
		}
	}

	public boolean checkFruit(ArrayList<Fruit> arr, Fruit fruit) {
		//boolean isFruit = false;
		for (Fruit fr : arr) {
			//System.out.println("This is " + fr.getName());
			if (fr.getName().equals(fruit.getName())) {
				isFruit = true;
				break;
			}
		}
		return isFruit;
	}
	
	public void addToSlices(Fruit fruit) {
		isFruit = checkFruit(Slices, fruit);
		System.out.println(isFruit);
		if (!isFruit) {
			Slices.add(fruit);
		}
	}
	
	public void makeFresh() {
		Juices = new ArrayList<>();
		Slices = new ArrayList<>();
	}	
}
