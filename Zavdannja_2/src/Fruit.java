
public class Fruit implements IJuiceable, ISliceable {
	
	private String name;
	
	//public Fruit() { };
	
	public Fruit (String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String makeSlices() {
		// TODO Auto-generated method stub
		String s = "Juice from " + name;
		return s;
	}

	@Override
	public String makeJuice() {
		// TODO Auto-generated method stub
		String s = "Slice from " + name;
		return s;
	}

}
