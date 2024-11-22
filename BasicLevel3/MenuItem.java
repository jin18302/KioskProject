package BasicLevel3;

public class MenuItem {
    private String Name;
    private int Price;
    private String introduce;


    MenuItem(String Name, int Price, String introduce) {
        this.Name = Name;
        this.Price = Price;
        this.introduce = introduce;

    }

    String GetItemName() {
        return Name;
    }


    /**
     * @return 객체자기 자신의 정보
     */
    public String GetItemIntroduce() {
        return String.format(" %5s  |  %4d원  |  %-20s%n", this.Name, this.Price, this.introduce);
    }
}
