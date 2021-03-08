package abstractfactory;

public class AFactory extends CutlerySetFactory{
	public Spoon CreateSpoon() {
		return new ASpoon();
	}
	public Fork CreateFork() {
		return new AFork();
	}
}