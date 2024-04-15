package university.management.web.data;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class University {
	private String name;
    private String address;
	private Specialty specialty;
	
	
	
	public University(String name, String address, Specialty specialty) {
		this.name = name;
		this.address = address;
		this.specialty = specialty;
	}

	public University() {
		// TODO Auto-generated constructor stub
	}

	public University Create(String adr, String name) {
		University u= new University();
		u.setName(name);
		u.setAddress(adr);
		
		u.specialty=null;
	    
		return u;
		
	}
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Specialty getSpecialty() {
		return specialty;
	}

	public void setSpecialty(Specialty specialty) {
		this.specialty = specialty;
	}

	@Override
	public String toString() {
		return "University [name=" + name + ", address=" + address + ", specialty="+ specialty.getName();
	}
}
