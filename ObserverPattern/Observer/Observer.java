package Observer;

import Subject.NumberGenerator;

public interface Observer {
    public abstract  void update(NumberGenerator generator);
}
