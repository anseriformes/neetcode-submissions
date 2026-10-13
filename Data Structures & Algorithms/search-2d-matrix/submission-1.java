class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean result = false;

        int row = findRow(matrix, target);

        if (row != -1) {
            result = checkRow(matrix[row], target);
        }

        return result;
    }

    private int findRow(int[][] matrix, int target) {
        int result = -1;

        int min = 0;
        int max = matrix.length - 1;
        int mid, valL, valR;

        while (max >= min && result == -1) {
            mid = ((max - min) / 2) + min;

            valL = matrix[mid][0];
            valR = matrix[mid][matrix[mid].length - 1];

            if (target >= valL && target <= valR) {
                result = mid;
            } else if (target < valL) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }

        return result;
    }

    private boolean checkRow(int[] matrix, int target) {
        boolean result = false;

        int min = 0;
        int max = matrix.length - 1;
        int mid, valM;

        while (max >= min && !result) {
            mid = ((max - min) / 2) + min;

            valM = matrix[mid];

            if (target == valM) {
                result = true;
            } else if (target < valM) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }

        return result;
    }
}
