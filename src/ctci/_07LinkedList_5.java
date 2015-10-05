package ctci;

import java.io.InputStreamReader;
import java.util.Scanner;

import ctci._02linkedList.Node;




/*Implementation of CTCI 2.6//Implementation only*/
public class _07LinkedList_5 {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(new InputStreamReader(System.in));
		scanner.close();
		_02linkedList linkedList=new _02linkedList();
		checkLoop(linkedList);

	}

	private static boolean checkLoop(_02linkedList linkedList) {
		Node fastPointerNode=linkedList.getHeadNode();
		Node slowPointerNode=linkedList.getHeadNode();
		while(fastPointerNode.next!=null && fastPointerNode!=slowPointerNode){
			fastPointerNode=fastPointerNode.next;
			if(fastPointerNode!=null)
				fastPointerNode=fastPointerNode.next;
			else{
				return false;
			}
			slowPointerNode=slowPointerNode.next;
		}
		slowPointerNode=linkedList.getHeadNode();
		while(slowPointerNode!=fastPointerNode){
			slowPointerNode=slowPointerNode.next;
			fastPointerNode=fastPointerNode.next;
		}
		System.out.println("Starting element is : "+slowPointerNode.data);
		return true;	
	}


}
