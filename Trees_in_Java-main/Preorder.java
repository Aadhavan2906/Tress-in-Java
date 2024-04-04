//write your program here
import java.util.*;
class Node
  {
    int data;
    Node left;
    Node right;
    Node(int data)
    {
      this.data=data;
      this.right=null;
      this.left=null;
    }
  }
class BST
  {
    Node root;
    BST()
    {
      this.root=null;
    }
    void insert(int data)
    {
      Node newnode=new Node(data);
      if(root==null)
        root=newnode;
      else
      {
        Node temp=root;
        while(true)
          {
            if(temp.data>newnode.data)
            {
              if(temp.left==null)
              {
                temp.left=newnode;
                break;
              }
              else
              {
                temp=temp.left;
              }
            }
            else
            {
              if(temp.data<newnode.data)
              {
                if(temp.right==null)
                {
                  temp.right=newnode;
                  break;
                }
                else
                {
                  temp=temp.right;
                }
              }
            }
          }
      }
        
    }
    void display()
    {
displayrec(root);
    }
    void displayrec(Node root)
    {
      if(root==null)
        return;
      System.out.print(root.data+" ");
      displayrec(root.left);
      displayrec(root.right);
    }
  }
class Main
  {
     public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      BST b=new BST();
      int n;
      while(true)
        {
          n=d.nextInt();
          if(n>0)
            b.insert(n);
          else
            break;
        }
      System.out.println("Preorder Traversal:");
      b.display();
    }
  }