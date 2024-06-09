public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        int min = -100;
        int max = 100;

        Sort sort = new Sort();

        sort.fillArray(array,min,max);
        sort.printArray(array);

        sort.selectionSort(array);
        sort.printArray(array);
    }
}