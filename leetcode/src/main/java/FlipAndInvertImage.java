import com.sun.org.apache.bcel.internal.generic.SWAP;

/**
 * @author zyh
 * @version V1.0
 * @ClassName: FlipAndInvertImage
 * @Description: TODO
 * @date 2021/2/24 下午7:40
 */

public class FlipAndInvertImage {
//    给定一个二进制矩阵 A，我们想先水平翻转图像，然后反转图像并返回结果。
//
//    水平翻转图片就是将图片的每一行都进行翻转，即逆序。例如，水平翻转 [1, 1, 0] 的结果是 [0, 1, 1]。
//
//    反转图片的意思是图片中的 0 全部被 1 替换， 1 全部被 0 替换。例如，反转 [0, 1, 1] 的结果是 [1, 0, 0]。



    public static void main(String[] args) {
        int[][] A = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        int[][] ints = flipAndInvertImage(A);
    }

    public static int[][] flipAndInvertImage(int[][] A) {
        int col= A[0].length;
        int row = A.length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= (col-1)/2; j++) {
                int tmp = A[i][j];
                A[i][j] = A[i][col-j-1];
                A[i][col-j-1] = tmp;
            }

        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (A[i][j] == 0) {
                    A[i][j] = 1;
                } else {
                    A[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(A[i][j]);
            }
            System.out.println();
        }
        return A;

    }

    public int[][] flipAndInvertImage2(int[][] A) {
        int row = A.length;
        for (int i = 0; i < row; i++) {
            int left = 0;
            int right = A[i].length -1;
            while(left < right) {
                if (A[i][left] == A[i][right]) {
                    A[i][left] ^= 1;
                    A[i][right] ^= 1;
                }
                left++;
                right--;
            }
            if (left == right) {
                A[i][left] ^= 1;
            }
        }
        return A;
    }

}
