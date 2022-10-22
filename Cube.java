public class Cube {

    private String[][][] Cube = new String[3][3][6];

    public getColour(int x, int y, int z) {

        return Cube[x][y][z];
    }  

    public setColor(int x, int y, int z, String colour) {

        Cube[x][y][z] = colour;

    }

}