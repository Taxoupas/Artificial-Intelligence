public class Cube {

    private String[][][] Cube = new String[3][3][6];

    public Cube() {
        for (int i=0; i<3; i++) {
            for (int j=0; j<3, j++) {
                for (int z=0; z<3, z++) {
                    Cube[i][j][z] = "NoColour";
                }
            }
        }
    }

    public getColour(int x, int y, int z) {

        return Cube[x][y][z];
    }  

    public setColor(int x, int y, int z, String colour) {

        Cube[x][y][z] = colour;

    }

    public FillColours() {
        //to do
    }

}