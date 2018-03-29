
public class FruitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit fr1 = new Fruit("apple");
		Fruit fr2 = new Fruit("orange");
		Fruit fr3 = new Fruit("plum");
		Fruit fr4 = new Fruit("apple");
		
//		System.out.println(fr1.getName());
//		System.out.println(fr1.makeJuice());
//		System.out.println(fr1.makeSlices());
		
		Fresh fresh1 = new Fresh();
		for (int i = 0; i < fresh1.Juices.size(); i++) {
			System.out.println(fresh1.Juices.get(i).getName());
		}
		System.out.println(fresh1.Juices.size());
		
		System.out.println("I try add apple!");
		fresh1.addToJuices(fr1);
		
		System.out.println("My fruits:");
		for (int i = 0; i < fresh1.Juices.size(); i++) {
			System.out.println(fresh1.Juices.get(i).getName());
		}
		System.out.println();
		
		System.out.println("I try add orange!");
		fresh1.addToJuices(fr2);
		
		System.out.println("My fruits:");
		for (int i = 0; i < fresh1.Juices.size(); i++) {
			System.out.println(fresh1.Juices.get(i).getName());
		}
		System.out.println();
		
		System.out.println("I try add plum!");
		fresh1.addToJuices(fr3);
		
		System.out.println("My fruits:");
		for (int i = 0; i < fresh1.Juices.size(); i++) {
			System.out.println(fresh1.Juices.get(i).getName());
		}
		System.out.println();
		
		System.out.println("I try add apple again!");
		fresh1.addToJuices(fr1);
		
		System.out.println("My fruits:");
		for (int i = 0; i < fresh1.Juices.size(); i++) {
			System.out.println(fresh1.Juices.get(i).getName());
		}
		System.out.println();
		
		System.out.println(fresh1.Juices.size());
		
		fresh1.makeFresh();
		System.out.println(fresh1.Juices.size());
		
	}
}
