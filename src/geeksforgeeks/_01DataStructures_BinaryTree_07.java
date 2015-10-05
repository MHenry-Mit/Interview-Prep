package geeksforgeeks;

import geeksforgeeks._01DataStructures_BinaryTree_00.Node;


/*
 * http://www.geeksforgeeks.org/level-order-tree-traversal/
 * Level Order Tree Traversal
 */;
 public class _01DataStructures_BinaryTree_07 {
	 public static void main(String[] args) {
		 _01DataStructures_BinaryTree_00 binaryTree1=new _01DataStructures_BinaryTree_00();
		 binaryTree1.insert(null,null,10);
		 binaryTree1.insert(10,"left",11);
		 binaryTree1.insert(10,"right",12);
		 binaryTree1.insert(11,"left",13);
		 binaryTree1.insert(11,"right",14);
		 binaryTree1.insert(12,"left",15);
		 binaryTree1.insert(12,"right",16);
		 binaryTree1.preOrder();
		 levelOrder(binaryTree1);
	 }

	private static void levelOrder(_01DataStructures_BinaryTree_00 binaryTree1) {
		// TODO Auto-generated method stub
		levelOrder(binaryTree1.rootNode);
	}

	private static void levelOrder(Node node) {
		tempQueue queue=new tempQueue();
		while(node!=null){
			System.out.print(node.data+",");
			queue.add(node.left);
			queue.add(node.right);
			node=queue.poll();
		}
	}
	


 }
class tempQueue {
		Node headNode;
		Node exitNode;
		int noOfElements=0;
		public _01DataStructures_BinaryTree_00.Node poll(){//Retrieves and removes the head of this queue, or returns null if this queue is empty.
			_01DataStructures_BinaryTree_00.Node returnData=null;
			if(headNode!=null)
			{
				returnData=headNode.data;
				headNode=headNode.next;
				noOfElements--;
			}
			return returnData;
		}
		public _01DataStructures_BinaryTree_00.Node peek(){//Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
			if(headNode!=null)
				return headNode.data;
			return null;
		}
		public Boolean isEmpty(){
			return noOfElements==0?true:false;
		}
		public void clear(){
			noOfElements=0;
			headNode=exitNode=null;
		}
		public void add(_01DataStructures_BinaryTree_00.Node value){
			if(headNode==null){
				headNode=new Node();
				headNode.data=value;
				exitNode=headNode;
			}
			else{
				Node newNode=new Node();
				newNode.data=value;
				exitNode.next=newNode;
				exitNode=newNode;
			}
			noOfElements++;
		}
		public _01DataStructures_BinaryTree_00.Node remove(){//Retrieves and removes the head of this queue. This method differs from poll only in that it throws an exception if this queue is empty.
			_01DataStructures_BinaryTree_00.Node returnData=null;
			if(headNode!=null)
			{
				returnData=headNode.data;
				headNode=headNode.next;
				noOfElements--;
			}
			return returnData;
		}
		public Boolean contains(_01DataStructures_BinaryTree_00.Node value){
			Node pointerNode=new Node();
			pointerNode=headNode;
			while(pointerNode!=null){
				if(pointerNode.data==value)
					return true;
				pointerNode=pointerNode.next;
			}
			return false;
		}
		public int size(){
			return noOfElements;
		}
		public String toString(){
			StringBuilder outputStringBuilder=new StringBuilder();
			Node pointerNode=new Node();
			pointerNode=headNode;
			while(pointerNode!=null){
				outputStringBuilder.append(pointerNode.data+"\n");
				pointerNode=pointerNode.next;
			}
			return outputStringBuilder.toString();
		}




		class Node{
			_01DataStructures_BinaryTree_00.Node data;
			Node next;
			public _01DataStructures_BinaryTree_00.Node getData() {
				return data;
			}
			public void setData(_01DataStructures_BinaryTree_00.Node data) {
				this.data = data;
			}
			public Node getNext() {
				return next;
			}
			public void setNext(Node next) {
				this.next = next;
			}

		}
	}
