package exam24;

// K와 V 두 개의 타입을 파라미터로 정의
public class Entry<K, V> {
	private K key;
	private V valus;

	public Entry(K key, V valus) {
		this.key = key;
		this.valus = valus;
	}

	public K getKey() {
		return key;
	}

	public V getValus() {
		return valus;
	}

	public void display() {
		System.out.println("Key : " + key + " (Type : " + key.getClass().getSimpleName() + ")");
		System.out.println("Valus : " + valus + " (Type : " + valus.getClass().getSimpleName() + ")");
	}

}
