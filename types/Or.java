import Component;

public class Or implements Component {
	
	private Component firstO, secondO;
	
	public Or(Component firstO, Component secondO) {
		this.firstO = firstO;
		this.secondO = secondO;
	}

	@Override
	public boolean truthValue() {
		if(firstO.truthValue() == false && secondO.truthValue() == false) {
			return false;
		} else {
			return true;
		}
	}

}