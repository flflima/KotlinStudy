package academy.learnprogramming.java;

import com.sun.istack.internal.NotNull;

public class Car {

    public static int x = 5;

    private String color;
    private String model;
    private Integer year;

    public Car(String color, String model, Integer year) {
        this.color = color;
        this.model = model;
        this.year = year;
    }

    public static String xString() {
        return "This is x = " + x++;
    }

    public String getColor() {
        return color;
    }

    public void setColor(@NotNull String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void variableMethod(int num, String... strings) {
        for (String string: strings) {
            System.out.println(string);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
