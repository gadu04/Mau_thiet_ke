public class SortingDemo {
    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        SortContext context = new SortContext(new BubbleSort());
        context.executeStrategy(array);

        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();

        // Changing strategy to Selection Sort
        context = new SortContext(new SelectionSort());
        context.executeStrategy(array);

        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }
}
