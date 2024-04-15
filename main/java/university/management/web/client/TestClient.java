package university.management.web.client;

import java.util.Set;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import org.apache.cxf.jaxrs.client.*;
import university.management.web.data.*;
import university.management.web.service.*;

public class TestClient {
	private static String webServiceUrl = "http://localhost:8080/university.management.web/api/universitys";

	  public static void main(String[] args) {
	    Specialty MIPI = new Specialty("MIPI");
	    University CY = new University("CY","2 avenue Adlophe Chauvin",MIPI);

	    get(CY.getName());
	    
	  }
	  /*private static Integer add(String name, Float grade) {
		    System.out.print("Adding " + name + "... ");
		    WebClient c = WebClient.create(webServiceUrl);
		    Student s = new Student(name, grade);
		    Response r = c.post(s);
		    if(r.getStatus() == 400) {
		      System.out.println("Oops!");
		      return null;
		    }
		    String uri = r.getHeaderString("Content-Location");
		    System.out.println("OK.");
		    return Integer.parseInt(uri.substring(uri.lastIndexOf('/') + 1));
		  }
		  
		  private static Boolean set(Integer id) {
		    System.out.print("Setting " + id + "... ");
		    WebClient c = WebClient.create(webServiceUrl).path(id);
		    int status = c.delete().getStatus();
		    if(status == 200) {
		      System.out.println("OK.");
		      return true;
		    }
		    System.out.println("Oops!");
		    return false;
		  }
*/
		  private static University get(String id) {
		    System.out.print("Getting " + id + "... ");
		    WebClient c = WebClient.create(webServiceUrl).path(id);
		    University s = null;
		    try {
		      s = c.get(University.class);
		      System.out.println(s.toString());
		    } catch(NotFoundException e) {
		      System.out.println("Oops!");
		    }
		    return s;
		  }


}
