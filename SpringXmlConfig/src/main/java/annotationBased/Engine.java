package annotationBased;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {
	
	private int cc;
	private String type;
	
	public int getCc() {
		return cc;
	}
	
	@Value("12000")
	public void setCc(int cc) {
		this.cc = cc;
	}
	
	public String getType() {
		return type;
	}
	
	@Value("V8")
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Engine [cc=" + cc + ", type=" + type + "]";
	}
	
	

}
