// Michael
// Fralish
// PID: 001-17-6489

public class Park {
	
	int PantherID;
	private int length;
	private int capacity;
	private String shape;
	
	public Park() {
		PantherID = 0;
		length = getLTD();
		capacity = 0;
		shape = getShape();
	}
	
	public Park(int MichaelID) {
		PantherID = MichaelID;
		length = getLTD();
		shape = getShape();
	}
	
	public Park(int MichaelID, int capacity) {
		PantherID = MichaelID;
		length = getLTD();
		this.capacity = capacity;
		shape = getShape();
	}
	
	public String parkType() {
		if (capacity<30) return "Small";
		else if (capacity>=30&&capacity<60) return "Medium";
		else return "Large";
	}
	
	public double parkArea() {
		if(getShape().equals("Circle")) return (Math.PI * length * length);
		else return (length * length);
	}
	
	public String crowdLevel(int x) {
		double ppf = (x/this.parkArea());
		
		if (x>capacity) return "Overload";
		
		if (ppf<1) return "Not Crowded";
		else if (ppf>=1&&ppf<3) return "Crowded";
		else return "Very Crowded";
	}
	
	public int getLTD() {
		return (PantherID%100);
	}
	
	public String getShape() {
		if (PantherID%2==1) return "Circle";
		else return "Square";
	}
	
	public void printTriangle(String name) {
		int l = name.length();
		
		int method = (PantherID%6);
		
		if (method == 0) {
			for(int i = 0;i < l;i++) {
				for(int j = l-i-1;j<l;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
		}
		
		else if (method == 1) {
			int i = 0;
			while (i<l) {
				int j = l-i-1;
				while (j<l) {
					System.out.print("*");
					j++;
				}
				System.out.println();
				i++;
			}
		}
		
		else if (method == 2) {
			int i = 0;
			do {
				int j = l-i-1;
				do {
					System.out.print("*");
					j++;
				}
				while (j<l);
				
				System.out.println();
				i++;
			}
			while (i<l);
		}
		
		else if (method == 3) {
			for(int i = 0;i < l;i++) {
				for(int j = l-i;j>0;j--) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		else if (method == 4) {
			int i = 0;
			while(i<l) {
				int j = l-i;
				while(j>0) {
					System.out.print("*");
					j--;
				}
				System.out.println();
				i++;
			}
			
		}
		
		else {
			int i = 0;
			do {
				int j = l-i;
				do {
					System.out.print("*");
					j--;
				} while(j>0);
				System.out.println();
				i++;
			} while (i<l);
			
		}
	}
}