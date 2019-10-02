package chap2.patterns.factorymethod;

public abstract class AppFactory {
	//
	public App getAppInstance() { // encapsule lappelle a getApp()
		App effectiveAppInstance = this.getApp();
		return effectiveAppInstance;
	}

	// methode polymorphic
	public abstract App getApp(); // Factory method
}
