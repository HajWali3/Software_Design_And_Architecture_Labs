package DynamicObserverPattern;

public class BinaryObserver extends Observer {

    public abstract class Observer {
        protected Subject subject;

        public abstract void update();
    }

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
    }
}