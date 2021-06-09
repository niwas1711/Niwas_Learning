package com.oracle.learning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DpClass
	{
  public static void main(String[] args) {
    //
	  List<Integer> ll = new ArrayList<>();



	for(int i=2;i<10;i++)
	{
		ll.add(i);
	}
	ll.remove(2);
	  findList(ll);
  }


//2,3,4,5,6,7,9,10

/*mid =4;
first=2 ,lastelemet =10;
midmanual= 2+10 /2 =6
list.get(mid)==mid

	start= mide+1, end =legth;
start=0,end=mid-1;
		*/
		// 2+10 = 12/2 =6
		/*(mid+1,list)*/
	/*	list.get(mid+1)+ list.size*/
		 // list.get(4)=6;  7+10= 17/2 =8

		// a[2]==8

// if(l.get(i)+1 = l.get(i+1))
 //


		public  static void findList(List<Integer> list)
	{

      int number = binarysearch(list,0,list.size()-1);
      System.out.println(number);
	}

	public static  int binarysearch(List<Integer> ll , int start,int end)
		{
    // 2,3,4,5,6,7,9,10
    System.out.println("start"+start);
    System.out.println("end"+end);
			    int mid=(start+end)/2;
    System.out.println("mide"+mid);
			    int listmid= (ll.get(start)+ll.get(end) )/2;

    System.out.println("listmide"+listmid);

      if(start<0 || end<0)
      	return -1;
			if(ll.get(mid)==ll.get(listmid))
			    {
				   return binarysearch(ll ,  mid+1, end);
			    }else
			    {
			       	 if(ll.get(start)+2== ll.get(start+1))
			       	 	return ll.get(start)+1;

			       	 else
			         {
				         return binarysearch(ll ,  start, mid-1);
			         }

			    }



		}






}









class GFG{

	// Structure of the Node
	static class Node
		{
			int val;
			Node left, right;

			public Node(int val)
				{
					this.val = val;
					this.left = this.right = null;
				}
		};

	// Map to store the parent
// node of every node of
// the given Binary Tree
	static HashMap<Node, Node> um = new HashMap<>();

	// Function to store all nodes
// parent in unordered_map
	static void storeParent(Node root)
		{

			// Make a queue to do level-order
			// Traversal and store parent
			// of each node in unordered map
			Queue<Node> q = new LinkedList<>();
			q.add(root);

			// Loop to iterate until the
			// queue is not empty
			while (!q.isEmpty())
			{
				Node p = q.poll();

				// Condition if the node is a
				/// root node that storing its
				// parent as NULL
				if (p == root)
				{
					um.put(p, null);
				}

				// if left child exist of
				// popped out node then store
				// parent as value and node as key
				if (p.left != null)
				{
					um.put(p.left, p);
					q.add(p.left);
				}
				if (p.right != null)
				{
					um.put(p.right, p);
					q.add(p.right);
				}
			}
		}

	// Function to find the nodes
// at distance K from give node
	static void nodeAtDistK(Node root,
			Node target, int k)
		{

			// Keep track of each node
			// which are visited so that
			// while doing BFS we will
			// not traverse it again
			HashSet<Node> s = new HashSet<>();
			int dist = 0;

			Queue<Node> q = new LinkedList<>();
			q.add(target);
			s.add(target);

			// Loop to iterate over the nodes
			// until the queue is not empty
			while (!q.isEmpty())
			{

				// If distance is equal to K
				// then we found a node in tree
				// which is distance K
				if (dist == k)
				{
					while (!q.isEmpty())
					{
						System.out.print(q.peek().val + " ");
						q.poll();
					}
				}

				// BFS on node's left,
				// right and parent node
				int size = q.size();
				for(int i = 0; i < size; i++)
				{
					Node p = q.poll();

					// If the left of node is not
					// visited yet then add it in
					// queue and insert it in set as well
					if (p.left != null && !s.contains(p.left))
					{
						q.add(p.left);
						s.add(p.left);
					}

					// If the right of node is not visited
					// yet then add it in queue
					// and insert it in set as well
					if (p.right != null && !s.contains(p.right))
					{
						q.add(p.right);
						s.add(p.right);
					}

					// If the parent of node is not visited
					// yet then add it in queue and
					// insert it in set as well
					if (um.get(p) != null &&
							    !s.contains(um.get(p)))
					{
						q.add(um.get(p));
						s.add(um.get(p));
					}
				}
				dist++;
			}
		}

	// Driver Code
	public static void main(String[] args)
		{
			Node root = new Node(20);
			root.left = new Node(8);
			root.right = new Node(22);
			root.right.left = new Node(5);
			root.right.right = new Node(8);
			root.left.left = new Node(4);
			root.left.left.left = new Node(25);
			root.left.right = new Node(12);
			root.left.right.left = new Node(10);
			root.left.right.left.left = new Node(15);
			root.left.right.left.right = new Node(18);
			root.left.right.left.right.right = new Node(23);
			root.left.right.right = new Node(14);

			Node target = root.left.right;

			storeParent(root);

			nodeAtDistK(root, target, 3);
		}
}

// This code is contributed by sanjeev2552
