import java.util.ArrayList;

/**
 * TODO: ทำให้คลาสนี้เป็น Generic <K, V> ที่สามารถเก็บอ็อบเจกต์ได้ 2 ชนิด
 */
public class Pair<k,v>{
    
    private final k key;
    private final v value;

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
    // TODO: สร้างฟิลด์ private final สำหรับ key และ value
    
    // TODO: สร้าง Constructor ที่รับ key และ value

    // TODO: สร้าง Getters สำหรับ key และ value
}