// creates a 3D array of 9 3x3 arrays as the puzzle

// creates the first box of 9 unique numbers using the create method that the rest of
// the code will depend on

// uses vertical and horizontal shifts of the numbers in the first box throughout the
// code/puzzle to ensure that each number appears only once in each row and column

// prints the 3D array going by rows of each 2D array

class Main {
  public static void main(String[] args) {
    int[][][] puzzle = new int[9][3][3];
    puzzle[0] = create();
    puzzle[1][0] = puzzle[0][2];
    puzzle[1][1] = puzzle[0][0];
    puzzle[1][2] = puzzle[0][1];
    puzzle[2][0] = puzzle[0][1];
    puzzle[2][1] = puzzle[0][2];
    puzzle[2][2] = puzzle[0][0];
    puzzle[3][0][0] = puzzle[0][0][1];
    puzzle[3][0][1] = puzzle[0][0][2];
    puzzle[3][0][2] = puzzle[0][0][0];
    puzzle[3][1][0] = puzzle[0][1][1];
    puzzle[3][1][1] = puzzle[0][1][2];
    puzzle[3][1][2] = puzzle[0][1][0];
    puzzle[3][2][0] = puzzle[0][2][1];
    puzzle[3][2][1] = puzzle[0][2][2];
    puzzle[3][2][2] = puzzle[0][2][0];
    puzzle[4][0] = puzzle[3][1];
    puzzle[4][1] = puzzle[3][2];
    puzzle[4][2] = puzzle[3][0];
    puzzle[5][0] = puzzle[3][2];
    puzzle[5][1] = puzzle[3][0];
    puzzle[5][2] = puzzle[3][1];
    puzzle[6][0][0] = puzzle[3][0][1];
    puzzle[6][0][1] = puzzle[3][0][2];
    puzzle[6][0][2] = puzzle[3][0][0];
    puzzle[6][1][0] = puzzle[3][1][1];
    puzzle[6][1][1] = puzzle[3][1][2];
    puzzle[6][1][2] = puzzle[3][1][0];
    puzzle[6][2][0] = puzzle[3][2][1];
    puzzle[6][2][1] = puzzle[3][2][2];
    puzzle[6][2][2] = puzzle[3][2][0];
    puzzle[7][0] = puzzle[6][1];
    puzzle[7][1] = puzzle[6][2];
    puzzle[7][2] = puzzle[6][0];
    puzzle[8][0] = puzzle[6][2];
    puzzle[8][1] = puzzle[6][0];
    puzzle[8][2] = puzzle[6][1];
    for (int i = 0; i < 3; i++){
      System.out.print(puzzle[0][0][i] + " ");
    }
    System.out.print("| ");
    for (int i = 0; i < 3; i++){
      System.out.print(puzzle[1][0][i] + " ");
    }
    System.out.print("| ");
    for (int i = 0; i < 3; i++){
      System.out.print(puzzle[2][0][i] + " ");
    }
    System.out.println();
    for (int i = 0; i < 3; i++){
      System.out.print(puzzle[0][1][i] + " ");
    }
    System.out.print("| ");
    for (int i = 0; i < 3; i++){
      System.out.print(puzzle[1][1][i] + " ");
    }
    System.out.print("| ");
    for (int i = 0; i < 3; i++){
      System.out.print(puzzle[2][1][i] + " ");
    }
    System.out.println();
    for (int i = 0; i < 3; i++){
      System.out.print(puzzle[0][2][i] + " ");
    }
    System.out.print("| ");
    for (int i = 0; i < 3; i++){
      System.out.print(puzzle[1][2][i] + " ");
    }
    System.out.print("| ");
    for (int i = 0; i < 3; i++){
      System.out.print(puzzle[2][2][i] + " ");
    }
    System.out.println();
    System.out.println("------+-------+------");

    for (int i = 0; i < 3; i++){
      System.out.print(puzzle[3][0][i] + " ");
    }
    System.out.print("| ");
    for (int i = 0; i < 3; i++){
      System.out.print(puzzle[4][0][i] + " ");
    }
    System.out.print("| ");
    for (int i = 0; i < 3; i++){
      System.out.print(puzzle[5][0][i] + " ");
    }
    System.out.println();
    for (int i = 0; i < 3; i++){
      System.out.print(puzzle[3][1][i] + " ");
    }
    System.out.print("| ");
    for (int i = 0; i < 3; i++){
      System.out.print(puzzle[4][1][i] + " ");
    }
    System.out.print("| ");
    for (int i = 0; i < 3; i++){
      System.out.print(puzzle[5][1][i] + " ");
    }
    System.out.println();
    for (int i = 0; i < 3; i++){
      System.out.print(puzzle[3][2][i] + " ");
    }
    System.out.print("| ");
    for (int i = 0; i < 3; i++){
      System.out.print(puzzle[4][2][i] + " ");
    }
    System.out.print("| ");
    for (int i = 0; i < 3; i++){
      System.out.print(puzzle[5][2][i] + " ");
    }
    System.out.println();
    System.out.println("------+-------+------");

    for (int i = 0; i < 3; i++){
      System.out.print(puzzle[6][0][i] + " ");
    }
    System.out.print("| ");
    for (int i = 0; i < 3; i++){
      System.out.print(puzzle[7][0][i] + " ");
    }
    System.out.print("| ");
    for (int i = 0; i < 3; i++){
      System.out.print(puzzle[8][0][i] + " ");
    }
    System.out.println();
    for (int i = 0; i < 3; i++){
      System.out.print(puzzle[6][1][i] + " ");
    }
    System.out.print("| ");
    for (int i = 0; i < 3; i++){
      System.out.print(puzzle[7][1][i] + " ");
    }
    System.out.print("| ");
    for (int i = 0; i < 3; i++){
      System.out.print(puzzle[8][1][i] + " ");
    }
    System.out.println();
    for (int i = 0; i < 3; i++){
      System.out.print(puzzle[6][2][i] + " ");
    }
    System.out.print("| ");
    for (int i = 0; i < 3; i++){
      System.out.print(puzzle[7][2][i] + " ");
    }
    System.out.print("| ");
    for (int i = 0; i < 3; i++){
      System.out.print(puzzle[8][2][i] + " ");
    }
  }
  
  // the create method creates a bank of numbers 1 through 9 and randomly inserts those
  // numbers into a 3x3 array
  
  // once a number is used up, it is set to 0 so it cannot be reused
  
  public static int[][] create(){
    int[][] box = new int[3][3];
    int[] nums = new int[9];
    for (int i = 1; i < 10; i++){
      nums[i-1] = i;
    }
    for (int i = 0; i < box.length; i++){
      for (int j = 0; j < box[0].length; j++){
        int num = (int)(Math.random() * 9);
        while (nums[num] == 0){
          num = (int)(Math.random() * 9);
        }
        box[i][j] = nums[num];
        nums[num] = 0;
      }
    }
    return box;
  }
}
