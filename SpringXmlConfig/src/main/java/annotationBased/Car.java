package annotationBased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	private String module;
	private String brand;
	private double price;
	private Engine engine;
	
	

	public Car(@Value("RS07") String module,@Value("Audi") String brand,@Value("2000000") double price,@Autowired Engine engine) {
		super();
		this.module = module;
		this.brand = brand;
		this.price = price;
		this.engine=engine;
	}



	@Override
	public String toString() {
		return "Car [module=" + module + ", brand=" + brand + ", price=" + price + ", engine=" + engine + "]";
	}
	
	

}
