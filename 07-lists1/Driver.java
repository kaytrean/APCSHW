public class Driver {

    public static void main(String[] args) {
	LList fruit = new LList();
	fruit.add("hello");
	fruit.add("world");
	System.out.println(fruit);
	System.out.println(fruit.find(1));
        fruit.insert(1, "bye");
	System.out.println(fruit);
    }

}