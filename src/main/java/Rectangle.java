public class Rectangle {
    int length;
    int width;
    public Rectangle(int length,int width){
        this.length=length;
        this.width=width;
    }
    public int Area() {
        return length*width;
    }

    public int Perimeter() {
        return 2*(length+width);
    }
}
