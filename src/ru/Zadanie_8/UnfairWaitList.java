package ru.Zadanie_8;

import java.util.Collection;

public class UnfairWaitList<E> extends WaitList<E>{
    public UnfairWaitList(Collection<E> c){super(c);}
    @Override
    public void add(E element) {
        super.add(element);
    }

    @Override
    public E remove() {
        return super.remove();
    }
    public void remove(E element){
        content.remove(element);
    }
    public void ToBack(E element){

    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean contains(E element) {
        return super.contains(element);
    }

    @Override
    public boolean containsAll(Collection<E> c) {
        return super.containsAll(c);
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }
}
