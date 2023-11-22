package core;
import java.util.*;
public class Stack implements IStack {
	private ArrayList<Object> ele;
	public Stack() {
		ele = new ArrayList<Object>();
	}
	@Override
	public boolean isEmpty() {
		if (ele !=null) {
			if(ele.size()==0) {
				return true;
			}
			else return false;
		}
		else return true;
	}

	@Override
	public int getSize() {
		if(ele != null) {
			return ele.size();
		}
		else return 0;
	}


	@Override
	public void push(Object elm) {
		ele.add(elm);
		
	}

	@Override
	public boolean isFull() {	
		return false;
	}

	@Override
	public Object getTop() {
		return ele.get(getSize()-1);
	}
	
	@Override
    public Object pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot pop from an empty stack");
        }
        Object topElement = getTop();
        ele.remove(getSize() - 1);
        return topElement;
    }
	

	
}
