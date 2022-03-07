
public class MyMapNode <K, V> implements Node<K>  {
	K key;
	V value;
    Node<K> next;

    /**
     * parameterized constructor with Key and Value
     * @param key- to store key
     * @param value - to store value
     */
	public MyMapNode(K key, V value) {
		this.key = key;
		this.value = value;
		this.next = null;
	}

	/**
	 * getter and setter Methods
	 */
	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	@Override
	public Node<K> getNext() {
		return next;
	}

	@Override
	public void setNext(Node<K> next) {

		this.next = next;

	}

	/**
	 * To string Method
	 */
	@Override
	public String toString() {
		StringBuilder myMapNodeString = new StringBuilder();
		myMapNodeString.append(" MyMapNode {" + " K= ").append(key).append(" V= ").append(value).append('}');
		if (next != null)
			myMapNodeString.append("->").append(next);
		return myMapNodeString.toString();
	}


}
