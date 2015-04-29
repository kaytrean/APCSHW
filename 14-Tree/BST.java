import java.util.*;

public class BST{

    private Node root;

    public BST(){
	root = null;
    }

    public BST(Node n){
	root = n;
    }
    
    public void insert(int i){
	Node t = root;
	Node piggy = t;
	if(t == null){
	    t = new Node(i);
	}
	
	while(t!=null){
	    piggy = t;
	    if(t.getData()<i){
		t=t.getRight();
	    } else if(t.getData()>i) {
		t=t.getLeft();
	    } else {
		return;
	    }
	}

	if(piggy.getData() < i){
	    piggy.setRight(new Node(i));
	}else {
	    piggy.setLeft(new Node(i));
	}
    }

    /*
      two pointers to node and parent
      a)if leaf, set parent left/right to null
      b)if only has one child, set parent left/right to child
      c)if 2 children, find largest left or smallest right node and copy data 
      into location of node being removed.
    */
    
    public void remove(int i){	
	Node t = root;
	Node piggy = t;
	boolean right;
	while(t.getData()!=i && t!=null){
	    piggy = t;
	    if(t.getData()<i){
		t=t.getRight();
		right = true;
	    } else if(t.getData()>i) {
		t=t.getLeft();
		right = false;
	    }
	}

	if(t.numKids()==0){
	    if(right){
		piggy.setRight(null);
	    }else{
		piggy.setLeft(null);
	    }
	}else if (t.numKids()==1){
	    if(right){
		if(t.getRight() != null){
		    piggy.setRight(t.getRight());
		}else {
		    piggy.setRight(t.getLeft());
		}
	    } else {
		if(t.getRight() != null){
		    piggy.setLeft(t.getRight());
		}else {
		    piggy.setLeft(t.getLeft());
		}
	    }
	} else {
	    L = t.getRight();
	    L2 = t;
	    while (L.getLeft() != null){
		L2 = L
		L = L.getLeft();
	    }
	    t = L;
	    L2.setLeft(null);
	}
	}
    
    public Node search(int i){
	Node t = root;
	while(t!=null){
	    if(t.getData() < i){
		t = t.getRight();
	    }else if(t.getData()>i){
		t=t.getLeft();
	    }else {
		return t;
	    }
	}
	return null;
    }
    
    public Node rSearch(Node t, int i){
	if(t==null){
	    return null;
	}
	if(t.getData() < i){
	    return rSearch(t.getRight(),i);
	} else if (t.getData() > i){
	    return rSearch(t.getLeft(),i);
	}

	return t;  
	
    }

    public Node rSearch(int i){
	return rSearch(root,i);
    }
    
    public String traverse(Node t){
	if(t == null){
	    return "";
	}
	return t.getData() + ", " + traverse(t.getLeft()) + traverse(t.getRight());
    }


    public String ascend(Node t){
	if(t == null){
	    return "";
	}
	return ascend(t.getLeft()) +  t.getData() + ", " + ascend(t.getRight());
    }

    
    public String toString(){
	return ascend(root);
    }
  
    public static void main(String[] args){
	Random rnd = new Random();
	Node r = new Node(40);
	BST b = new BST(r);
	for(int i=0;i<10;i++){
	    b.insert(10*rnd.nextInt(10));
	}
	System.out.println(b);
	System.out.println(b.ascend());
    }
	
	    
}import java.io.*;
import java.util.*;
public class BST{
    Node r;

    public Node search(Node t, int i){
	if (t==null || t.getData()==i){
	    return t;
	}
	else if (i<t.getData()){
	    return search(t.getLeft(),i);
	} else {
	    return search(t.getRight(),i);
	}
    }

    public String search(int i){
	Node n = search(r,i);
	if (n==null){
	    return "NOT FOUND";
	}else{
	    return n.toString();
	}
    }

    public void insert(int i){
	Node n = new Node(i);
	Node t2=null;
	Node t = r;
	if (r==null){
	    r=n;
	    return;
	}
								
	while (t!=null){
	    t2 = t;
	    if (t.getData()==i)
		return;
	    else if (t.getData() < i)
		t=t.getRight();
	    else if (t.getData() > i)
		t=t.getLeft();
	    else
		return;
	}

				
	if (i>t2.getData())
	    t2.setRight(n);
	else
	    t2.setLeft(n);
    }

		

    public static void main(String[] args){
	BST t = new BST();
	Random r = new Random();
	for (int i = 0; i < 20; i ++){
	    int z = r.nextInt(100);
	    //System.out.println(z);
	    t.insert(z);
	}
	t.insert(30);
	System.out.println(t);
	System.out.println(t.search(30));
    }
}
