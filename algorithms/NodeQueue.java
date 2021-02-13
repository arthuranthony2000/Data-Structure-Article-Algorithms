//////////////////////////////////////////////////////////////////////
// Author: Arthur Anthony da Cunha Romão E Silva                   ///
// Enrollment: 20190011208                                         ///
//                                                                 ///
//////////////////////////////////////////////////////////////////////

public class NodeQueue{
	int value;
	private NodeQueue next;

    public NodeQueue(){
        this.next = null;
    }

    public NodeQueue(int value){
        this.value = value;
        this.next = null;
    }
    
    public void setValue(int value){
        this.value = value;
    }
    
    public int getValue(){
        return this.value;
    }
    
    public void setNext(NodeQueue next){
        this.next = next;
    }

    public NodeQueue getNext(){
        return this.next;
    }
}