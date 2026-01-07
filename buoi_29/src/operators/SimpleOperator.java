package operators;

public interface SimpleOperator<T> {
    
    public abstract void showAll();

    public abstract void add(T obj);

    public abstract void update(T obj);

    public abstract void removeById(String id);

    public abstract T searchById(String id);

}
