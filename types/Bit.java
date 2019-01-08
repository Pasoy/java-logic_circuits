import Component;

public class Bit implements Component {
	
	private boolean value;
	
	public Bit(boolean value) {
		set(value);
	}

	@Override
	public boolean truthValue() {
		return value;
	}
	
	public void set(boolean value) {
		this.value = value;
	}

}
