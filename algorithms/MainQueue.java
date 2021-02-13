//////////////////////////////////////////////////////////////////////
// Author: Arthur Anthony da Cunha Romão E Silva                   ///
// Enrollment: 20190011208                                         ///
//                                                                 ///
//////////////////////////////////////////////////////////////////////

public class MainQueue{
	public static void main(String args[]){
		LinkedListQueue l = new LinkedListQueue();
		l.queue(10);
		l.show();
		l.queue(12);
		l.show();
		l.queue(15);
		l.show();
		l.queue(20);
		l.show();
		l.queue(1);
		l.show();
		l.dequeue();
		l.show();
		l.dequeue();
		l.show();
		l.dequeue();
		l.show();
		l.dequeue();
		l.show();
	}
}