package z1;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        long millisActualTime = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();

        for (int i = 0; i < 100; i+=2){
                arrayList.add(i);
        }

        for (int i=0;i<50;i++){
            System.out.println(arrayList.get(i));
        }

        long executionTime = System.currentTimeMillis() - millisActualTime;
        System.out.println(executionTime + "ms");
    }
}
