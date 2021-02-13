//////////////////////////////////////////////////////////////////////
// Author: Arthur Anthony da Cunha Romão E Silva                   ///
// Enrollment: 20190011208                                         ///
//                                                                 ///
//////////////////////////////////////////////////////////////////////

public class MainHash{
	public static void main(String args[]){
		HashMap hash = new HashMap(100);
		hash.put(new Register(10, "Estrutura de Dados"));
		hash.put(new Register(22, "Programação Orientada à Objetos I"));
		hash.put(new Register(33, "Programação"));
		hash.put(new Register(44, "Programação Orientada à Objetos II"));
		System.out.println(hash.get(44));
		System.out.println(hash.get(10));
		System.out.println(hash.get(33));
		System.out.println(hash.get(22));
	}
}