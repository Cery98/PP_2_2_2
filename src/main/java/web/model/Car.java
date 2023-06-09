package web.model;

public class Car {

    private String model;
    private int series;
    private int age;

    private String blank = " "; // это для html пробел

    public Car(String model, int series, int age) {
        this.model = model;
        this.series = series;
        this.age = age;
    }

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBlank() {
        return blank;
    }

}

