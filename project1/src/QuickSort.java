import java.util.Comparator;
import java.util.List;

public class QuickSort<T> {

    // This method sorts the given list using the quick sort algorithm.
    // It takes a comparator object which is used to compare objects of type T.
    public static <T> void sort(List<T> list, Comparator<? super T> comparator) {

        // If the list is null or contains 0 or 1 elements, it is already sorted, so return.
        if (list == null || list.size() < 2) {
            return;
        }

        // Otherwise, sort the list using quick sort.
        quickSort(list, 0, list.size() - 1, comparator);
    }


    // This is a helper method that performs the actual quick sort algorithm recursively.
    // It takes the list to be sorted, the left and right indices of the sublist being sorted, and the comparator.
    private static <T> void quickSort(List<T> list, int left, int right, Comparator<? super T> comparator) {

        // If the left index is less than the right index, continue sorting.
        if (left < right) {

            // Partition the list and get the pivot index.
            int pivotIndex = partition(list, left, right, comparator);

            // Recursively sort the left and right sublists.
            quickSort(list, left, pivotIndex - 1, comparator);
        }
    }

    // This is a helper method that partitions the list into two sublists based on a pivot value.
    // It takes the list, the left and right indices of the sublist being partitioned, and the comparator.
    // It returns the index of the pivot value after the partitioning is complete.
    private static <T> int partition(List<T> list, int left, int right, Comparator<? super T> comparator) {

        // Choose the rightmost element as the pivot.
        T pivot = list.get(right);

        // Initialize a partition index.
        int i = left - 1;

        // Iterate over the sublist from the left index to the right index.
        for (int j = left; j < right; j++) {

            // If the current element is less than the pivot, swap it with the element at the partition index
            // and increment the partition index.
            if (comparator.compare(list.get(j), pivot) < 0) {
                i++;
                swap(list, i, j);
            }
        }

        // Swap the pivot element with the element immediately following the partition index.
        swap(list, i + 1, right);

        // Return the partition index.
        return i + 1;
    }

    // This is a helper method that swaps two elements in the list.
    private static <T> void swap(List<T> list, int i, int j) {
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}

