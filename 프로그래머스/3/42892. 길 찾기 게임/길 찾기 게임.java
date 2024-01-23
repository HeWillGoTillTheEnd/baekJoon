import java.util.*;

class Solution {
    public static ArrayList<Integer> preOrderArr;
    public static ArrayList<Integer> postOrderArr;
    public int[][] solution(int[][] nodeinfo) {
        ArrayList<Node> nodeinfo2 = new ArrayList<>();
        for(int i =0;i<nodeinfo.length;i++){
            Node a = new Node(i+1,nodeinfo[i][0],nodeinfo[i][1]);
            nodeinfo2.add(a);
        }
        sortNode(nodeinfo2);
        Node root = nodeinfo2.get(0);
        for(int i =1; i<nodeinfo2.size();i++){
            addNode(root,nodeinfo2.get(i));
        }
        preOrderArr = new ArrayList<>();
        postOrderArr = new ArrayList<>();
        preOrder(root);
        postOrder(root);
        int[][] answer = new int[2][nodeinfo.length];
        for(int i =0; i<answer[0].length;i++){
            answer[0][i] = preOrderArr.get(i);
            answer[1][i] = postOrderArr.get(i);
        }
        return answer;
    }
    public void preOrder(Node node){
        if(node == null) return;
        
        preOrderArr.add(node.idx);
        preOrder(node.getLeft());
        preOrder(node.getRight());
    }
    public void postOrder(Node node){
        if(node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        postOrderArr.add(node.idx);
    }
    
    public void addNode(Node parent, Node child){
        if(child.getX() < parent.getX()){
            if(parent.getLeft() == null){
                parent.left = child;
            } else{
                addNode(parent.left, child);
            }
        } else{
            if(parent.getRight() == null){
                parent.right = child;
            } else{
                addNode(parent.right, child);
            }
        }
    }
    public void sortNode(List<Node> list){
        Collections.sort(list, new Comparator<Node>(){
        @Override
        public int compare(Node o1, Node o2){
            if(o1.getY() > o2.getY()){
                return -1;
            } else if(o1.getY() == o2.getY()){
                if(o1.getX() > o2.getX())
                    return 1;
                    else return -1;
                    } else return 1;
                }
            });
    }
}

class Node{
    public int idx;
    public int x;
    public int y;
    public Node left;
    public Node right;
    
    public Node(int idx,int x, int y){
        this.idx = idx;
        this.x = x;
        this.y = y;
        this.left = null;
        this.right = null;
    }
    @Override
    public String toString(){
        return "[" + x + " ," + y + "] , idx : " + idx;
    }
    public int getY(){
        return this.y;
    }
    public int getX(){
        return this.x;
    }
    public Node getLeft(){
        return this.left;
    }
    public Node getRight(){
        return this.right;
    }
}