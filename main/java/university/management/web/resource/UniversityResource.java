package university.management.web.resource;

import java.net.*;
import java.util.HashMap;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import university.management.web.data.*;
import university.management.web.service.*;

@Path("/universitys")
public class UniversityResource {
	UniversityService service = new UniversityService();
	
	@Context
	UriInfo uriInfo;
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Response createUniversity(String name, String adress) {
		University u = service.createUniversity(name, adress);
		if(u == null) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		URI uri = uriInfo.getRequestUri();
		String newUri = uri.getPath() + "/" + u.getName();
		return Response.status(Response.Status.CREATED)
		               .entity(u)
		               .contentLocation(uri.resolve(newUri))
		               .build();
	}
	
	
	public Response createSpecialty(String name) {
		Specialty s = service.createSpecialty(name);
		if(s == null) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		URI uri = uriInfo.getRequestUri();
		String newUri = uri.getPath() + "/" + s.getName();
		return Response.status(Response.Status.CREATED)
		               .entity(s)
		               .contentLocation(uri.resolve(newUri))
		               .build();
	}
	
	public Response connectSpecialtyWithUniversity(String specialtyName, String universityName) {
		University u = service.connectSpecialtyWithUniversity(specialtyName,universityName);
		if(u == null) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		URI uri = uriInfo.getRequestUri();
		String newUri = uri.getPath() + "/" + u.getName();
		return Response.status(Response.Status.CREATED)
		               .entity(u)
		               .contentLocation(uri.resolve(newUri))
		               .build();
	}
	
	@GET
	@Path("/{name}")
	@Produces(MediaType.APPLICATION_XML)
	public Response findUniversityBySpecialty(@PathParam("name") String name) {
		HashMap<String, University> u =  service.findUniversityBySpecialty(name);
		if(u == null) {
			return Response.status(Response.Status.NOT_FOUND).build();
		}
		Link link = Link.fromUri(uriInfo.getRequestUri())
                .rel("self")
                .type("application/xml")
                .build();
		return Response.status(Response.Status.OK)
               .entity(u)
               .links(link)
               .build();

	}

}


