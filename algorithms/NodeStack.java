//////////////////////////////////////////////////////////////////////
// Author: Arthur Anthony da Cunha Romão E Silva                   ///
// Enrollment: 20190011208                                         ///
//                                                                 ///
//////////////////////////////////////////////////////////////////////

public class NodeStack{
	int value;
	private NodeStack next;

    public NodeStack(){
        this.next = null;
    }

    public NodeStack(int value){
        this.value = value;
        this.next = null;
    }

    
    public void setValue(int value){
        this.value = value;
    }
    
    public int getValue(){
        return this.value;
    }
    
    public void setNext(NodeStack next){
        this.next = next;
    }

    public NodeStack getNext(){
        return this.next;
    }
}