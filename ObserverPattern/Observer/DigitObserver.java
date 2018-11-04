package Observer;

import Subject.NumberGenerator;

public class DigitObserver implements Observer {

    @Override
    public void update(NumberGenerator generator) {
        System.out.println("DigitObsever: "+generator.getNumber());
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
        }
    }
}
