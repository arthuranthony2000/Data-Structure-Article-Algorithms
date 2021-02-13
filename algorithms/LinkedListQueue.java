//////////////////////////////////////////////////////////////////////
// Author: Arthur Anthony da Cunha Romão E Silva                   ///
// Enrollment: 20190011208                                         ///
//                                                                 ///
//////////////////////////////////////////////////////////////////////

public class LinkedListQueue{
	private NodeQueue head;
	private NodeQueue tail;

	public LinkedListQueue(){
		head = null;
		tail = null;
	}

	public boolean isEmpty(){
		return (head == null && tail == null);
	}

	public void queue(int value){
		NodeQueue new_tail = new NodeQueue(value);
		if(!isEmpty()){
			tail.setNext(new_tail);
			tail = new_tail;
		} else{
			tail = new_tail;
			head = tail;
		}
	}

	public int dequeue(){
		int value = -1;;
		if(!isEmpty()){
			if(head == tail){
				value = head.getValue();
				head = head.getNext();
				tail = head;
			} else{
				value = head.getValue();
				head = head.getNext();
			}
		}
		return value;
	}

	public void show(){
		NodeQueue aux = head;
		while(aux != null){
			System.out.print(aux.getValue()+" ");
			aux = aux.getNext();
		}
		System.out.println();
	}

}