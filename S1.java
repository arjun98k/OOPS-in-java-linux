class S1 {
    public static void main(String[] args) {
      int mat[][] = {
            {4,1,3},
            {3,5,7},
            {8,2,6}
      };
      int evencount = 0;
      int oddcount = 0;
      int row = mat.length;
      int col = mat[0].length;
      for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
            if (mat[i][j]%2 == 0) {
                evencount++;
            } else{
                oddcount++;
            }
        }
      }  System.out.println("number of even " + evencount);
      System.out.println("number of odd count " + oddcount);
    }
}