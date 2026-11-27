class Solution {
    int binarySearch(int[] arr, int l, int r, int x) {
        int mid = l + (r - l) / 2;
        if (r >= l) {
            if (arr[mid] == x) return mid;
            else if(arr[mid] > x) return binarySearch(arr, l, mid - 1, x);
            return binarySearch(arr, mid + 1, r, x);
        }
        return mid;
    }

    public int searchInsert(int[] nums, int target) {
        if (nums[nums.length - 1] < target) return nums.length;
        return binarySearch(nums, 0, nums.length, target);
    }
}