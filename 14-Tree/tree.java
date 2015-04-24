
public class Tree{
    
    public node search(Node T, Integer i){
	while (T!=null){
	    int c=T.getData().compareTo(i);
	    if (c>0){
		T=T.getRight();
	    }else if (c<0){
		T=T.getLeft;
	    }else return T;
	}
	return null;
    }

    public void insert(Node T){
	if(T==null){
	    //print T to the node you're inserting
	    System.out.println(T);
	    
	}
	//insert as new leaf
	     //create new Node n
	     //search for the value of n
    }

    public void search(){
    }
}
