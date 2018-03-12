package edu.ldsbc.assignment7;

import java.util.List;

public class InsertionSort extends Sorter {

    public InsertionSort() {
        super.setName("InsertionSort");
    }

    @Override
    public void sort(List<Integer> list) {
        int size = list.size();
        int sortedSize = 0;
        for (int i = 1; i < size - 1; i++) {
            int j = i;
            do {
                if (list.get(j) < list.get(j - 1)) {
                    int small = list.get(j);
                    int large = list.get(j - 1);
                    list.set(j - 1, small);
                    list.set(j, large);
                }
                j--;
            } while (j > sortedSize);

        }
    }

}

