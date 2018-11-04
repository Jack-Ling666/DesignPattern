import Observer.Observer;
import Subject.NumberGenerator;
import Subject.RandomNumberGenerator;
import Observer.*;
public class Main {
    public static  void main(String[] args){
        NumberGenerator generator = new RandomNumberGenerator();
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        generator.addObservers(observer1);
        generator.addObservers(observer2);
        generator.execute();
    }
}
