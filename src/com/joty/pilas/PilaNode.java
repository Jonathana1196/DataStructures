/**
 * 
 */
package com.joty.pilas;

/**
 * Clase que se encarga de estableces los m�todos para PilaNode.
 * 
 * @author Jonathan
 * @param <T>
 *
 */
public class PilaNode<T> {

    private PilaNode<T> next;
    private T data;

    /**
     * 
     */
    public PilaNode() {
	this.next = null;
    }

    public PilaNode<T> getNext() {
	return next;
    }

    public void setNext(PilaNode<T> next) {
	this.next = next;
    }

    public T getData() {
	return data;
    }

    public void setData(T data) {
	this.data = data;
    }
}