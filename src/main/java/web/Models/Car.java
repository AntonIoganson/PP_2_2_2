package web.Models;

public class Car {
    private String nameBrand;
    private String model;
    private int year;

    public Car(String nameBrand, String model, int year) {
        this.nameBrand = nameBrand;
        this.model = model;
        this.year = year;
    }

    public String getNameBrand() {
        return nameBrand;
    }

    public void setNameBrand(String nameBrand) {
        this.nameBrand = nameBrand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
