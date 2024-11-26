package ChallengeLevel1;


import java.util.Iterator;
import java.util.List;

public class Menu {
    private String Category;
    private List<MenuItem> MenuItemList;

    public Menu(String Category, List<MenuItem> itemList) {
        this.Category = Category;
        this.MenuItemList = itemList;
    }

    public void SetItemList(MenuItem item) {
        this.MenuItemList.add(item);
    }

    public int GetSize(){
        return MenuItemList.size();
    }

    public void GetItemList() {
        int i = 1;
        Iterator<MenuItem> it = MenuItemList.iterator();
        while (it.hasNext()) {
            System.out.print((i++) + ". " + it.next().GetItemIntroduce());
        }
    }

    public String GetCategory() {
        return Category;
    }

    MenuItem GetItem(int index) {
        return MenuItemList.get(index);
    }
}
