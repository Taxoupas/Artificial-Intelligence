import java.util.HashMap;
import java.util.Random;

public class Cube {

	    HashMap<Integer, Integer> Colours = new HashMap<Integer, Integer>();
	    
	    


	    private int[][][] Cube = new int[3][3][6];
	    Random rand = new Random();
	    int r;

	    public Cube() {
	    	Colours.put(1,0); // 1 = red
	    	Colours.put(2,0); // 2 = white
	    	Colours.put(3,0); // 3 = blue
	    	Colours.put(4,0); // 4 = yellow
	    	Colours.put(5,0); // 5 = orange
	    	Colours.put(6,0); // 6 = green
	        for (int i=0; i<3; i++) {
	            for (int j=0; j<3; j++) {
	                for (int k=0; k<6; k++) {
	                	r = rand.nextInt(6)+1;
	                	while(Colours.get(r) == 9) {
	                	 r = rand.nextInt(6)+1;
	                	}
	                	Cube[i][j][k] = r;
	                	Colours.replace(r, Colours.get(r), Colours.get(r)+1);
	                	System.out.println("Colour: "+r+"Value: "+Colours.get(r));
	                }
	                
	            }
	        }
	    }

	    public int GetColour(int x, int y, int z) {

	        return Cube[x][y][z];
	    }  // get the colour of a specific square in the cube

	    public void SetColour(int x, int y, int z, int colour) {

	        Cube[x][y][z] = colour;

	    } // set the colour of a specific square in the cube


	}