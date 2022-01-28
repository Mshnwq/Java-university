/**
 * @(#)EComparator.java
 *
 * Compares two given elements of any type E.
 *
 *
 */

import java.util.Comparator;

public class EComparator<E> implements Comparator<E> {
	public int compare(E a, E b) throws ClassCastException {
		return ((Comparable<E>) a).compareTo(b);
	}
}