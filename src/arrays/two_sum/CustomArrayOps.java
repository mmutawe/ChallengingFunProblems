package arrays.two_sum;

import java.util.List;

public interface CustomArrayOps<T> {
    List<T> getIndicesForSummationV1(int sum, int[] arr);

    List<T> getIndicesForSummationV2(int sum, int[] arr);

    List<T> getIndicesForSummationV3(int sum, int[] arr);
}
