package rays.java.collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Integer100000{
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(100000);
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }
        
        HashSet<Integer> hashSet = new HashSet<>(arrayList);
        
        Random random = new Random();
        int[] randomIntegers = new int[50];
        for (int i = 0; i < 50; i++) {
            randomIntegers[i] = random.nextInt(100000);
        }
        
        long startTime = System.nanoTime();
        for (int num : randomIntegers) {
            arrayList.contains(num);
        }
        long endTime = System.nanoTime();
        long arrayListSearchTime = endTime - startTime;
        
        startTime = System.nanoTime();
        for (int num : randomIntegers) {
            hashSet.contains(num);
        }
        endTime = System.nanoTime();
        long hashSetSearchTime = endTime - startTime;
        
        System.out.println("Time taken to search in ArrayList: " + arrayListSearchTime + " nanoseconds");
        System.out.println("Time taken to search in HashSet: " + hashSetSearchTime + " nanoseconds");
    }
}
