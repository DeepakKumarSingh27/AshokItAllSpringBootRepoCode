package in.ashokit;

public class Car  {
	Engine eng = new Engine();
	public void drive() {
		int status = eng.start();
		if (status >= 1)
			System.out.println("journey started...");
		else
			System.err.println("Engine Some problem..");
	}
}
