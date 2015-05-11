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

     public int maxValue(Node t, int n){
	if(t == null){
	    return n;
	} else if(t.getData() > n){
	    return maxValue(t.getRight(), t.getData()); 
	} else {
	    return maxValue(t.getRight(), n);
	}
    }

    public int maxValue(){
	return maxValue(root,Integer.MIN_VALUE);
    }

    public int height(Node t){
	if(t.getLeft() != null){
	    return 1+ height(t.getLeft());
	} else if (t.getRight() != null){
	    return 1 +height(t.getRight());
	} else {
	    return 1;
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
	return traverse(root);
    }
  
    public static void main(String[] args){
	Random rnd = new Random();
	Node r = new Node(40);
	BST b = new BST(r);
	for(int i=0;i<10;i++){
	    b.insert(10*rnd.nextInt(10));
	}
	System.out.println(b);
	System.out.println(b.height(r));
	System.out.println(b);
    }
	
	    
}
