//////////////////////////////////////////////////////////////////////
// Author: Arthur Anthony da Cunha Romão E Silva                   ///
// Enrollment: 20190011208                                         ///
//                                                                 ///
//////////////////////////////////////////////////////////////////////

class Register{
	private int key;
	private String value;
	private Register next;

	public Register(){}

	public Register(int key){
		this.key = key;
		this.next = null;
	}

	public Register(int key, String value){
		this.key = key;
		this.value = value;
		this.next = null;
	}

	public void setKey(int key){
		this.key = key;
	}

	public Integer getKey(){
		return this.key;
	}

	public void setValue(String value){
		this.value = value;
	}

	public String getValue(){
		return this.value;
	}

	public Register getNext(){
		return this.next;
	}

	public void setNext(Register reg){
		this.next = reg;
	}
	
}