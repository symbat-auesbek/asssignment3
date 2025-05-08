import java.util.Random;

public class TestMyHashTable {
    public static void main(String[] args) {
        MyHashTable<MyTestingClass, Integer> table = new MyHashTable<>(1000); // 1,000 бакетов
        Random random = new Random();

        for (int i = 0; i < 10000; i++) { // Добавляем 10,000 элементов
            String randomString = "Key" + random.nextInt(100000);
            table.put(new MyTestingClass(randomString), i);
        }

        table.printBucketSizes();
    }
}