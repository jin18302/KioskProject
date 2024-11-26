package ChallengeLevel1;


import java.util.Iterator;
import java.util.List;

public class Menu {
    private String Category;
    private List<MenuItem> MenuItemList;
    int size=MenuItemList.size();

    public Menu(String Category,List<MenuItem> itemList) {
        this.Category = Category;
        this.MenuItemList=itemList;
    }

    public void SetItemList(MenuItem item) {
        this.MenuItemList.add(item);
    }

    public void GetItemList() {
        int i=1;
        Iterator<MenuItem> it =  MenuItemList.iterator();
        while (it.hasNext()){
            System.out.print((i++)+". "+it.next().GetItemIntroduce());
        }
    }

    public String GetCategory() {
        return Category;
    }

}
