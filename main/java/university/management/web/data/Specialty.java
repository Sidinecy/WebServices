package university.management.web.data;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Specialty {
	private String name;
	
	public Specialty() {
		super();
	}
	public Specialty(String name) {

		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Specialty [name=" + name + "]";
	}
}
