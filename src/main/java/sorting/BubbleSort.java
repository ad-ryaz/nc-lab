package sorting;

import contract.Contract;
import contractRepository.ContractRepository;

import java.util.Arrays;
import java.util.Comparator;

public class BubbleSort implements ISorter{
    @Override
    public <T extends Contract> void sort(T[] contracts, Comparator<T> comparator) {
        for (int i = contracts.length; i >= 2; i--){
            for (int j = 0; j < i - 1; j++) {
                if (comparator.compare(contracts[j], contracts[j+1]) > 0) {
                    swapElements(contracts, j, j + 1);
                }
            }
        }
    }
}
