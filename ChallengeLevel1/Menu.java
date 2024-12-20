package ChallengeLevel1;

import java.util.List;

public class Menu {
    private String Category;
    private List<MenuItem> MenuItemList;

    public Menu(String Category, List<MenuItem> itemList) {
        this.Category = Category;
        this.MenuItemList = itemList;
    }

    public String GetCategory() {
        return Category;
    }

    public void GetItemList() {
        int Num=1;
       for(MenuItem item: MenuItemList){
           System.out.print((Num++)+". "+item.GetItemInfo());
       }
    }

    public MenuItem GetItem(int index) {
        return MenuItemList.get(index);
    }

    public int GetSize() {
        return MenuItemList.size();
    }

}
