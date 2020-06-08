package simsen.simapi;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("linepath")
public class LineMove {
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{mouseFirstX}/{mouseFirstY}/{mouseNextX}/{mouseNextY}/{newPoint}")
	public Response getLine(@PathParam("mouseFirstX") double mouseFirstX,@PathParam("mouseFirstY") double mouseFirstY,@PathParam("mouseNextX") double mouseNextX,@PathParam("mouseNextY") double mouseNextY,@PathParam("newPoint") boolean newPoint) {
		
		
		TestNative t= new TestNative();
		Coordinates points=new Coordinates();
		
		
	
		
	    double[] linC= t.retMovePointer(mouseFirstX,mouseFirstY,mouseNextX,mouseNextY,newPoint);
	    
	    points.setX(Double.toString(linC[0]));
	    points.setY(Double.toString(linC[1]));
	   
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
