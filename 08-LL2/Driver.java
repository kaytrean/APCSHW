import java.util.*;
import java.io.*;
import java.lang.System;
public class  Driver{

    public static void main(String[] args) {
	Random r = new Random();
	
	long start,elapsed;
	LList l = new LList();
	LinkedList l2 = new LinkedList();
	ArrayList<Integer> a = new ArrayList<Integer>();
	
	for(int i = 0;i< 50000;i++){
	    a.add(r.nextInt(11));
	    l.add(r.nextInt(11));
	    l2.add(r.nextInt(11));
	}
	int aSum = 0;
	start = System.currentTimeMillis();
	for(int i=0;i<a.size();i++){
	    aSum += a.get(i);
	}
	elapsed = System.currentTimeMillis()-start;
	System.out.println("AList:" + elapsed);

	int lSum = 0;
	start = System.currentTimeMillis();
	for(int i=0;i<l.size();i++){
	    lSum += l.get(i);
	}
	elapsed = System.currentTimeMillis() -start;
	System.out.println("LList:" + elapsed);

	int l2Sum = 0;
	start = System.currentTimeMillis();
	for(int i=0;i<l2.size();i++){
	    l2Sum += (int)l2.get(i);
	}
	elapsed =System.currentTimeMillis()-start;
	System.out.println("L2List:" + elapsed);
	

    }
}
