package BasicLevel4_5;

import java.util.*;
// MenuItem 클래스를 List로 관리

// List에 들어있는 MenuItem을 순차적으로 보여주는 함수
// List를 리턴하는 함수

// 구조에 맞게 함수를 선언해놓고 가져다 사용하세요.

public class Menu {
    private String Category;
    private List<MenuItem> MenuList;

    public Menu(String Category,List<MenuItem> itemList) {
        this.Category = Category;
        this.MenuList=itemList;
    }

    public void SetMenuList(MenuItem item) {
        this.MenuList.add(item);
    }

    public void GetItemList() {
        int i=1;
        Iterator<MenuItem> it =  MenuList.iterator();
        while (it.hasNext()){
            System.out.print((i++)+". "+it.next().GetItemIntroduce());
        }
    }

    String GetCategory() {
        return Category;
    }


}
