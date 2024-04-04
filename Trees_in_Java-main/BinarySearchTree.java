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
class BTS
{
    Node root;
    BTS()
    {
        this.root=null;
    }
    void insert(int data)
    {
        Node newnode=new Node(data); 
        if(root==null)
        {
            root=newnode;
        }
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
void displayIN()
{
displayrecIN(this.root);
}
void displayrecIN(Node root)
{
    if(root==null)
    return;
    displayrecIN(root.left);
    System.out.println(root.data);
    displayrecIN(root.right);
}
void displayPR()

{
    displayrecPR(this.root);
}
void displayrecPR(Node root)
{
    if(root==null)
    return;
    System.out.println(root.data);
    displayrecPR(root.left);
    displayrecPR(root.right);
}
void displayPO()
{
    displayrecPO(this.root);
}
void displayrecPO(Node root)
{
    if(root==null)
    return;
    displayrecPO(root.left);
    displayrecPO(root.right);
    System.out.println(root.data);
}

}
class Main{
    public static void main (String[] args) {
        Scanner d=new Scanner(System.in);
        BTS obj=new BTS();
        int n=d.nextInt();
        for(int i=0;i<n;i++)
        {
        obj.insert(d.nextInt());
        }
        System.out.println("In order----");
        obj.displayIN();
        System.out.println("Pre-Order----");
        obj.displayPR();
        System.out.println("Post-Order----");
        obj.displayPO();
    }
}