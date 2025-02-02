public class Main {
    public static void main(String[] args) {
        Assembler Assemble = new Assembler();
        Assemble.Frame();
    }
}

class Assembler {
    int rows = 40, cols = 80;
    int TreeX = 35, TreeY = 25;
    private String[][] grid = new String[rows][cols];       //encapsulation

    void Frame() {

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 || i == rows - 1) {
                    grid[i][j] = "_";
                } else if (j == 0 || j == cols - 1) {
                    grid[i][j] = "|";
                } else {
                    grid[i][j] = " ";
                }
            }
        }

        Assets.drawCoreTrunk(grid, TreeX, TreeY);
        Assets.drawGroundTrunk(grid, TreeX, TreeY);
        Assets.drawGround(grid, rows, cols);
        Assets.drawTopTrunk(grid, TreeX, TreeY - 10);
        Assets.drawBranchBottomC(grid, TreeX, TreeY - 11);
        Assets.drawBranchBottomB(grid, TreeX, TreeY - 12);
        Assets.drawBranchBottomA(grid, TreeX, TreeY - 13);
        Assets.drawBranchMiddleC(grid, TreeX, TreeY - 14);
        Assets.drawBranchMiddleB(grid, TreeX, TreeY - 15);
        Assets.drawBranchMiddleA(grid, TreeX, TreeY - 16);
        Assets.drawBranchTopB(grid, TreeX, TreeY - 17);
        Assets.drawBranchTopA(grid, TreeX, TreeY - 18);


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }
}

class Assets extends Assembler{  //Inheritance and Abstraction


     static void drawBranchTopA(String[][] grid, int treeX, int treeY) {
        for (int j = treeX - 21; j <= treeX + 21; j++) {
            if (j == treeX - 10) {
                grid[treeY + 10][j] = "\\";
            } else if (j == treeX -5 ) {
                grid[treeY + 10][j] = "/";
            } else if (j == treeX - 2  ) {
                grid[treeY + 10][j] = "\\";
            } else if (j == treeX +3 ) {
                grid[treeY + 10][j] = "/";
            } else if (j == treeX +15) {
                grid[treeY + 10][j] = "/";
            } else if (j == treeX +11) {
                grid[treeY + 10][j] = "\\";
            }else if (j == treeX +5 ) {
                grid[treeY + 10][j] = "\\";
            }else if (j == treeX +8 ) {
                grid[treeY + 10][j] = "/";
            }else if (j == treeX - 6) {
                grid[treeY + 10][j] = "/";
            } else if (j == treeX -9 ) {
                grid[treeY + 10][j] = "\\";
            } else if (j == treeX -1  ) {
                grid[treeY + 10][j] = "\\";
            } else if (j == treeX +2 ) {
                grid[treeY + 10][j] = "/";
            } else if (j == treeX +16) {
                grid[treeY + 10][j] = "/";
            } else if (j == treeX +4) {
                grid[treeY + 10][j] = "\\";
            }else if (j == treeX +7 ) {
                grid[treeY + 10][j] = "/";
            }else if (j == treeX +12 ) {
                grid[treeY + 10][j] = "\\";
            } else {
                grid[treeY + 10][j] = " ";
            }
        }

    }

    static void drawBranchTopB(String[][] grid, int treeX, int treeY) {
        for (int j = treeX - 15; j <= treeX + 15; j++) {
            if (j == treeX - 8) {
                grid[treeY + 10][j] = "\\";
            } else if (j == treeX -7 ) {
                grid[treeY + 10][j] = "/";
            } else if (j == treeX  ) {
                grid[treeY + 10][j] = "\\";
            } else if (j == treeX +1 ) {
                grid[treeY + 10][j] = "/";
            } else if (j == treeX +14) {
                grid[treeY + 10][j] = "/";
            } else if (j == treeX +13) {
                grid[treeY + 10][j] = "\\";
            }else if (j == treeX +5 ) {
                grid[treeY + 10][j] = "\\";
            }else if (j == treeX +6 ) {
                grid[treeY + 10][j] = "/";
            }else if (j == treeX - 6) {
                grid[treeY + 10][j] = "/";
            } else if (j == treeX -9 ) {
                grid[treeY + 10][j] = "\\";
            } else if (j == treeX -1  ) {
                grid[treeY + 10][j] = "\\";
            } else if (j == treeX +2 ) {
                grid[treeY + 10][j] = "/";
            } else if (j == treeX +15) {
                grid[treeY + 10][j] = "/";
            } else if (j == treeX +4) {
                grid[treeY + 10][j] = "\\";
            }else if (j == treeX +7 ) {
                grid[treeY + 10][j] = "/";
            }else if (j == treeX +12 ) {
                grid[treeY + 10][j] = "\\";
            } else {
                grid[treeY + 10][j] = " ";
            }
        }

    }

    static void drawBranchMiddleA(String[][] grid, int treeX, int treeY) {
        for (int j = treeX - 15; j <= treeX + 15; j++) {
            if (j == treeX - 8) {
                grid[treeY + 10][j] = "\\";
            } else if (j == treeX -6 ) {
                grid[treeY + 10][j] = "\\";
            } else if (j == treeX - 1 ) {
                grid[treeY + 10][j] = "/";
            } else if (j == treeX +1 ) {
                grid[treeY + 10][j] = "/";
            } else if (j == treeX +14) {
                grid[treeY + 10][j] = "/";
            } else if (j == treeX +12) {
                grid[treeY + 10][j] = "/";
            }else if (j == treeX +5 ) {
                grid[treeY + 10][j] = "\\";
            }else if (j == treeX +7 ) {
                grid[treeY + 10][j] = "\\";
            } else {
                grid[treeY + 10][j] = " ";
            }
        }

    }

    static void drawBranchMiddleB(String[][] grid, int treeX, int treeY) {
        for (int j = treeX - 15; j <= treeX + 15; j++) {
            if (j == treeX - 7) {
                grid[treeY + 10][j] = "\\";
            } else if (j == treeX -5 ) {
                grid[treeY + 10][j] = "\\";
            } else if (j == treeX - 2 ) {
                grid[treeY + 10][j] = "/";
            } else if (j == treeX ) {
                grid[treeY + 10][j] = "/";
            } else if (j == treeX +13) {
                grid[treeY + 10][j] = "/";
            } else if (j == treeX +11) {
                grid[treeY + 10][j] = "/";
            }else if (j == treeX +6 ) {
                grid[treeY + 10][j] = "\\";
            }else if (j == treeX +8 ) {
                grid[treeY + 10][j] = "\\";
            } else {
                grid[treeY + 10][j] = " ";
            }
        }

    }

    static void drawBranchMiddleC(String[][] grid, int treeX, int treeY) {
        for (int j = treeX - 15; j <= treeX + 15; j++) {
            if (j == treeX - 6) {
                grid[treeY + 10][j] = "\\";
            } else if (j == treeX -4 ) {
                grid[treeY + 10][j] = "\\";
            } else if (j == treeX - 3 ) {
                grid[treeY + 10][j] = "/";
            } else if (j == treeX -1) {
                grid[treeY + 10][j] = "/";
            } else if (j == treeX +12) {
                grid[treeY + 10][j] = "/";
            } else if (j == treeX +10) {
                grid[treeY + 10][j] = "/";
            }else if (j == treeX +7 ) {
                grid[treeY + 10][j] = "\\";
            }else if (j == treeX +9 ) {
                grid[treeY + 10][j] = "\\";
            } else {
                grid[treeY + 10][j] = " ";
            }
        }

    }


    static void drawBranchBottomA(String[][] grid, int treeX, int treeY) {
        for (int j = treeX - 11; j <= treeX + 11; j++) {
            if (j == treeX - 4) {
                grid[treeY + 10][j] = "\\";
            } else if (j == treeX -1 ) {
                grid[treeY + 10][j] = "\\";
            } else if (j == treeX + 10) {
                grid[treeY + 10][j] = "/";
            } else if (j == treeX + 7) {
                grid[treeY + 10][j] = "/";
            } else {
                grid[treeY + 10][j] = " ";
            }
        }
    }
    static void drawBranchBottomB(String[][] grid, int treeX, int treeY) {
        for (int j = treeX - 11; j <= treeX + 11; j++) {
            if (j == treeX - 3) {
                grid[treeY + 10][j] = "\\";
            } else if (j == treeX ) {
                grid[treeY + 10][j] = "\\";
            } else if (j == treeX + 9) {
                grid[treeY + 10][j] = "/";
            } else if (j == treeX + 6) {
                grid[treeY + 10][j] = "/";
            } else {
                grid[treeY + 10][j] = " ";
            }
        }
    }
    static void drawBranchBottomC(String[][] grid, int treeX, int treeY) {
        for (int j = treeX - 11; j <= treeX + 11; j++) {
            if (j == treeX - 2) {
                grid[treeY + 10][j] = "\\";
            } else if (j == treeX + 1) {
                grid[treeY + 10][j] = "\\";
            } else if (j == treeX + 8) {
                grid[treeY + 10][j] = "/";
            } else if (j == treeX + 5) {
                grid[treeY + 10][j] = "/";
            } else {
                grid[treeY + 10][j] = " ";
            }
        }
    }

    static void drawTopTrunk(String[][] grid, int treeX, int treeY) {
        for (int j = treeX - 14; j <= treeX + 15; j++) {
            if (j == treeX - 1) {
                grid[treeY + 10][j] = "\\";
            } else if (j == treeX + 2) {
                grid[treeY + 10][j] = "\\";
            } else if (j == treeX + 7) {
                grid[treeY + 10][j] = "/";
            } else if (j == treeX + 4) {
                grid[treeY + 10][j] = "/";
            } else {
                grid[treeY + 10][j] = " ";
            }
        }
    }

    static void drawCoreTrunk(String[][] grid, int treeX, int treeY) {
        for (int i = treeY; i < treeY + 10; i++) {
            for (int j = treeX; j < treeX + 7; j++) {
                if (j == treeX || j == treeX + 6) {
                    grid[i][j] = "|";
                }
            }
        }
    }

    static void drawGroundTrunk(String[][] grid, int treeX, int treeY) {
        for (int j = treeX - 10; j <= treeX + 7; j++) {
            if (j == treeX - 1) {
                grid[treeY + 10][j] = "/";
            } else if (j == treeX + 7) {
                grid[treeY + 10][j] = "\\";
            } else {
                grid[treeY + 10][j] = " ";
            }
        }
    }

    static void drawGround(String[][] grid, int rows, int cols) {
        int groundRow = rows - 4;
        for (int i = 10; i < cols - 10; i++) {
            grid[groundRow][i] = "-";
        }
    }
}
