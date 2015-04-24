public class Node {
    private int data;
    private Node left, right;

    public Node(){
	left = null;
	right = null;
    }

    public Node(int data){
	this();
	this.data=data;
    }

    public Node getLeft(){
	return left;
    }

    public void setLeft(Node n){
	left = n;
    }

    public Node getRight(){
	return right;
    }
   
    public void setRight(Node n){
	right = n;
    }

    public int getData(){
	return data;
    }

    public void setData(int n){
	data = n;
    }

    public String toString(){
	return data + ",";
    }

}
