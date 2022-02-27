package algorithm;

class MergeSort<T extends Comparable<? super T>> {

    void mergeSort(T[] arr, int l, int r) {
        if (l >= r) {
            return;
        }
        int m = (l + r) / 2;
        mergeSort(arr, l, m);
        mergeSort(arr, m + 1, r);
        merge(arr, l, m, r);
    }

    void merge(T[] arr, int l, int m, int r) {
        T[] leftArr = (T[]) new Comparable[m - l + 1];
        T[] rightArr = (T[]) new Comparable[r - m];
        for (int i = 0; i < leftArr.length; ++i) {
            leftArr[i] = arr[l + i];
        }
        for (int i = 0; i < rightArr.length; ++i) {
            rightArr[i] = arr[m + 1 + i];
        }
        int leftIndex = 0, rightIndex = 0;
        int currentIndex = l;
        while (leftIndex < leftArr.length && rightIndex < rightArr.length) {
            if (leftArr[leftIndex].compareTo(rightArr[rightIndex]) <= 0) {
                arr[currentIndex] = leftArr[leftIndex];
                leftIndex++;
            } else {
                arr[currentIndex] = rightArr[rightIndex];
                rightIndex++;
            }
            currentIndex++;
        }
        while (leftIndex < leftArr.length) arr[currentIndex++] = leftArr[leftIndex++];
        while (rightIndex < rightArr.length) arr[currentIndex++] = rightArr[rightIndex++];
    }
}