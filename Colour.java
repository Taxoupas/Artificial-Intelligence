public class Colour{

    private String  colour;
    private int counter;


    public void Colour(String colour){
        this.colour = colour;
        counter = 0 ;
    }

    public void SetColour(String colour){
        this.colour = colour;
    }

    public String GetColour(String colour){
        return this.colour;
    }

}