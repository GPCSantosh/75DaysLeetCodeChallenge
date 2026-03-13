class Solution {
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
        long left = 0;
        long right = (long)1e18;
        while (left < right) {
            long mid = left + (right - left) / 2;
            long total = 0;
            for (int t : workerTimes) {
                long k = (long)((Math.sqrt(1 + (8.0 * mid) / t) - 1) / 2);
                total += k;
                if (total >= mountainHeight) break;
            }
            if (total >= mountainHeight) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}