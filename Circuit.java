import types.And;
import types.Bit;
import types.Not;
import types.Or;

public class Circuit {
	
	public static void main(String[] args) {
		Circuit c = new Circuit();
		c.truthTable();
	}
	
	/* Just to print truth table with rows
	public void printTruthTable(int n) {
		String t = "true";
		String f = "false";
		int rows = (int) Math.pow(2, n);
		for(int i = 0; i < rows; i++) {
			for(int j = n - 1; j >= 0; j--) {
				if((i / (int) Math.pow(2, j)) % 2 == 0) {
					System.out.print(f + " ");
				} else {
					System.out.print(t + "  ");
				}
			}
			System.out.println();
		}
	}
	*/
	
	/**
	 * Truth table for the 3 given bits
	 */
	public void truthTable() {
		Bit a = new Bit(true), b = new Bit(true), c = new Bit(true);
		Component comp = new Or(new Not(new And(a, b)), new Or(a, c));
		int i,j,k;
		
		for(i = 0, a.set(true); i < 2; i++, a.set(false)) {
			for(j = 0, b.set(true); j < 2; j++, b.set(false)) {
				for(k = 0, c.set(true); k < 2; k++, c.set(false)) {
					System.out.println(a.truthValue() + " " + b.truthValue() + " " + c.truthValue() + " -> " + comp.truthValue());
				}
			}
		}
	}

}
