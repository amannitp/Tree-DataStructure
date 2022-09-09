import java.util.*;
import java.lang.*;

class PostOrderTraversal{
    
    public static class Node {
        int val;
        Node left;
        Node right;
    }
    
    
    public static void postOrderTraversal(Node root){
        
        if(root==null){
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.println("post "+root.val);
    }
    public static void main(String args[]){
        
        Node root=new Node();
        root.val=10;
        
        Node a=new Node();
        a.val=20;
        
        Node b=new Node();
        b.val=30;
        
        Node c=new Node();
        c.val=40;
        
        Node d=new Node();
        d.val=50;
        
        Node e=new Node();
        e.val=60;
        
        Node f=new Node();
        f.val=70;
        
        root.left=a;
        root.right=b;
        
        a.left=c;
        a.right=d;
        
        b.left=e;
        b.right=f;
        
        c.left=null;
        c.right=null;
        
        d.left=null;
        d.right=null;
        
        e.left=null;
        e.right=null;
        
        f.left=null;
        f.right=null;
        
        
       
        postOrderTraversal(root);
        
    }
}