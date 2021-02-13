//////////////////////////////////////////////////////////////////////
// Author: Arthur Anthony da Cunha Romão E Silva                   ///
// Enrollment: 20190011208                                         ///
//                                                                 ///
//////////////////////////////////////////////////////////////////////

import java.util.ArrayList;

class BinaryTree{
	private NodeBinaryTree nodetree;
	private BinaryTree left;
	private BinaryTree right;

	public BinaryTree(){
		this.nodetree = null;
		this.left = null;
		this.right = null;
	}

	public BinaryTree(NodeBinaryTree nodetree){
		this.nodetree = nodetree;
		this.left = null;
		this.right = null;
	}	

	public void insert(NodeBinaryTree nodetree){
		if(isEmpty()){
			this.nodetree = nodetree;
		} else{
			BinaryTree newTree = new BinaryTree(nodetree);
			if(nodetree.getValue() < this.nodetree.getValue()){
				if(this.left == null)
					this.left = newTree;
				else{
					this.left.insert(nodetree);
				}
			} else if(nodetree.getValue() > this.nodetree.getValue()){
				if(this.right == null)
					this.right = newTree;
				else{
					this.right.insert(nodetree);
				}
			}
		}
	}

	public BinaryTree delete(NodeBinaryTree nodetree){
		if(this.nodetree.getValue() == nodetree.getValue()){
			if(this.left == null && this.right == null)
				return null;
			else{
				if(this.left != null && this.right == null)
					return this.left;
				else if(this.left == null && this.right == null)
					return this.right;
				else{
					BinaryTree aux = this.left;
					while(aux.getRight() != null){
						aux = aux.getRight();
					}
					this.nodetree = aux.getNodeBinaryTree();
					aux.setNodeBinaryTree(nodetree);
					this.left = this.left.delete(nodetree);
				}
			}
		} else if(nodetree.getValue() < this.nodetree.getValue()){
			this.left = this.left.delete(nodetree);
		} else if(nodetree.getValue() > this.nodetree.getValue()){
			this.right = this.right.delete(nodetree);
		}
		return this;
	}

	// algoritmo da 3ª questão da prova  
	public int sum(BinaryTree tree) {
	    return tree.getNodeBinaryTree().getValue() + (tree.getRight() == null ? 0 : tree.sum(tree.getRight())) + (tree.getLeft() == null ? 0 : tree.sum(tree.getLeft()));
    }

    // algoritmo da 4ª questão da prova    
    public int difference_min_max(BinaryTree tree){
    	return max(tree) - min(tree);
    }

    // algoritmo da 4ª questão da prova
	public int min(BinaryTree tree){
		return (tree.getLeft() == null) ? tree.getNodeBinaryTree().getValue() : min(tree.getLeft());
	}

	// algoritmo da 4ª questão da prova    
	public int max(BinaryTree tree){
		return (tree.getRight() == null) ? tree.getNodeBinaryTree().getValue() : max(tree.getRight());
	}

	public boolean search(int value){
		if(isEmpty()){
			return false;
		}
		if(nodetree.getValue() == value){	
			return true;
		}
		else{
			if(value < this.nodetree.getValue()){
				if(this.left == null){
					return false;
				}
				else{
					return this.left.search(value);
				}
			} else if(value > this.nodetree.getValue()){
				if(this.right == null){
					return false;
				}
				else{
					return this.right.search(value);
				}
			}
			return false;
		}
	}

	public void printPreOrder(){
		if(!isEmpty()){
			System.out.print(this.nodetree.getValue()+" ");
			if(this.left != null){
				this.left.printPreOrder();
			}
			if (this.right != null){
				this.right.printPreOrder();
			}
		}
	}

	public void printInOrder(){
		if(!isEmpty()){
			if(this.left != null){
				this.left.printInOrder();
			}
			System.out.print(this.nodetree.getValue()+" ");
			if (this.right != null){
				this.right.printInOrder();
			}
		}
	}

	public int sucessor(int value){
		ArrayList<Integer> list = new ArrayList<Integer>();
		mountList(list);
		for(int i=0; i < list.size(); i++){
			if(list.get(i) == value){
				if(i+1 < list.size())
					return list.get(i+1);
			}
		}
		return -1;
	}

	public int predecessor(int value){
		ArrayList<Integer> list = new ArrayList<Integer>();
		mountList(list);
		for(int i=0; i < list.size(); i++){
			if(list.get(i) == value){
				if(i-1 >= 0)
					return list.get(i-1);
			}
		}
		return -1;
	}

	public void mountList(ArrayList<Integer> list){
		if(!isEmpty()){
			if(this.left != null){
				this.left.mountList(list);
			}
			list.add(this.nodetree.getValue());
			if (this.right != null){
				this.right.mountList(list);
			}
		}
	}

	public void printPosOrder(){
		if(!isEmpty()){
			if(this.right != null)
				this.right.printPosOrder();
			if(this.left != null)
				this.left.printPosOrder();		
			System.out.print(this.nodetree.getValue()+" ");
		}
	}	

	public boolean isEmpty(){
		return (this.nodetree == null);
	}

	// Getters and Setters

	public void setNodeBinaryTree(NodeBinaryTree nodetree){
		this.nodetree = nodetree;
	}

	public NodeBinaryTree getNodeBinaryTree(){
		return this.nodetree;
	}

	public void setLeft(BinaryTree left){
		this.left = left;
	}

	public BinaryTree getLeft(){
		return this.left;
	}

	public void setRight(BinaryTree right){
		this.right = right;
	}

	public BinaryTree getRight(){
		return this.right;
	}
}