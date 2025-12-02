package org.akk.oop2_advance.i_generics_or_ParametricPolymorphism.mine;


class Pair<K, V>{
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}


public class Ex4MultipleTypeParameters {
    public static void main(String[] args) {

        ///  Pair<String, Integer>
        Pair<String, Integer> pair = new Pair<String, Integer>("Age", 35);
        System.out.println(pair.getKey() + " : " + pair.getValue());

        /// Pair<Integer, String>
        Pair<Integer, String> pair2 = new Pair<Integer, String>(101, "Ashwani");
        System.out.println(pair2.getKey() + " : "  + pair2.getValue());

    }
}
