public class L1725 {

    public static void main(String... args) {
        int[][] arrs =
               {
                       {3, 12},
                       {3, 9},
                       {8, 5}
               };

        System.out.println(countGoodRectangles(arrs));
    }

    public static int countGoodRectangles(int[][] rectangles) {
        int maxLen = 0;
        int count = 0;

        for (int[] arr : rectangles) {
            int len;
            if (arr[0] != arr[1]) {
                len = Math.min(arr[0], arr[1]);
            } else {
                len = arr[0];
            }
            if (maxLen < len) maxLen = len;
        }

        for (int[] arr : rectangles) {
            if (arr[0] >= maxLen && arr[1] >= maxLen) {
                count++;
            }
        }

        return count;
    }
}