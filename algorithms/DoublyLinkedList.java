//////////////////////////////////////////////////////////////////////
// Author: Arthur Anthony da Cunha Romão E Silva                   ///
// Enrollment: 20190011208                                         ///
//                                                                 ///
//////////////////////////////////////////////////////////////////////

public class DoublyLinkedList{
    private NodeDoublyLinkedList begin;

    public DoublyLinkedList(){
        this.begin = null;
    }

    public boolean isEmpty(){
        return (this.begin == null);
    }    

    public void insert(int value){
        NodeDoublyLinkedList new_node = new NodeDoublyLinkedList();
        new_node.setValue(value);

        if (isEmpty()){
            new_node.setNext(new_node);
            new_node.setPrevious(new_node);
            begin = new_node;
        }
        else{
            NodeDoublyLinkedList aux = begin;
            while(aux.getNext() != begin){
                aux = aux.getNext();
            }
            begin.setPrevious(new_node);
            aux.setNext(new_node);
            new_node.setPrevious(aux);
            new_node.setNext(begin);
        }
    }

    // algoritmo de ordenação selection sort adaptado a lista encadeada
    public void sort(){
        NodeDoublyLinkedList node = begin;
        NodeDoublyLinkedList min = node;
        NodeDoublyLinkedList current = node.getNext();
        int aux;
        do{
            do{
                if(current.getValue() < min.getValue()){
                    min = current;
                }
                current = current.getNext();
            } while(current.getNext() != begin);
            
            if(min != node){
                aux = node.getValue();
                node.setValue(min.getValue());
                min.setValue(aux);
            }        

            node = node.getNext();
            current = node.getNext();
            min = node;
        } while(node.getNext().getNext() != begin);
    }

    public int sucessor(int value){
        this.sort();
        NodeDoublyLinkedList node = begin;
        do{
            if(node.getValue() == value){
                return node.getNext().getValue();
            }
            node = node.getNext();
        }while(node != begin);
        return -1;
    }

    public int predecessor(int value){
        this.sort();
        NodeDoublyLinkedList node = begin;
        do{
            if(node.getValue() == value){
                return node.getPrevious().getValue();
            }
            node = node.getNext();
        }while(node != begin);
        return -1;
    }

    // algoritmo da letra (a) da questão 2 da prova
    public boolean presort_opposite(NodeDoublyLinkedList node){
        // não foi implementado especificadamente o algoritmo de ordenação distribution sort pra lista duplamente encadeada
        // porém como é necessário que a complexidade seja omega(n), pode ser qualquer algoritmo de ordenação com complexidade maior ou igual a linear
        // neste caso foi um selection sort adaptado para lista encadeada 
        this.sort();

        NodeDoublyLinkedList aux;
        do{             
            aux = node.getNext();           
            do{
                if(aux.getValue() == (node.getValue()*-1))
                    return true;
                aux = aux.getNext();                   
            } while(aux != begin);
            node = node.getNext();
        } while(node != begin);
        return false;
    }

    // algoritmo da letra (b) da questão 2 da prova
    public boolean opposite(NodeDoublyLinkedList node){
        NodeDoublyLinkedList i = node;
        NodeDoublyLinkedList j = node.getPrevious();
        while(i != j){
            if(i.getValue() == (j.getValue()*(-1))){
                return true;
            }
            if(Math.abs(i.getValue()) > j.getValue()){
                i = i.getNext();
            }
            else{
                j = j.getPrevious();
            }
        }
        return false;
    }

    public boolean search(int value){
        NodeDoublyLinkedList node = begin;
        do{
            if(node.getValue() == value){
                return true;
            }
            node = node.getNext();
        } while(node != begin);
        return false;
    }

    public int minimum(){
        NodeDoublyLinkedList node = begin;
        int min = node.getValue();
        do{
            if(node.getValue() < min){
                min = node.getValue();
            }
            node = node.getNext();
        } while(node != begin);
        return min;
    }

    public int maximum(){
        NodeDoublyLinkedList node = begin;
        int max = node.getValue();
        do{
            if(node.getValue() > max){
                max = node.getValue();
            }
            node = node.getNext();
        } while(node != begin);
        return max;
    }

    public void show(){
        NodeDoublyLinkedList node = begin;
        do{
            System.out.print(node.getValue()+" ");
            node = node.getNext();
        } while(node != begin);
        System.out.println();
    }

    public void showInverse(){
        NodeDoublyLinkedList node = begin;
        do{
            System.out.print(node.getValue()+" ");
            node = node.getPrevious();
        } while(node != begin);
        System.out.println();      
    }


    public NodeDoublyLinkedList getBegin(){
        return begin;
    }

    public void setBegin(NodeDoublyLinkedList node){
        this.begin = node;
    }
}