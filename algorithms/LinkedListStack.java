//////////////////////////////////////////////////////////////////////
// Author: Arthur Anthony da Cunha Romão E Silva                   ///
// Enrollment: 20190011208                                         ///
//                                                                 ///
//////////////////////////////////////////////////////////////////////

public class LinkedListStack{
	private NodeStack top;

	public LinkedListStack(){
		top = null;
	}

	public void push(int value){
        NodeStack new_node = new NodeStack();
        new_node.setValue(value);
        new_node.setNext(top);
        top = new_node;
    }	
    public int pop(){
        int value = -1;
        if(!isEmpty()){
            value = top.getValue();
            top = top.getNext();
        }
        return value;
    }

    public void show(){
    	NodeStack aux = top;
    	while(aux != null){
    		System.out.print(aux.getValue()+" ");
    		aux = aux.getNext();
    	}
        System.out.println();
    }

	public boolean isEmpty(){
		return (top == null);
	}
}