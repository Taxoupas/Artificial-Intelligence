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
			int temp1, temp2, temp3, temp4, temp5, temp6, temp7, temp8;
			int temp9, temp10, temp11, temp12;
			if (direction == "Right") {
				temp1 = Cube[0][2][3];
				Cube[0][2][3] = Cube[0][0][3];
	
				temp2 = Cube[2][2][3];
				Cube[2][2][3] = temp1;
	
				temp3 = Cube[2][0][3];
				Cube[2][0][3] = temp2;
	
				Cube[0][0][3] = temp3;
	
				temp4 = Cube[0][1][3];
				Cube[0][1][3] = Cube[1][0][3];
	
				temp5 = Cube[1][2][3];
				Cube[1][2][3] = temp4;
	
				temp6 = Cube[2][1][3];
				Cube[2][1][3] = temp5;
	
				Cube[1][0][3] = temp6;
	
				temp1 = Cube[2][0][4];
				temp2 = Cube[2][1][4];
				temp3 = Cube[2][2][4];
	
				Cube[2][0][4] = Cube[2][0][0];
				Cube[2][1][4] = Cube[2][1][0];
				Cube[2][2][4] = Cube[2][2][0];
	
				temp4 = Cube[2][0][2];
				temp5 = Cube[2][1][2];
				temp6 = Cube[2][2][2];
	
				Cube[2][0][2] = temp1;
				Cube[2][1][2] = temp2;
				Cube[2][2][2] = temp3;
	
				temp7 = Cube[2][0][5];
				temp8 = Cube[2][1][5];
				temp9 = Cube[2][2][5];
	
				Cube[2][0][5] = temp4;
				Cube[2][1][5] = temp5;
				Cube[2][2][5] = temp6;
	
				Cube[2][0][0] = temp7;
				Cube[2][1][0] = temp8;
				Cube[2][2][0] = temp9;
	
			} else if (direction == "Left") {
				for (int i = 0; i < 3; i++) {
					temp1 = Cube[0][2][3];
					Cube[0][2][3] = Cube[0][0][3];
	
					temp2 = Cube[2][2][3];
					Cube[2][2][3] = temp1;
	
					temp3 = Cube[2][0][3];
					Cube[2][0][3] = temp2;
	
					Cube[0][0][3] = temp3;
	
					temp4 = Cube[0][1][3];
					Cube[0][1][3] = Cube[1][0][3];
	
					temp5 = Cube[1][2][3];
					Cube[1][2][3] = temp4;
	
					temp6 = Cube[2][1][3];
					Cube[2][1][3] = temp5;
	
					Cube[1][0][3] = temp6;
	
					temp1 = Cube[2][0][4];
					temp2 = Cube[2][1][4];
					temp3 = Cube[2][2][4];
	
					Cube[2][0][4] = Cube[2][0][0];
					Cube[2][1][4] = Cube[2][1][0];
					Cube[2][2][4] = Cube[2][2][0];
	
					temp4 = Cube[2][0][2];
					temp5 = Cube[2][1][2];
					temp6 = Cube[2][2][2];
	
					Cube[2][0][2] = temp1;
					Cube[2][1][2] = temp2;
					Cube[2][2][2] = temp3;
	
					temp7 = Cube[2][0][5];
					temp8 = Cube[2][1][5];
					temp9 = Cube[2][2][5];
	
					Cube[2][0][5] = temp4;
					Cube[2][1][5] = temp5;
					Cube[2][2][5] = temp6;
	
					Cube[2][0][0] = temp7;
					Cube[2][1][0] = temp8;
					Cube[2][2][0] = temp9;
				}
	
			}
		}
	
		public void horizontal_middle(String direction) {
			int temp1, temp2, temp3, temp4, temp5, temp6, temp7, temp8;
			int temp9, temp10, temp11, temp12;
	
			if (direction == "Left") {
				temp1 = Cube[1][0][0];
				temp2 = Cube[1][1][0];
				temp3 = Cube[1][2][0];
	
				temp4 = Cube[1][0][5];
				temp5 = Cube[1][1][5];
				temp6 = Cube[1][2][5];
	
				temp7 = Cube[1][0][2];
				temp8 = Cube[1][1][2];
				temp9 = Cube[1][2][2];
	
				temp10 = Cube[1][0][4];
				temp11 = Cube[1][1][4];
				temp12 = Cube[1][2][4];
	
				Cube[1][0][0] = temp10;
				Cube[1][1][0] = temp11;
				Cube[1][2][0] = temp12;
	
				Cube[1][0][5] = temp1;
				Cube[1][1][5] = temp2;
				Cube[1][2][5] = temp3;
	
				Cube[1][0][2] = temp4;
				Cube[1][1][2] = temp5;
				Cube[1][2][2] = temp6;
	
				Cube[1][0][4] = temp7;
				Cube[1][1][4] = temp8;
				Cube[1][2][4] = temp9;
	
			} else if (direction == "Right") {
				for (int i = 0; i < 3; i++) {
					temp1 = Cube[1][0][0];
					temp2 = Cube[1][1][0];
					temp3 = Cube[1][2][0];
	
					temp4 = Cube[1][0][5];
					temp5 = Cube[1][1][5];
					temp6 = Cube[1][2][5];
	
					temp7 = Cube[1][0][2];
					temp8 = Cube[1][1][2];
					temp9 = Cube[1][2][2];
	
					temp10 = Cube[1][0][4];
					temp11 = Cube[1][1][4];
					temp12 = Cube[1][2][4];
	
					Cube[1][0][0] = temp10;
					Cube[1][1][0] = temp11;
					Cube[1][2][0] = temp12;
	
					Cube[1][0][5] = temp1;
					Cube[1][1][5] = temp2;
					Cube[1][2][5] = temp3;
	
					Cube[1][0][2] = temp4;
					Cube[1][1][2] = temp5;
					Cube[1][2][2] = temp6;
	
					Cube[1][0][4] = temp7;
					Cube[1][1][4] = temp8;
					Cube[1][2][4] = temp9;
				}
			}
	
		}
	
		public void horizontal_top(String direction) {
			int temp1, temp2, temp3, temp4, temp5, temp6, temp7, temp8;
			int temp9, temp10, temp11, temp12;
			if (direction == "Left") {
	
				temp1 = Cube[0][2][1];
				Cube[0][2][1] = Cube[0][0][1];
	
				temp2 = Cube[2][2][1];
				Cube[2][2][1] = temp1;
	
				temp3 = Cube[2][0][1];
				Cube[2][0][1] = temp2;
	
				Cube[0][0][1] = temp3;
	
				temp4 = Cube[0][1][1];
				Cube[0][1][1] = Cube[1][0][1];
	
				temp5 = Cube[1][2][1];
				Cube[1][2][1] = temp4;
	
				temp6 = Cube[2][1][1];
				Cube[2][1][1] = temp5;
	
				Cube[1][0][1] = temp6;
	
				temp1 = Cube[0][0][0];
				temp2 = Cube[0][1][0];
				temp3 = Cube[0][2][0];
	
				temp4 = Cube[0][0][5];
				temp5 = Cube[0][1][5];
				temp6 = Cube[0][2][5];
	
				temp7 = Cube[0][0][2];
				temp8 = Cube[0][1][2];
				temp9 = Cube[0][2][2];
	
				temp10 = Cube[0][0][4];
				temp11 = Cube[0][1][4];
				temp12 = Cube[0][2][4];
	
				Cube[0][0][0] = temp10;
				Cube[0][1][0] = temp11;
				Cube[0][2][0] = temp12;
	
				Cube[0][0][5] = temp1;
				Cube[0][1][5] = temp2;
				Cube[0][2][5] = temp3;
	
				Cube[0][0][2] = temp4;
				Cube[0][1][2] = temp5;
				Cube[0][2][2] = temp6;
	
				Cube[0][0][4] = temp7;
				Cube[0][1][4] = temp8;
				Cube[0][2][4] = temp9;
	
			} else if (direction == "Right") {
				for (int i = 0; i < 3; i++) {
					temp1 = Cube[0][2][1];
					Cube[0][2][1] = Cube[0][0][1];
	
					temp2 = Cube[2][2][1];
					Cube[2][2][1] = temp1;
	
					temp3 = Cube[2][0][1];
					Cube[2][0][1] = temp2;
	
					Cube[0][0][1] = temp3;
	
					temp4 = Cube[0][1][1];
					Cube[0][1][1] = Cube[1][0][1];
	
					temp5 = Cube[1][2][1];
					Cube[1][2][1] = temp4;
	
					temp6 = Cube[2][1][1];
					Cube[2][1][1] = temp5;
	
					Cube[1][0][1] = temp6;
	
					temp1 = Cube[0][0][0];
					temp2 = Cube[0][1][0];
					temp3 = Cube[0][2][0];
	
					temp4 = Cube[0][0][5];
					temp5 = Cube[0][1][5];
					temp6 = Cube[0][2][5];
	
					temp7 = Cube[0][0][2];
					temp8 = Cube[0][1][2];
					temp9 = Cube[0][2][2];
	
					temp10 = Cube[0][0][4];
					temp11 = Cube[0][1][4];
					temp12 = Cube[0][2][4];
	
					Cube[0][0][0] = temp10;
					Cube[0][1][0] = temp11;
					Cube[0][2][0] = temp12;
	
					Cube[0][0][5] = temp1;
					Cube[0][1][5] = temp2;
					Cube[0][2][5] = temp3;
	
					Cube[0][0][2] = temp4;
					Cube[0][1][2] = temp5;
					Cube[0][2][2] = temp6;
	
					Cube[0][0][4] = temp7;
					Cube[0][1][4] = temp8;
					Cube[0][2][4] = temp9;
				}
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