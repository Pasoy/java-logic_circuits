import Component;

public class And implements Component {
	
	private Component firstO, secondO;
	
	public And(Component firstO, Component secondO) {
		this.firstO = firstO;
		this.secondO = secondO;
	}

	@Override
	public boolean truthValue() {
		if(firstO.truthValue() == true && secondO.truthValue() == true) {
			return true;
		} else {
			return false;
		}
	}

}