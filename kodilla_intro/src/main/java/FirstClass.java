public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(1200, 500, 2019);
        System.out.println(notebook.weight + " " + notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkProfitability();

        Notebook heavyNotebook = new Notebook(2000, 300, 2015);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkProfitability();

        Notebook oldNotebook = new Notebook(1600, 100, 2010);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkProfitability();


        }
    }

