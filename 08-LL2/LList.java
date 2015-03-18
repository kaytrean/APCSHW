public class LList {
    private Node empty;
    private int len;

    public LList(){
	empty = new Node(" ");
	len = 0;
    }

    public void add(String s){
	Node tmp = new Node(s);
	tmp.setNext(empty.getNext());
	empty.setNext(tmp);
	len++;
    }

	    
    public void add(int index, String s){
	Node newNode = new Node(s);	
	Node nodeb4 = get(index-1);
	newNode.setNext(nodeb4.getNext());
	nodeb4.setNext(newNode);
	len++;
    }

    public Node get(int n){
	int i = -1;
	Node tmp = empty;
	while(i<n && tmp != null){
	    tmp = tmp.getNext();
	    i++;
	}
      
	return tmp;
    }

    
    public void remove(int n){
	Node tmp = get(n-1);
	tmp.setNext(tmp.getNext().getNext());
	len--;
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