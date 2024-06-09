public class Main {
    public static void main(String[] args) {
        int[] array = {0,10,9,8,2,3,-1};
        Sort sort = new Sort();
        sort.printArray(array);
        sort.selectionSort(array);
        sort.printArray(array);
    }
}