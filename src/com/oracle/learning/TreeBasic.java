package com.oracle.learning;

public class TreeBasic
	{





		public static void main(String[] args) {
			//
			Nodetree root = new Nodetree(10);
        root.left= new Nodetree(5);
        root.right = new Nodetree(15);

			inorder(root);
			preorder(root);
			posteorder(root);
		}

		public static void inorder(Nodetree root)
			{
				if(root==null)
					return;

				inorder(root.left);
    System.out.println(root.data);
      inorder(root.right);
			}


		public static void preorder(Nodetree root)
			{
				if(root==null)
					return;

				System.out.println(root.data);
				preorder(root.left);

				preorder(root.right);
			}
		public static void posteorder(Nodetree root)
			{
				if(root==null)
					return;


				preorder(root.left);

				preorder(root.right);
				System.out.println(root.data);
			}



	}
	class Nodetree
	{
	 int data;
		Nodetree left;
		Nodetree right;

		Nodetree(int data)
			{
				this.data=data;
				left=right=null;

			}


	}
