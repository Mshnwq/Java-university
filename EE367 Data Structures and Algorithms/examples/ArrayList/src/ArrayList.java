/**
 * @(#)ArrayList.java
 *
 * ArrayList application
 *
 * @author Dr. Abdulghani M. Al-Qasimi
 * @version 1.00 2009/12/2
 *
 * A Generic class ArrayList<E> is a container class for a list of items,
 * of type E, where the list is implemented using a partially filled array
 * of fixed capacity, and may have a designated item called current.
 *
 */

import java.util.Comparator;

public class ArrayList<E> {
	private static final int CAPACITY = 30;
    private E[] data;
    private int size;
    private int current;
    protected Comparator<E> c;


	// CONSTRUCTOR for the ArrayList class:
	// ArrayList<E>()
	// Postcondition: The list is initialized as an empty list.
	//
    public ArrayList() {
    	data = (E[]) new Object[CAPACITY];
    	c = new EComparator<E>();
    	size = 0;
    	current = 0;
    }

	// CONSTRUCTOR for the ArrayList class:
	// ArrayList<E>()
	// Postcondition: The list is initialized as an empty list
	// with a given comparator.
	//
    public ArrayList(Comparator<E> comp) {
    	data = (E[]) new Object[CAPACITY];
    	size = 0;
    	current = 0;
    	c = comp;
    }

	// Postcondition: The first item on the list becomes the current item
	// (but if the list is empty, then there is no current item).
	//
    public void first() {
    	current = 0;
    }

	// Postcondition: The last item on the list becomes the current item
	// (but if the list is empty, then there is no current item).
	//
    public void last() {
        if (size > 0)
			current = size - 1;
       	else
			current = 0;
    }

	// Precondition: isElement() returns true.
	// Postcondition: If the current item was already the last item in the
	// list, then there is no longer any current item. Otherwise, the new
	// current item is the item immediately after the original current item.
	//
    public void next() {
        assert isElement();
        ++current;
    }

	// Precondition: isElement() returns true.
	// Postcondition: If the current item was already the first item in the
	// list, then there is no longer any current item. Otherwise, the new
	// current item is the item immediately before the original current item.
	//
    public void prior() {
        assert isElement();
        if (current > 0)
            --current;
       	else
			current = size;
    }

	// Postcondition: If position is within the list, the item at index becomes
	// the current item of the list, otherwise, there is no longer any current
	// item.
	//
    public void seek(int position) {
        if (position < size)
            current = position;
       	else
			current = size;
    }

	// Postcondition: The list has been searched for the target. If the target
	// was present, then the found target is now the current item.
	// Otherwise, there is no current item.
	//
    public void search (E target) {
        int i=0;
        boolean found = false;

        while ((i < size) && !found) {
            if (c.compare(data[i], target) == 0)
                found = true;
            else
                i++;
        }
        current = i;
    }

	// Postcondition: The items of the list have been sorted in an ascending
	// order of their key values, and there is no current item.
	//
    public void sort() {
		// Selection Sort Algorithm:
		//
        int small, j, k;

        for (k = 0; k < size-1; k++) {
            small = k;
            for (j = k+1; j < size; j++)
                if (c.compare(data[j], data[small]) < 0) small = j;
            E temp;
            temp = data[small];
            data[small] = data[k];
            data[k] = temp;
        }
        current = size;
    }

	// Precondition: The array segment starting at data[first] and containing
	// size elements is sorted from smallest to largest.
	// Postcondition: The array segment starting at data[first] and containing
	// size elements has been searched for the target.
	// If the target was present, then the found target is now the current item.
	// Otherwise, there is no current item.
	//
    public void bsearch(E target, int first, int size) {
        int middle;

        if (size == 0)
            current = this.size;
        else {
            middle = first + size/2;

            if (c.compare(data[middle], target) == 0)
                current = middle;
            else if (c.compare(data[middle], target) > 0)
                // The target is less than middle item, search before it
                bsearch(target, first, size/2);
            else
                // The target is greater than middle item, search after it
                bsearch(target, middle+1, (size-1)/2);
        }
    }

	// Precondition: isElement() returns true.
	// Postcondition: The value of the current item has changed to entry.
	//
    public void set(E entry) {
        assert isElement();
        data[current] = entry;
    }

	// Precondition: size < CAPACITY.
	// Postcondition: A new copy of entry has been inserted in the list
	// before the current item. If there was no current item, then the new entry
	// has been inserted at the front of the list. In either case, the newly
	// inserted item is now the current item of the list.
	//
    public void addBefore(E entry) {
        int i;

        assert size < CAPACITY;
        if (!isElement())
            current = 0;
        for (i = size; i > current; i--)
            data[i] = data[i-1];
        data[current] = entry;
        size++;
    }

	// Precondition: size < CAPACITY.
	// Postcondition: A new copy of entry has been inserted in the list after
	// the current item. If there was no current item, then the new entry has
	// been attached to the end of the list. In either case, the newly
	// inserted item is now the current item of the list.
	//
    public void addAfter(E entry) {
        int i;

        assert size < CAPACITY;
        if (isElement()) {
            ++current;
            for (i = size; i > current; i--)
                data[i] = data[i-1];
        }
        data[current] = entry;
        size++;
    }

	// Precondition: isElement() returns true.
	// Postcondition: The current item has been removed from the list, and the
	// item after this (if there is one) is now the new current item.
	//
    public void remove( ) {
        int i;

        assert isElement();
        for (i = current+1; i < size; i++)
            data[i-1] = data[i];
        size--;
    }

	// Postcondition: The list is now empty.
	//
    public void clear() {
    	size = 0;
    	current = 0;
    }

	// Precondition: isElement() returns true.
	// Postcondition: The item returned is the current item in the list.
	//
    public E get() {
        assert isElement();
        return data[current];
    }

	// Postcondition: The returned value is the index of the current item
	// in the list.
	//
    public int getPosition() {
    	 return current;
    }

	// Postcondition: The return value is the number of items in the list.
	//
    public int size() {
    	return size;
    }

	// Postcondition: A true return value indicates that there is a valid
	// "current" item that may be retrieved by activating the current
	// member function (listed below). A false return value indicates that
	// there is no valid current item.
	//
    public boolean isElement() {
    	return (current < size);
    }

	// Postcondition: The return value is true if the list has no items,
	// otherwise, it is false.
	//
    public boolean isEmpty() {
    	return (size == 0);
    }

	// Postcondition: The return value is true if the list has a number
	// of items equal to its capacity, otherwise it is false.
	//
    public boolean isFull() {
    	return (size == CAPACITY);
    }

	// Precondition: position < size.
	// Postcondition: The element returned is at the given position
	// in the list. The current element is not changed by this method.
	//
    public E getAtPosition(int position) {
        assert position <= size;
        return data[position];
    }
}
