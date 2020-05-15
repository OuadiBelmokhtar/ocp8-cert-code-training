package chap02.patterns.factorymethod;

public abstract class AppFactory {
	//
	public App getAppInstance() { // encapsule lappelle a getApp()
		App effectiveAppInstance = this.createApp();
		return effectiveAppInstance;
	}

	// methode polymorphic
	public abstract App createApp(); // Factory method
}
