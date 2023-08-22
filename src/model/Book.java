package model;

public class Book {
    private String title;
    private String company;
    private String name;
    private int price;

    public Book(){

    }

    public Book(String title, String name, String company, int price){
        this.title = title;
        this.name = name;
        this.company = company;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
