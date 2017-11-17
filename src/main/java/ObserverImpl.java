public class ObserverImpl extends Observer {
	
	public ObserverImpl(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}
	
	
	@Override
	public void update() {
		System.out.println("ObserverImpl: "+ subject.getState());
	}
	
}
