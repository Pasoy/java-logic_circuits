import Component;

public class Not implements Component {
	
	private Component firstO;
	
	public Not(Component firstO) {
		this.firstO = firstO;
	}

	@Override
	public boolean truthValue() {
		if(firstO.truthValue() == true) {
			return false;
		} else {
			return true;
		}
	}

}