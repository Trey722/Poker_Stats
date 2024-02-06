


class Card
{
    private int color; 
    private int value; 

    public Card(int color, int value)
    {
        this.color = color; 
        this.value = value; 
    }


    public int getColor()
    {
        return color; 
    }

    public void setColor(int i_color)
    {
        this.color = i_color;
    }

    public int getValue()
    {
        return value; 
    }

    public void setValue(int i_value)
    {
        this.value = i_value; 
    }

    public void printCard()
    {
        System.out.println("This has color " + color + " "+  "and value " + value); 

    }
}