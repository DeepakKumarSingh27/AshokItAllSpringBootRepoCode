package in.ashokit;

public class Car extends Engine {
	public void drive() {
		int status = super.start();
		if (status >= 1)
			System.out.println("journey is started");
		else
			System.err.println("Engine Some problem");
	}
}
