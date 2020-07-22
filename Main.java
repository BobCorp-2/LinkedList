/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylinkedlist;

/**
 *
 * @author tigerye
 */
public class Main {

        public static void main(String[] args) {
                // Create a new linked list
                MyLinkedList list = new MyLinkedList();
                
                // Add new nodes
                list.add(new Node(1));
                list.add(new Node(88));
                list.add(new Node(67));
                list.add(new Node(101));
                list.add(new Node(4));
                list.add(new Node(-1));
                list.add(new Node(72));

                // Display contents of linked list
                list.display();
        }
}

