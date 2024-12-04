package Materia.Models.Stacks;

import java.util.EmptyStackException;

import Materia.Models.Node;

public class Stack {

    private Node top; //Nodo en la cima de nuestras pila
    private int size; //Tamaño de la pila

    //Creamos la pila con la cima nula o vacia
    public Stack() {
        this.top = null;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.setNext(top);
        top = newNode;
        size++;
    }

    //Metodo para retirar el node de la cima
    public int pop() {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int value = top.getValue();
        top = top.getNext();
        size--;
        return value;
    }

    //Metodo que retorna el valor del node de la cima.
    public int peek() {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return top.getValue();
    }
    
    public boolean isEmpty() {
        return top == null;
    }

    //
    public void printStack() {
        Node current = top;
        while (current != null) {
            System.out.print(current.getValue() + " ");
            current = current.getNext();
        }
    }
    
    //Metodo que retorna el tamaño de la pila
    //Complejidad 0(1)
    public int getSize() {
                return size;
    }
}