import java.util.*;

public class  Driver{
    public static void main(String[] args) {
	Random r = new Random();
	LList l = new LList();
	for (int i=0; i < 10; i++){
	    l.add(""+i);
	}
	System.out.println(l);
	System.out.println(l.get(4));
	System.out.println(l.get(12));
	l.add(0,"W");
	l.add(3,"c");
	System.out.println(l);
	l.remove(5);
	l.remove(20);
	System.out.println(l);
    }
}
