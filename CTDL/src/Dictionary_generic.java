public class Dictionary_generic<K, V> {
    private K key;
    private V value;

    public Dictionary_generic(K k, V v) {
        this.key = k;
        this.value = v;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return key + " - " + value;
    }
}
