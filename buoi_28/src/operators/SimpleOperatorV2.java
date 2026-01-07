package operators;

public interface SimpleOperatorV2<T> {
    
    public abstract void showAll();

    public abstract void add(T obj);

    public abstract void updateById(T obj);

    public abstract void removeById(T obj);

    public abstract T searchById(T obj);

}
