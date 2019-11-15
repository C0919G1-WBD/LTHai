package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object element[];

    public MyList() {
        element = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        if(capacity < 0) {
            throw new IllegalArgumentException("Capacity = " + capacity);
        } else {
            element = new Object[capacity];
        }
    }

    public void ensureCapacity(int minCapacity) {
        element = Arrays.copyOf(element,minCapacity);
    }

    public boolean add(E element) {
        ensureCapacity(size + 1);
        this.element[size] = element;
        size++;
        return true;
    }

    public void add(int index, E element) {
        if(index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        } else {
            if(size == 0) {
                add(element);
            } else {
                ensureCapacity(size + 1);
                for(int i = size - 1; i >= index; i--) {
                    this.element[i + 1] = this.element[i];
                }
                this.element[index] = element;
                size++;
            }
        }
    }

    public E remove(int index) {
        if(index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        } else {
            E element = (E) this.element[index];
            for(int i = index; i < this.size; i++) {
                this.element[i] = this.element[i + 1];
            }
            this.element[size - 1] = null;
            size--;
            return element;
        }
    }

    public int size() {
        return this.size;
    }

    public boolean contains(E element) {
        for(int i = 0; i < size; i++) {
            if(this.element[i] == element) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E element) {
        int index = 0;
        for(int i = 0; i < size; i++) {
            if(this.element[i] == element) {
                index = i;
            } else {
                index = -1;
            }
        }
        return index;
    }

    public E get (int index) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", size: " + size);
        } else {
            return (E) this.element[index];
        }
    }

    public void clear() {
        this.element = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public Object clone() {
        MyList<E> list = new MyList<E>();
        list.element = Arrays.copyOf(this.element, this.size);
        return list.element;
    }
}
