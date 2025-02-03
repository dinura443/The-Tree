class TreeAssembler {
    private  int  rows = 40, cols = 80,   TreeX = 35, TreeY = 25;
private String[][] grid = new String[rows][cols];
//encapsulation

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

    TreeParts.drawCoreTrunk(grid, TreeX, TreeY);
    TreeParts.drawGroundTrunk(grid, TreeX, TreeY);
    TreeParts.drawGround(grid, rows, cols);
    TreeParts.drawTopTrunk(grid, TreeX, TreeY - 10);
    TreeParts.drawBranchBottomC(grid, TreeX, TreeY - 11);
    TreeParts.drawBranchBottomB(grid, TreeX, TreeY - 12);
    TreeParts.drawBranchBottomA(grid, TreeX, TreeY - 13);
    TreeParts.drawBranchMiddleC(grid, TreeX, TreeY - 14);
    TreeParts.drawBranchMiddleB(grid, TreeX, TreeY - 15);
    TreeParts.drawBranchMiddleA(grid, TreeX, TreeY - 16);
    TreeParts.drawBranchTopB(grid, TreeX, TreeY - 17);
    TreeParts.drawBranchTopA(grid, TreeX, TreeY - 18);


    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            System.out.print(grid[i][j]);
        }
        System.out.println();
    }
}
}