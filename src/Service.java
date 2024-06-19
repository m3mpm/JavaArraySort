import java.util.concurrent.ThreadLocalRandom;

public class Service {

    /**
     * Заполнение массива случайными числами
     */
    public void fillArray(int[] array, int min, int max){
        int size = array.length;
        for (int i = 0; i < size; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(min,max);
        }
    }

    /**
     * Печать массива
     */
    public void printArray(int[] array){
        for(int num: array){
            System.out.print(num + " ");
        }
        System.out.println("");
    }

}
