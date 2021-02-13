//////////////////////////////////////////////////////////////////////
// Author: Arthur Anthony da Cunha Romão E Silva                   ///
// Enrollment: 20190011208                                         ///
//                                                                 ///
//////////////////////////////////////////////////////////////////////

public class MainStack{
	public static void main(String args[]){
		LinkedListStack l = new LinkedListStack();
		l.push(10);
		l.show();
		l.push(12);
		l.show();
		l.push(15);
		l.show();
		l.push(20);
		l.show();
		l.push(1);
		l.show();
		l.pop();
		l.show();
		l.pop();
		l.show();
		l.pop();
		l.show();
		l.pop();
		l.show();
	}
}