package Subject;
import Observer.Observer;
import java.util.ArrayList;
import java.util.Iterator;


public abstract class NumberGenerator {
    private ArrayList<Observer> observers = new ArrayList<>();//保存Observer
    public void addObservers(Observer observer){
        observers.add(observer);//注册Observer
    }
    public void deleteObservers(Observer observer){
        observers.remove(observer);//删除Observer
    }
    public void notifyObservers(){//向Observer发送通知
        Iterator it = observers.iterator();
        while(it.hasNext()){
            Observer o = (Observer)it.next();
            o.update(this);
        }
    }
    public abstract int getNumber();//获取数值
    public abstract void execute();//生成数值
}
