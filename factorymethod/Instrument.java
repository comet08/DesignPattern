package factorymethod;

public abstract class Instrument {
	public String tune;
	public void tuning(String tune) {
		this.tune = tune;
	}
	abstract void playing();
}
