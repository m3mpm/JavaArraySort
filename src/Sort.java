public class Sort {
    public void bubbleSort(int[] array){
        int size = array.length;
        for (int out = size -1; out > 1; out--){
            for (int in = 0; in < out; in++){
                if(array[in] > array[in + 1]){
                    swap(array,in,in+1);
                }
            }
        }
    }

    private void swap(int[] array, int one, int two){
        int tmp = array[one];
        array[one] = array[two];
        array[two] = tmp;
    }

    public void printArray(int[] array){
        for(int num: array){
            System.out.print(num + " ");
        }
        System.out.println("");
    }
}
