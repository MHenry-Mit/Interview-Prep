package ctci;


/*Implementation of Stack Data Structure Tester*/
public class _03stackTest {
	public static void main(String[] args) {
		_03stack stack=new _03stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.pop();
		System.out.println(stack.size());
		System.out.println(stack.toString());
		stack.pop();
		System.out.println(stack.isEmpty());
		stack.pop();
		System.out.println(stack.isEmpty());
		System.out.println(stack.size());
		System.out.println(stack.toString());
	}
}
