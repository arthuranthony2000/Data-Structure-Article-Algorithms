//////////////////////////////////////////////////////////////////////
// Author: Arthur Anthony da Cunha Romão E Silva                   ///
// Enrollment: 20190011208                                         ///
//                                                                 ///
//////////////////////////////////////////////////////////////////////

public class MainDoublyLinkedList{
    public static void main(String args[]){
        DoublyLinkedList list = new DoublyLinkedList();

        list.insert(3);
        list.insert(10);
        list.insert(1);
        list.insert(2);
        list.insert(5);
        list.insert(-10);
        list.insert(22);

        list.show(); // lista encaedada não ordenada

        // Letra (a) da 2ª questão da prova
         System.out.println(list.presort_opposite(list.getBegin()));

         list.show(); // lista encadeada esta ordenada

        // Letra (b) da 2ª questão da prova
         System.out.println(list.opposite(list.getBegin()));


         System.out.println(list.sucessor(5));
         System.out.println(list.predecessor(5));

    }
}