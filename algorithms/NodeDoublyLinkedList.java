//////////////////////////////////////////////////////////////////////
// Author: Arthur Anthony da Cunha Romão E Silva                   ///
// Enrollment: 20190011208                                         ///
//                                                                 ///
//////////////////////////////////////////////////////////////////////

public class NodeDoublyLinkedList{
    private int value;
    private NodeDoublyLinkedList previous;
    private NodeDoublyLinkedList next;

    public NodeDoublyLinkedList(){
        this.next = null;
        this.previous = null;
    }

    public NodeDoublyLinkedList(int value){
        this.value = value;
        this.next = null;
        this.previous = null;
    }
    
    public void setValue(int value){
        this.value = value;
    }
    public void setPrevious(NodeDoublyLinkedList previous){
        this.previous = previous;
    }
    public void setNext(NodeDoublyLinkedList next){
        this.next = next;
    }
    public int getValue(){
        return this.value;
    }
    public NodeDoublyLinkedList getPrevious(){
        return this.previous;
    }
    public NodeDoublyLinkedList getNext(){
        return this.next;
    }
    
}