
public class Tester {

	public static void main(String[] args) {	
		
		int PID = 11764806;
		
		Park p1 = new Park(PID,15);
		Park p2 = new Park(PID,30);
		Park p3 = new Park(PID,60);
		Park p4 = new Park(PID, Integer.MAX_VALUE);
		
		testPark(p1);
		testPark(p2);
		testPark(p3);
		testPark(p4);
		
	}
		
	public static void testPark(Park p){
		System.out.println(p.getLTD());
		System.out.println(p.getShape());
		System.out.println(p.parkType());
		System.out.println(p.parkArea());
		System.out.println(p.crowdLevel(12));
		System.out.println(p.crowdLevel(24));
		System.out.println(p.crowdLevel(48));
		System.out.println(p.crowdLevel(56));
		p.printTriangle("Michael");
		System.out.println(p.PantherID%6);
	}
		

}
