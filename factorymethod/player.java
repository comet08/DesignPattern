package factorymethod;

public class player {

	public static void main(String[] args) {
		InstrumentFactory fac = new SubFactory();
		Instrument ins = fac.newInstrument("Ŭ�󸮳�");
		ins.tuning("Bb");
		ins.playing();
		System.out.print(ins.tune);
	}

}
