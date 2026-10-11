static void printSpiral(int[][] a) {
    int n = a.length;

    int top = 0;
    int bottom = n - 1;
    int left = 0;
    int right = n - 1;

    while (top < bottom && left < right) {
        for (int j = left; j <= right; j++)
            System.out.print(a[top][j] + " ");

        for (int i = top + 1; i <= bottom; i++)
            System.out.print(a[i][right] + " ");

        for (int j = right - 1; j >= left; j--)
            System.out.print(a[bottom][j] + " ");

        for (int i = bottom - 1; i > top; i--)
            System.out.print(a[i][left] + " ");

        top++; bottom--;
        left++; right--;
    }
    System.out.print(a[n / 2][n / 2]);
}

void main() {
    int n = 5;
    int[][] a = {
            {1, 2, 3, 4, 5},
            {16, 17, 18, 19, 6},
            {15, 24, 25, 20, 7},
            {14, 23, 22, 21, 8},
            {13, 12, 11, 10, 9}
    };

    printSpiral(a);
}
