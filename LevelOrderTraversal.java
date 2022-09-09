import java.util.*;
import java.lang.*;

class LevelOrderTraversal{
    
    public static class Node {
        int val;
        Node left;
        Node right;
    }
    public static void levelOrderTraversal(Node root){
        
        Queue<Node> que=new LinkedList<>();
        
        que.add(root);
        
        while(que.size()>0){
            
            int size=que.size();
            
            while(size-->0){
                
                Node rem=que.remove();
                
                if(rem==null){
                    continue;
                }
                System.out.print(rem.val+" ");
                que.add(rem.left);
                que.add(rem.right);
            }
            System.out.println();
        }
        
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
        
        Node g=new Node();
        g.val=80;
        
        Node h=new Node();
        h.val=90;
        
        root.left=a;
        root.right=b;
        
        a.left=c;
        a.right=d;
        
        b.left=e;
        b.right=f;
        
        c.left=g;
        d.right=h;
        
        
        
        //preOrderTraversal(root);
        //inOrderTraversal(root);
        //postOrderTraversal(root);
        levelOrderTraversal(root);
        
    }
}