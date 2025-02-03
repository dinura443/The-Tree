class TreeParts  {

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
            }
        }
    }

    static void drawTopTrunk(String[][] grid, int treeX, int treeY) {
        for (int j = treeX - 4; j <= treeX + 15; j++) {
            if (j == treeX - 1) {
                grid[treeY + 10][j] = "\\";
            } else if (j == treeX + 2) {
                grid[treeY + 10][j] = "\\";
            } else if (j == treeX + 7) {
                grid[treeY + 10][j] = "/";
            } else if (j == treeX + 4) {
                grid[treeY + 10][j] = "/";
            }
        }
    }
    static void drawCoreTrunk(String[][] grid, int treeX, int treeY) {
        for (int i = treeY; i < treeY + 10; i++) {
            for (int j = treeX; j < treeX + 7; j++) {
                if (j == treeX || j == treeX + 6) {
                    grid[i][j] = "|";
                } else if (j == treeX + 1 || j == treeX + 5) {
                    grid[i][j] = (i == 0) ? "/" : "\\";
                } else if (j == treeX + 2 || j == treeX + 4) {
                    grid[i][j] = (i == 0) ? "\\" : "/";
                } else {
                    grid[i][j] = "|";
                }
            }
        }
    }



    static void drawGroundTrunk(String[][] grid, int treeX, int treeY) {
        for (int j = treeX - 1; j <= treeX + 7; j++) {
            if (j == treeX - 1) {
                grid[treeY + 10][j] = "/";
            } else if (j == treeX + 7) {
                grid[treeY + 10][j] = "\\";
            } else {
                grid[treeY + 10][j] = "|";
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