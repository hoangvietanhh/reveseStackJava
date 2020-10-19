import sun.awt.image.ImageWatched;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Stack;

public class MyStack<E> {
    private LinkedList<E> stack;

    public MyStack() {
         stack = new LinkedList();
    }

    public void push(E e){
        stack.addFirst(e);
    }

    public E pop(){
        if (stack.isEmpty()){
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public boolean isEmpty(){
        if (stack.size() == 0){
            return true;
        }
        return false;
    }

}