package simsen.simapi;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
@Path("eightpath")
public class Eight {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getEight() {
		
		
		TestNative t= new TestNative();
		Coordinates points=new Coordinates();
	    double[] eigC= t.retEight();
	    
	    points.setX(Double.toString(eigC[0]));
	    points.setY(Double.toString(eigC[1]));
	   
	      return Response
	    	      .status(200)
	    	      .header("Access-Control-Allow-Origin", "*")
	    	      .header("Access-Control-Allow-Credentials", "true")
	    	      .header("Access-Control-Allow-Headers",
	    	        "origin, content-type, accept, authorization")
	    	      .header("Access-Control-Allow-Methods", 
	    	        "GET, POST, PUT, DELETE, OPTIONS, HEAD")
	    	      .entity(points)
	    	      .build();
	}

}
