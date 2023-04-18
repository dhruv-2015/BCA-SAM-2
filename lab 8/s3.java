class Rectangle {
    int length; 
    int width;
    static int count;

    static {
        System.out.println("Rectangle staric block");
        count = 0;
    }
    {
        count++;
    }

    Rectangle() {

    }

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    
    Rectangle(Rectangle obj) {
        this.length = obj.length;
        this.width = obj.width;
    }

    public void area() {
        System.out.println("Area is: " + (length * width));
    }

    public void display() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }
}



class s3 {
    static {
        System.out.println("Main class static block");
    }

    public static void main(String[] args) {
        
        Rectangle x = new Rectangle(1, 2);
        Rectangle y = new Rectangle(x);
        y.display();
        y.area();
        
    }
}