public class Demo extends Subject {
	
	public static void main(String... args) {
		Subject subject = new Subject();
		
		new ObserverImpl(subject);
		new ObserverImpl(subject);
		new ObserverImpl(subject);
		
		System.out.println("Changing subject state to 5");
		subject.setState(5);
		System.out.println("Changing subject state to 10");
		subject.setState(10);
	}
	
}
