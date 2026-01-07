package operators.implv2;

import java.util.ArrayList;

import operators.SimpleOperatorV2;

public class ImplSimpleOperatorV2<T> implements SimpleOperatorV2<T> {

    private ArrayList<T> list;

    public ImplSimpleOperatorV2() {
        this.list = new ArrayList<T>();
    }

    public ArrayList<T> getList() {
        return list;
    }

    public void setList(ArrayList<T> list) {
        this.list = list;
    }

    @Override
    public void showAll() {
        for (T element : this.list) {
            System.out.println(element);
        }
    }

    @Override
    public void add(T obj) {
        for (T element : this.list) {
            if (element.equals(obj)) {
                return;
            }
        }
        this.list.add(obj);
    }

    @Override
    public void updateById(T obj) {
        for (int i = 0; i < this.list.size(); i++) {
            if (this.list.get(i).equals(obj)) {
                this.list.set(i, obj);
                return;
            }
        }
    }

    @Override
    public void removeById(T obj) {
        for (T element : this.list) {
            if (element.equals(obj)) {
                this.list.remove(obj);
                return;
            }
        }
    }

    @Override
    public T searchById(T obj) {
        for (T element : this.list) {
            if (element.equals(obj)) {
                return element;
            }
        }
        return null;
    }
    
}
