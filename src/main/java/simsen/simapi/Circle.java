package simsen.simapi;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;



@Path("circlepath")
public class Circle {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getCircle() {
		
		
		TestNative t= new TestNative();
		Coordinates points=new Coordinates();
	    double[] cirC= t.retCircle();
	    
	    points.setX(Double.toString(cirC[0]));
	    points.setY(Double.toString(cirC[1]));
	   
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
