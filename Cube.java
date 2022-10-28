import java.util.HashMap;
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

        public void print_cube() {
            System.out.print("     ");
            System.out.print("Side A");
            System.out.print("    ");
            System.out.print("Side B");
            System.out.print("    ");
            System.out.print("Side C");
            for (int x=0; x<3; x++) {
                System.out.println("");
                for (int z=0; z<3; z++) {
                    System.out.print("     ");
                    for (int y=0; y<3; y++) {
                        if (y==0) { System.out.print("[");}
                        
                        System.out.print(Cube[x][y][z]);

                        if (y==2) { System.out.print("]");}
                    }
                }
            }

            System.out.println("");
            System.out.println("");
            System.out.println("");
            
            System.out.print("     ");
            System.out.print("Side D");
            System.out.print("     ");
            System.out.print("Side E");
            System.out.print("    ");
            System.out.print("Side F");
            for (int y=0; y<3; y++) {
                System.out.println("");
                for (int z=3; z<6; z++) {
                    System.out.print("     ");
                    for (int x=0; x<3; x++) {
                        if (x==0) { System.out.print("[");}
                        
                        System.out.print(Cube[x][y][z]);

                        if (x==2) { System.out.print("] ");}
                    }
                }
            }

            
            

        } // print the cube on the terminal


        public boolean check_side(int side) {
            int temp = Cube[1][1][side];
            for (int x=0; x<3; x++) {
                for (int y=0; y<3; y++) {
                    if (temp != Cube[x][y][side]) {
                        return false; // side doesnt have the same colour
                    }
                }
            }

            return true; // side has the same colour
        }

        //-------------------Moves-------------------//
        
        int temp[][] = new int[3][4]; // [x][z]
		
        public void vertical_left(String direction) {
        	
        	for (int z=0; z<=3; z++){
        		for(int x=0; x<=2; x++) {
        			temp[x][z] = Cube[x][0][z];
        		}
			}

			if (direction == "up"){
				
				for(int k=0; k<=3; k++) { // z
					for(int l=0; l<=2; l++) { // x
						if(k==0) {
							Cube[l][0][k] = temp[l][3];
						}else {
							Cube[l][0][k] = temp[l][k-1];
						}
					}
				}
			
			}else if(direction == "down"){

			}
		}

        public void vertical_middle(String direction) {
        	
        	for (int z=0; z<=3; z++){
        		for(int x=0; x<=2; x++) {
        			temp[x][z] = Cube[x][1][z];
        		}
			}
				
        	if (direction == "up"){
					
        		for(int k=0; k<=3; k++) { // z
					for(int l=0; l<=2; l++) { // x
						if(k==0) {
							Cube[l][1][k] = temp[l][3];
						}else {
							Cube[l][1][k] = temp[l][k-1];
						}
					}
				}	

				
			}else if(direction == "down"){

			}
		}

        public void vertical_right(String direction) {
        	
        	for (int z=0; z<=3; z++){
        		for(int x=0; x<=2; x++) {
        			temp[x][z] = Cube[x][2][z];
        		}
			}
        	
			if (direction == "up"){
				
				for(int k=0; k<=3; k++) { // z
					for(int l=0; l<=2; l++) { // x
						if(k==0) {
							Cube[l][2][k] = temp[l][3];
						}else {
							Cube[l][2][k] = temp[l][k-1];
						}
					}
				}
			
			}else if(direction == "down"){

			}
			
		}



        public void horizontal_bottom(String direction) {

			if (direction == "right"){

			}else if(direction == "left"){

			}
			
		}

        public void horizontal_middle(String direction) {

			if (direction == "right"){

			}else if(direction == "left"){

			}

		}

        public void horizontal_top(String direction) {

			if (direction == "right"){

			}else if(direction == "left"){

			}

		}



        public void behind_behind(String direction) {

			if (direction == "right"){

			}else if(direction == "left"){

			}

		}

        public void behind_middle(String direction) {

			if (direction == "right"){

			}else if(direction == "left"){

			}

		}

        public void behind_front(String direction) {

			if (direction == "right"){

			}else if(direction == "left"){

			}

		}



	}