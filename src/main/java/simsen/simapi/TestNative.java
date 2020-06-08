package simsen.simapi;

public class TestNative {
	static {
		System.load("C:\\Users\\Ruvin Thulana\\eclipse-workspaceWebEE\\simapi\\TestNative.dll");
		 }
	
	 private native double[] drawCircleShape();
	 private native double[] drawEightShape();
	 private native double[] drawGroundShape();
	 private native double[] movePointer(double mouseFirstX,double mouseFirstY,double mouseNextX,double mouseNextY,boolean newPoint );

	public double[] retCircle() {
		
		double[] cirResults=new TestNative().drawCircleShape();
		
		return cirResults;
	}
	
	
public double[] retEight() {
		
		double[] eigResults=new TestNative().drawEightShape();
		
		return eigResults;
	}


public double[] retGround() {
	
	double[] groResults=new TestNative().drawGroundShape();
	
	return groResults;
}
public double[] retMovePointer(double mouseFirstX,double mouseFirstY,double mouseNextX,double mouseNextY,boolean newPoint ) {
	System.out.println("fired"+mouseFirstX);
	System.out.println("fired"+mouseFirstY);
	System.out.println("fired"+mouseNextX);
	System.out.println("fired"+mouseNextY);
	System.out.println("fired"+newPoint);
	double[] poiResults=new TestNative().movePointer(mouseFirstX,mouseFirstY,mouseNextX,mouseNextY,newPoint);
	System.out.println("fired"+poiResults[0]);
	System.out.println("fired"+poiResults[1]);
	return poiResults;
}









}