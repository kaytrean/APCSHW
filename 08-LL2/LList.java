public class LList {
    private Node empty;
    private int len;

    public LList(){
	empty = new Node(-1);
	len = 0;
    }

    public void add(int s){
	Node tmp = new Node(s);
	tmp.setNext(empty.getNext());
	empty.setNext(tmp);
	len++;
    }

	    
    public void add(int index, int s){
	Node newNode = new Node(s);	
	Node nodeb4 = empty.getNext();
	for(int i =0;i<index-1;i++){
	    nodeb4 = nodeb4.getNext();
	}
	newNode.setNext(nodeb4.getNext());
	nodeb4.setNext(newNode);
	len++;
    }

    public int get(int n){
	if(n >= len){
	    throw new IndexOutOfBoundsException();
	}
	int i = 0;
	Node tmp = empty.getNext();
	while(i<n && i <len){
	    tmp = tmp.getNext();
	    i++;
	}
      
	return tmp.getData();
    }
    
    /*
    public int remove(int n){
	if(n>= this.len || n <0){
	    return -1;
	}
	Node T = empty.getNext();
	for(int i =0;i<n-1;i++){
	    T = T.getNext();
	}
	int s = T.getNext().getData();
	T.setNext(T.getNext().getNext());
	len--;
	return s;
    }
    */
    
    public boolean remove(int i){
	Node tmp= empty;
	for(int j=0;j<len;j++){
	    if(tmp.getNext().getData() == i){
		tmp.setNext(tmp.getNext().getNext());
		len--;
		return true;
	    }
	    tmp = tmp.getNext();
	}
	return false;
    }
	
    
    public int size(){
	return len;
    }
	

    public String toString(){
	String s = "";
	Node tmp;
	for (tmp = empty.getNext(); tmp != null; tmp=tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s = s + "null";
	return s;
    }
		
}
