//////////////////////////////////////////////////////////////////////
// Author: Arthur Anthony da Cunha Romão E Silva                   ///
// Enrollment: 20190011208                                         ///
//                                                                 ///
//////////////////////////////////////////////////////////////////////

class HashMap{
	private Register[] values;
	private int length;

	public HashMap(int length){
		this.length = length;
		values = new Register[length];
	}

	public void put(Register reg){	
		if(values[HashMap.hashCode(reg, this.getLength())] == null)
			values[HashMap.hashCode(reg, this.getLength())] = reg;
		else{
			Register aux = values[HashMap.hashCode(reg, this.getLength())];
			if(aux.getKey() == reg.getKey()){
				aux.setValue(reg.getValue());
				return;
			} else{
				while(aux.getNext() != null){
					if(aux.getKey() == reg.getKey()){
						aux.setValue(reg.getValue());
						return;
					}
					aux = aux.getNext();
				}
			}
			aux.setNext(reg);
		}
	}

	public String get(int key){
		int index = HashMap.hashCode(new Register(key), this.getLength());
		if(values[index] == null)
			return null;		
		Register aux = values[index];
		if(aux.getKey() == key)
			return aux.getValue();
		else{
			while(aux != null){
				if(aux.getKey() == key)
					return aux.getValue();
				aux = aux.getNext();
			}
		}
		return null;
	}

	public static int hashCode(Register reg, int length){
		return reg.getKey() % length;
	}

	public int getLength(){
		return this.length;
	}

	public void setLength(int length){
		this.length = length;
	}
}