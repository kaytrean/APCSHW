import java.io.*;
import java.util.*;

public class myStack<E> {
    private Node<E> p;

    public myStack(){
	p = null;
    }

    public void push(E data){
        Node<E> p1 = new Node<E>(data);
	p1.setNext(p);
	p = p1;
    }

    public E pop(){
        Node<E> p1 = p;
	p = p.getNext();
	return p1.getData();
    }

    public boolean empty(){
	return p == null;
    }

    public E top() {
	return p.getData();
	}

    public String toString(){
	return p.toString();
    }

    public static void main(String[] args){
	myStack<String> s = new myStack<String>();
	s.push("Hello");
	s.push("yes");
	s.push("ie");
	s.top();
	s.pop();

	System.out.println(s.toString());
    }
}
