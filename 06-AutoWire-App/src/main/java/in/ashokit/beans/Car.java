package in.ashokit.beans;

public class Car {
	public Car() {
		System.out.println("Car Constructore 0 peram..");
	}

	private DieselEngine dieselEngine;

	public void setDieselEngine(DieselEngine dieselEngine) {
		this.dieselEngine = dieselEngine;
	}
	public Car(DieselEngine dieselEngine) {
		System.out.println("Car Constructore peram..");

		this.dieselEngine = dieselEngine;
	}

	public void drive() {
		int start = dieselEngine.start();
		if (start >= 1) {
			System.out.println("Journey is started...");
		} else {
			System.out.println("Engine Filed to start...");
		}
	}
}
