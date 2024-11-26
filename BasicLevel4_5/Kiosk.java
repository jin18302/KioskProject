package BasicLevel4_5;

import java.util.*;

public class Kiosk {
    private Scanner sc = new Scanner(System.in);
    private List<Menu> MenuList = new ArrayList<>();


    public void setMenuList(Menu... menu) {
        for (Menu m : menu) {
            MenuList.add(m);
        }
    }

    public void start() {
        while (true) {
            System.out.println("----------MainMenu-----------. 종료는0");

            Iterator<Menu> it = MenuList.iterator();
            int i = 1;
            while (it.hasNext()) {
                System.out.println((i++) + ". " + it.next().GetCategory());//카테고리 출력
            }
            System.out.println();

            int input = sc.nextInt()-1;
            if (0 <= input && input < MenuList.size()) {
                System.out.println("-----------------------------" + MenuList.get(input).GetCategory() + "------------------------   (뒤로가기5, 종료0)");
                MenuList.get(input).GetItemList();//카테고리별 메뉴출력
            } else if (input == -1) break;


           int input2 = sc.nextInt();           //menu.1보다 크거나, 번호보다 같아면
            if (1 <= input2 && input2 <= MenuList.get(input).GetSize()) {
                System.out.println("선택한메뉴:"+MenuList.get(input).GetItem(input2-1).GetItemIntroduce());
            } else if (input2 == 5) continue;
            else if (input2 == 0) break;
        }
        System.exit(0);
    }
}
