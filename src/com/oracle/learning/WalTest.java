package com.oracle.learning;

public class WalTest {

    public static void main(String[] args) {

        int arr[] ={8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
        //[8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1]
        System.out.println(maxwater(arr));

    }
public static int maxwater (int arr[])
{
    int water =0;

int [] left_max = new int[arr.length];
int [] right_max= new int[arr.length];
         //         [0, 8, 0, 0, 5, 0, 0, 10, 0, 0, 1, 1, 0, 3]
/*
-->    arr_left_max[] = [0, 8 , 8, 8, 8,  10, 10 ,10, 10, 10 ,10,  10, 10 ,10]
     arr_right_max[]=   [ 8, 8  5  5  5,  5 ,   5 ,5    3   3   3   3  ,0,  3 ]
       water +=          Math.min( arr_left_max[],arr_right_max[])-arr[i];
                          0 + 0+ 0+  5+ 5+

-->
   */


    left_max[0]=arr[0];

    right_max[arr.length-1]=arr[arr.length-1];
    int right_max_v= arr[arr.length-1];
    int len=arr.length-1;
    for(int i=1;i<arr.length;i++)     //[0, 8, 0, 0, 5, 0, 0, 10, 0, 0, 1, 1, 0, 3]
    {
        left_max[i]= Math.max(left_max[i-1],right_max_v);

    }



 //     [0, 8 , 8, 8, 8,  10, 10 ,10, 10, 10 ,10,  10, 10 ,10]

    for(int i=arr.length-2;i>=0;i--)       //[0, 8, 0, 0, 5, 0, 0, 10, 0, 0, 1, 1, 0, 3]
    {
        right_max[i]= Math.max(right_max[i+1],arr[i]);
    }
  //  [ 8, 8  5  5  5,  5 ,   5 ,5    3   3   3   3  ,0,  3 ]

    int left_max_v=arr[0];
      // {8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
                                // left = 8    -- right =0
    int j,x=0;
    int lower=0;

    for(int i=1;i<arr.length;i++)
    {

      //  water  +=  Math.min(left_max[i], right_max[i])-arr[i];
    }
    return water;

}

    /*

         10
      7       12
    5   6   11   14
  3

     */


   //  3 5 7 6 10 11 12 14  --null

    // 6
 // no extra space--

  //
    //
    //






/*
    public TreeNode inorder(TreeNode node,TreeNode k)
    {
        //

          if(node==null) return null;

          if(node.parent.data==k.data)
          {
              TreeNode
          }
              inorder(node.left,k);



            inorder(node.right,k);


    }



    static class TreeNode
    {
      int data;
        TreeNode left;
        TreeNode right;
        TreeNode parent;
        TreeNode(int data)
        {
            this.data=data;
            left=null;
            right=null;
        }
    }*/
}


