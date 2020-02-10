package recursion;

/**
 * @author yeobi Created 2020-02-08
 * @description 재귀 - 이진 탐색. 연산 횟수 O(logn)
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 8, 15, 18, 25, 41};

        int first = 0;
        int last = arr.length - 1;
        System.out.println("target : 5, idx : " + binarySearch(first, last, arr, 5));
        System.out.println("target : 11, idx : " + binarySearch(first, last, arr, 11));
        System.out.println("target : 2, idx : " + binarySearch(first, last, arr, 2));
        System.out.println("target : 25, idx : " + binarySearch(first, last, arr, 25));
    }

    public static int binarySearch(int first, int last, int[] arr, int target) {
        if (first > last) { // 탐색 실패
            return -1;
        }

        int mid = (first + last) / 2;   // 중간값 구하기
        if (arr[mid] == target) {
            return mid; // 타겟과 일치하는 인덱스 밴환
        }

        if (target < arr[mid]) {
            last = mid - 1;
        } else {
            first = mid + 1;
        }

        return binarySearch(first, last, arr, target);
    }

}
