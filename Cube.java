import java.util.HashMap;

public class Cube {

    private HashMap<String, Integer> Colours = new HashMap<String, Integer>();
    Colours.put("Red",0);
    Colours.put("White",0);
    Colours.put("Blue",0);
    Colours.put("Yellow",0);
    Colours.put("Orange",0);
    Colours.put("Green",0);


    private String[][][] Cube = new String[3][3][6];

    public Cube() {
        for (int i=0; i<3; i++) {
            for (int j=0; j<3, j++) {
                for (int z=0; z<3, z++) {
                    
                }
            }
        }
    }

    public String GetColour(int x, int y, int z) {

        return Cube[x][y][z];
    }  // get the colour of a specific square in the cube

    public void SetColour(int x, int y, int z, String colour) {

        Cube[x][y][z] = colour;

    } // set the colour of a specific square in the cube


}