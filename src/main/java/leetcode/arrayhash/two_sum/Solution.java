package leetcode.arrayhash.two_sum;

/*
 * 1. Two Sum (Easy)
 * https://leetcode.com/problems/two-sum/
 * 유형: 배열·해시
 *
 * 핵심 관찰: j를 i+1부터 시작하면 같은 원소 재사용 및 중복 쌍 확인 방지 가능
 * 접근: (1) brute force - n * n 경우의 수를 차례대로 모두 고려하기 (2) 이진 방법으로 #1번 방법보다 효율적으로 탐색하기
 * -> 이 중에서 첫 구상대로 brute force 방법 택함
 * 복잡도: 시간 O(n²), 공간 O(2)
 * 처음 시도: 2024-04-26
 * 2026년 첫 시도: 2026-10-19
 * 개선점: 배열/해시 유형으로 분류된 이유 간과 - 시간복잡도 O(n)으로 줄이는 방법을 적용하지 않은 것
 * 그리고 굳이 새로운 변수를 할당할 필요가 없는데 처음에 반환용 int[2] 변수를 설정한 것
 * 다시 풀기: 2026-10-22 (성공 / 실패)
 * 설명 키워드:
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i=0;i<nums.length;i++) {
            for (int j=i+1;j<nums.length;j++) {
                if (nums[i]+nums[j]==target) {
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
