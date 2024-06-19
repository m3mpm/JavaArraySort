public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        int min = -100;
        int max = 100;

        Sort sort = new Sort();
        Service service = new Service();

        service.fillArray(array,min,max);
        service.printArray(array);

        sort.insertionSort(array);
        service.printArray(array);
    }
}