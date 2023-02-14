public class Cat extends Animal{
    private String color;

    public Cat(double speed, String color) {
        super(speed);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "speed='" + getSpeed() + '\'' +
                "color='" + color + '\'' +
                '}';
    }
}
