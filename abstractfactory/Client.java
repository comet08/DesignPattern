package abstractfactory;

import java.util.Scanner;

public class Client{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String name = s.next();
		
		CutlerySetFactory fac = FactoryFactory.getFactory(name);
		Fork fo = fac.CreateFork();
		Spoon sp  = fac.CreateSpoon();
	}
}