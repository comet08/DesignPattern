package abstractfactory;

public class BFactory extends CutlerySetFactory{
	public Spoon CreateSpoon() {
		return new BSpoon();
	}
	public Fork CreateFork() {
		return new BFork();
	}
}