public class Cube {

    private Colours = {"Red","Green","Blue","Yellow","White","Black"};
    private counters = {0,0,0,0,0,0};
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
    }  

    public setColour(int x, int y, int z, String colour) {

        Cube[x][y][z] = colour;

    }


}