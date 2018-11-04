package Observer;

import Subject.NumberGenerator;

public class GraphObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        System.out.print("GraphObserver: ");
        int count = generator.getNumber();
        while(count-->0){
            System.out.print("*");
        }
        System.out.println("");
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){

        }
    }
}
