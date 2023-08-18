package test0817;

public class NoRectangle {
    public static void main(String[] args) {
        int[][] a = new int[3][];
       // 2차원 비정방 행렬 만드는 방법
        a[1] = new int[1];
        a[0] = new int[3];
        a[2] = new int[3];

        for(int i =0; i<a.length;i++){
            for(int j = 0; j<1;j++){
                System.out.print(a[i][j]);
            }
        }
    }
}
