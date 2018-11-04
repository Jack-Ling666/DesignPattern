package Subject;

import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator{
    private Random random = new Random();//随机数生成器
    private int number;
    public int getNumber(){
        return number;//获取当前数值
    }
    public void execute(){
        for(int i = 0;i < 20;i++){//随机生成20个不大于10的整数
            number = random.nextInt(10);
            notifyObservers();
        }
    }

}
