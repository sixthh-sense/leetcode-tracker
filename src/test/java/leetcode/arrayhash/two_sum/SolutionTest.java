package leetcode.arrayhash.two_sum;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    private final Solution solution = new Solution();

    // 답의 순서는 상관없으므로 정렬해서 비교
    private int[] sorted(int[] arr) {
        int[] copy = arr.clone();
        Arrays.sort(copy);
        return copy;
    }

    @Test
    void 기본_예시() {
        assertArrayEquals(new int[]{0, 1}, sorted(solution.twoSum(new int[]{2, 7, 11, 15}, 9)));
    }

    @Test
    void 답이_배열_뒤쪽에_있는_경우() {
        assertArrayEquals(new int[]{1, 2}, sorted(solution.twoSum(new int[]{3, 2, 4}, 6)));
    }

    @Test
    void 같은_값이_두_번_나오는_경우() {
        assertArrayEquals(new int[]{0, 1}, sorted(solution.twoSum(new int[]{3, 3}, 6)));
    }

    @Test
    void 음수가_섞인_경우() {
        assertArrayEquals(new int[]{0, 2}, sorted(solution.twoSum(new int[]{-3, 4, 3, 90}, 0)));
    }
}
