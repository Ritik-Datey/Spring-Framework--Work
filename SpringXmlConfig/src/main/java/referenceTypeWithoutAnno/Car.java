package referenceTypeWithoutAnno;

public class Car {
	
	private String module;
	private String brand;
	private double price;
	private Engine engine;
	
	public Car(String module, String brand, double price, Engine engine) {
		super();
		this.module = module;
		this.brand = brand;
		this.price = price;
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [module=" + module + ", brand=" + brand + ", price=" + price + ", engine=" + engine + "]";
	}
	
}
