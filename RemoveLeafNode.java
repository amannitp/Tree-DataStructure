import java.util.*;

class RemoveLeafNode{
    
    public static class Node {
        int val;
        Node left;
        Node right;
    }
    
    public static void preOrderTraversal(Node root){
        
        if(root==null){
            return;
        }
        System.out.println("pre "+root.val);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    public static void inOrderTraversal(Node root){
        
        if(root==null){
            return ;
        }
        
        inOrderTraversal(root.left);
        System.out.println("in "+root.val);
        inOrderTraversal(root.right);
    }
    public static void postOrderTraversal(Node root){
        
        if(root==null){
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.println("post "+root.val);
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
    public static void printKLevelDown(Node root,int k){
        
        // Queue<Node> que=new LinkedList<>();
        
        // que.add(root);
        
        // while(que.size()>0){
            
        //     int size=que.size();
            
        //     while(size-->0){
                
        //         Node rem=que.remove();
                
        //         if(rem==null){
        //             continue;
        //         }
        //         if(k<=0){
        //         System.out.print(rem.val+" ");
        //         }
        //         que.add(rem.left);
        //         que.add(rem.right);
        //     }
        //     k--;
        // }
        
        if(root==null){
            return;
        }
        
        if(k==0){
            System.out.print(root.val+" ");
            return;
        }
        printKLevelDown(root.left,k-1);
        printKLevelDown(root.right,k-1);
    }
    public static void printSingleChildNode(Node root){
        
        if(root==null){
            return;
        }
        if(root.left!=null &&  root.right==null){
            System.out.println(root.left.val);
        }
        if(root.left==null &&  root.right!=null){
            System.out.println(root.right.val);
        }
        printSingleChildNode(root.left);
        printSingleChildNode(root.right);
    }
    public static void removeLeaves(Node node){
    // write your code here
    
    if(node==null){
        return;
    }
    
    if(node.left!=null && node.left.left==null && node.left.right==null){
        node.left=null;
    }
    if(node.right!=null && node.right.left==null && node.right.right==null){
        node.right=null;
    }
    removeLeaves(node.left);
    removeLeaves(node.right);
    
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
        //levelOrderTraversal(root);
        //printKLevelDown(root,3);
        //printSingleChildNode(root);
        removeLeaves(root);
        preOrderTraversal(root);
        
    }
}
