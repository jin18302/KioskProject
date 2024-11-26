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

            int input = sc.nextInt();
            if (1 <= input && input <= MenuList.size()) {
                System.out.println("-----------------------------" + MenuList.get(input - 1).GetCategory() + "------------------------   (뒤로가기5, 종료0)");
                MenuList.get(input - 1).GetItemList();//카테고리별 메뉴출력
            } else if (input == 0) break;


            input = sc.nextInt();
            if (1 <= input && input <= MenuList.get(input - 1).size) {
                System.out.println(input + "번 을 선택하셨습니다");
            } else if (input == 5) continue;
            else if (input == 0) break;
        }
        System.exit(0);
    }
}
