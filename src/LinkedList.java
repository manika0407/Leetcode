/**
 * Created by manika on 2/5/17.
 */
class Node{
    int data;
    protected Node link;
    public Node(){
        link=null;
        data=0;
    }
    public Node(int d,Node n){
        data=d;
        link=n;
    }
    public void setLink(Node n){
        link=n;
    }
    public Node getLink(){
        return link;
    }
    public int getData(){
        return data;
    }
}
public class LinkedList {
    protected Node start;
    protected Node end;
    public int size;

    public LinkedList(){
        start=null;
        end=null;
        size=0;
    }
    public boolean isEmpty(){
        return start==null;
    }

    public int getSize(){
        return size;
    }
    public void insertAtStart(int val){
        Node node=new Node(val,null);
        size++;
        if(start==null){
            start=node;
            end=start;
        }
        else{
            end.setLink(node);
            end=node;
        }
    }
}
