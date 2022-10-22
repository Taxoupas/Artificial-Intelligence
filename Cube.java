public class Cube {

    private String Colours = {"Red","Green","Blue","Yellow","White","Black"};
    private int counters = {0,0,0,0,0,0};
    private String[][][] Cube = new String[3][3][6];

    public Cube() {
        for (int i=0; i<3; i++) {
            for (int j=0; j<3, j++) {
                for (int z=0; z<3, z++) {
                    
                }
            }
        }
    }

    public getColour(int x, int y, int z) {

        return Cube[x][y][z];
    }  // get the colour of a specific square in the cube

    public setColour(int x, int y, int z, String colour) {

        Cube[x][y][z] = colour;

    } // set the colour of a specific square in the cube


}