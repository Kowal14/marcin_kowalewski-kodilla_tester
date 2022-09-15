public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 110) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price > 110 && this.price < 310) {
            System.out.println("This notebook is good.");
        }
        if (this.price > 490) {
            System.out.println("This notebook is expensive");
        }
    }

    public void checkWeight() {
        if (this.weight < 1300) {
            System.out.println("This notebook is extra light");
        } else if (this.weight > 1000 && this.weight < 1800) {
            System.out.println("This notebook is light");
        }
        if (this.weight > 1800) {
            System.out.println("this notebook is heavy");
        }
    }

    public void checkProfitability() {
        if (this.year < 2011 && this.price < 110) {
            System.out.println("this notebook is ok");
        } else if (this.year > 2017 && this.price > 490) {
            System.out.println("This notebook is profitable");
        }
        if (this.year > 2014 && this.year < 2016 && this.price > 290 && this.price < 310) {
            System.out.println("this notebook is very profitable");
        }
    }
}





