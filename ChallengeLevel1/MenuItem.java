package ChallengeLevel1;

public class MenuItem {
    private String Name;
    private int Price;
    private String introduce;


    public MenuItem(String Name, int Price, String introduce) {
        this.Name = Name;
        this.Price = Price;
        this.introduce = introduce;

    }

    public MenuItem(String Name, int Price) {
        this.Name = Name;
        this.Price = Price;
        this.introduce = "";
    }

    public String GetItemName() {
        return Name;
    }

    public String GetItemIntroduce() {
        return String.format(" %5s  |  %4d원  |  %-20s%n", this.Name, this.Price, this.introduce);
    }

    public int GetPrice(){
        return Price;
    }
}
