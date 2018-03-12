package edu.ldsbc.assignment7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SortComparer {
    private List<Integer> number = new ArrayList();
    private List<Sorter> algorithms = new ArrayList();

    void compareSorters(int sizeList) {

        for (Sorter sorter : algorithms) {
            //random
            createRandomList(sizeList);
            executeSort(sorter, "random");
            //ascending
            createAscendingList(sizeList);
            executeSort(sorter, "Ascending");
            //descending
            createDescendingList(sizeList);
            executeSort(sorter, "Descending");
        }
    }

    private void executeSort(Sorter sorter, String dataType) {
        long startTime = System.nanoTime();
        sorter.sort(this.number);
        System.out.println(sorter.getName() + " " + dataType + " " + (System.nanoTime() - startTime));//todo print in seconds
    }

    void createRandomList(int size) {
        number.clear();
        Random rand = new Random();
        int i = 0;
        while (i < size) {
            number.add(rand.nextInt(size) + 1);
            i++;
        }
    }

    void createAscendingList(int size) {
        number.clear();
        int i = 0;
        while (i < size) {
            number.add(i);
            i++;
        }
    }

    void createDescendingList(int size) {
        number.clear();
        int i = size;
        while (i > 0) {
            number.add(i);
            i--;
        }
    }

    public void addAlgorithm(Sorter algorithm) {
        algorithms.add(algorithm);
    }

    List<Integer> getNumber() {
        return number;
    }

    public List<Sorter> getAlgorithms() {
        return algorithms;
    }

}
