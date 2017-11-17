public abstract class Observer {
	
	protected Subject subject;
	
	// "pull me" observer design pattern (gets data through Subject (which was binded))
	public abstract void update();
	
	// "push me" observer design pattern (sends data through update)
	//public abstract void update(String data);
	
}
