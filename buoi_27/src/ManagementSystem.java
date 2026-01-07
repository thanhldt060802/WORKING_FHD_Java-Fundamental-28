import java.util.ArrayList;

public class ManagementSystem<T> {

	private ArrayList<T> data;
	
	public ManagementSystem() {
		this.data = new ArrayList<T>();
	}
	
	public ArrayList<T> getData() {
		return this.data;
	}
	
	public void setData(ArrayList<T> data) {
		this.data = data;
	}
	
	public void showAll() {
		for(T e : this.data) {
			System.out.println(e);
		}
	}
	
	public void add(T obj) {
		for(T e : this.data) {
			if(e.equals(obj)) {
				System.out.println("Add failed!");
				return;
			}
		}
		this.data.add(obj);
		System.out.println("Add success!");
	}
	
	public void update(T obj) {
		for(int i = 0; i < this.data.size(); i++) {
			if(this.data.get(i).equals(obj)) {
				this.data.set(i, obj);
				System.out.println("Update success!");
				return;
			}
		}
		System.out.println("Update failed!");
	}
	
	public void remove(T obj) {
		for(T e : this.data) {
			if(e.equals(obj)) {
				this.data.remove(e);
				System.out.println("Remove success!");
				return;
			}
		}
		System.out.println("Remove failed!");
	}
	
	public T search(T obj) {
		for(T e : this.data) {
			if(e.equals(obj)) {
				return e;
			}
		}
		return null;
	}
}