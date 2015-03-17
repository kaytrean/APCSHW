public class LList {
    private Node l=null;

    public String toString() {
	String s = "";
	Node tmp;
	for(tmp = l;tmp != null; tmp=tmp.getNext()) {
	    s = s + tmp + " ---> ";
	}
	s = s + "null";
	return s;
    }

    // Adds a node to the beginning of the list
    public void add(String s) {
        Node tmp = new Node(s);
	tmp.setNext(l);
	l = tmp;
    }

    // returns the data of the Node at index n
    public String find(int n) {
        Node m = l;
	for(int i=0;i<n;i++) {
	    m = m.getNext();
	}
	return m.getData();
    }

    // returns the Node at index n
    public Node findN(int n) {
	Node q = l;
	for(int i=0;i<n;i++) {
	    q = q.getNext();
	}
	return q;
    }

    // inserts new node at index n
    public void insert(int n, String s) {
	Node v = new Node(s);
	v.setNext(findN(n));
	findN(n-1).setNext(v);
    }

}