import java.util.concurrent.ThreadLocalRandom;

public class Sort {

    /**
     * Пузырьковая сортировка
     */
    public void bubbleSort(int[] array){
        int size = array.length;
        for (int out = size - 1; out > 1; out--){
            for (int in = 0; in < out; in++){
                if(array[in] > array[in + 1]){
                    swap(array,in,in+1);
                }
            }
        }
    }

    /**
     * Сортировка методом выбора
     */
    public void selectionSort(int[] array){
        int size = array.length;
        int min;
        for (int out = 0; out < size - 1; out++) {
            min = out;
            for (int in = out + 1; in < size ; in++) {
                if(array[in] < array[min]){
                    min = in;
                }
            }
            swap(array,out,min);
        }
    }


    /**
     * Сортировка методом вставки
     */
    public void insertionSort(int[] array){
        int size = array.length;
        for (int out = 1; out < size; out++) {
            int tmp = array[out];
            int in = out;
            for (; in > 0 && array[in - 1] >= tmp ; in--) {
                    array[in] = array[in -1];
            }
            array[in] = tmp;
        }
    }


    /**
     * Перестановка элементов
     */
    private void swap(int[] array, int one, int two){
        int tmp = array[one];
        array[one] = array[two];
        array[two] = tmp;
    }


}
