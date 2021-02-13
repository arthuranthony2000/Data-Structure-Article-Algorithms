//////////////////////////////////////////////////////////////////////
// Author: Arthur Anthony da Cunha Romão E Silva                   ///
// Enrollment: 20190011208                                         ///
//                                                                 ///
//////////////////////////////////////////////////////////////////////

class MainBinaryTree{
	public static void main(String args[]){
		BinaryTree tree = new BinaryTree(new NodeBinaryTree(6));
		tree.insert(new NodeBinaryTree(4));
		tree.insert(new NodeBinaryTree(9));
		tree.insert(new NodeBinaryTree(8));
		tree.insert(new NodeBinaryTree(10));
		tree.insert(new NodeBinaryTree(3));
		tree.insert(new NodeBinaryTree(5));
		
		// 3ª questão da prova
		System.out.println("A soma de todos os elementos da árvore binária:");
		System.out.println(tree.sum(tree)); // Soma de todos os elementos da arvore binária.
		
		// 4ª questão da prova
		System.out.println("A diferença entre o valor máximo e o valor mínimo da árvore binária:");
		System.out.println(tree.difference_min_max(tree)); // Diferença entre o valor máximo e mínimo.
		
		tree.printInOrder();
		System.out.println();
		//tree.delete(new NodeBinaryTree(9));
		//tree.printInOrder();
		//System.out.println();

		System.out.println(tree.sucessor(8));
		System.out.println(tree.predecessor(8));
	}
}