package com.oracle.learning;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class UpgradeTest
	{

  public static void main(String[] args) {
	  //
	    /* 10
	    6        15
	  4    7         9*/


	  BinaryTree tree = new BinaryTree();
	  tree.root = new Node(10);
	  tree.root.left = new Node(6);
	  tree.root.right = new Node(15);
	  tree.root.right.left = new Node(9);
	  tree.root.left.left = new Node(4);
	  tree.root.left.right = new Node(7);

	  if (tree.isBST())
		  System.out.println("IS BST");
	  else
		  System.out.println("Not a BST");
  }
		static class Node
			{
				int data;
				Node left, right;

				public Node(int item)
					{
						data = item;
						left = right = null;
					}
			}

		public static class BinaryTree
			{
				//Root of the Binary Tree
				Node root;

    /* can give min and max value according to your code or
    can write a function to find min and max value of tree. */

				/* returns true if given search tree is binary
				 search tree (efficient version) */
				boolean isBST()  {
					return isBSTUtil(root, Integer.MIN_VALUE,
							Integer.MAX_VALUE);
				}

				/* Returns true if the given tree is a BST and its
					values are >= min and <= max. */
				boolean isBSTUtil(Node node, int min, int max)
					{
						/* an empty tree is BST */
						if (node == null)
							return true;
						System.out.println("min"+min);
						/* false if this node violates the min/max constraints */
						if (node.data < min || node.data > max)
							return false;

						System.out.println("max"+max);
						System.out.println("data--"+node.data);
        /* otherwise check the subtrees recursively
        tightening the min/max constraints */
						// Allow only distinct values
						return (isBSTUtil(node.left, min, node.data-1) &&
								        isBSTUtil(node.right, node.data+1, max));
					}

				/* Driver program to test above functions */

			}

		public static void printevenkey() {

			HashMap<Integer, List<Integer>> hashmap = new HashMap<>();

			List<Integer> ll1 = new ArrayList<>();
			ll1.add(2);
			ll1.add(1);
			ll1.add(3);
			List<Integer> ll2 = new ArrayList<>();
			ll2.add(4);
			ll2.add(5);
			ll2.add(6);

			List<Integer> ll3 = new ArrayList<>();
			ll3.add(7);
			ll3.add(8);
			ll3.add(9);
			ll3.add(4);

			hashmap.put(1, ll1);
			hashmap.put(2, ll2);
			hashmap.put(6, ll3);

			List<Integer> s =
					hashmap.entrySet().stream()
							.filter(i -> (i.getKey() % 2) == 0)
							.map(Entry::getValue)
							.flatMap(Collection::stream)
							.distinct()
							.collect(Collectors.toList());

			s.forEach(System.out::println);
		}

  /*
      1 -> 1,2,3
		  2 -> 2,4,6,9
		  3- -> 3,7,8,9


   */
	// 1 -> 1,3
	//3->3,7,9

	// [1,3,7,9]
		// Java-
/*public List<Integer> 	findodd(Map<Integer,List<Integer>> input)
	{

		List<Integer> res= input.entrySet().stream().c

		return res;
	}*/
		/*Given the root of a binary tree, determine if it is a valid binary search tree (BST)./




		binary(Node root)
		{
		  if(root!=null)
		  {
		  binary(root.left);
		  System.out.println(root.data);
		  binary(root.right);
		  }
	 }
		// 4 6 7 10 9 15

		int min= Integer.min  1000

		int Max=Integer.Max

		binaryutil(Node root,min,max);

		}
binaryutil(Node root,min,max)
{
   if(root==null)
		return true;
		      9>-222        9<14
if( !(root.data >min || root.data<max))
		  return false;


	return	binaryutil(root.left ,min ,root.data-1) ||  binaryutil(root.right ,root.data+1 ,Max) ;
		}
		 */




	}

