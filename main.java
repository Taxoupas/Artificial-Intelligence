
public class main {

	public static void main(String[] args) {
		
		Cube cb = new Cube();
		
		
		System.out.println(cb.Colours.get(1));
		System.out.println(cb.Colours.get(2));
		System.out.println(cb.Colours.get(3));
		System.out.println(cb.Colours.get(4));
		System.out.println(cb.Colours.get(5));
		System.out.println(cb.Colours.get(6));
		
		cb.print_cube();
		String direction = "up";
		cb.vertical_left(direction);
		System.out.println("\n");
		cb.print_cube();

	}

}


        
