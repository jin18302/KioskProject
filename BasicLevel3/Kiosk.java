package BasicLevel3;

import java.util.*;

public class Kiosk {
    List<MenuItem> ItemList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    Kiosk(List<MenuItem> ItemList){
        this.ItemList=ItemList;
    }


    public void start() {

        System.out.println("원하는 메뉴의 번호를 입력해주세요. 종료는 0");
        System.out.println("-------MENU------");

        Iterator<MenuItem> it = ItemList.iterator();

        int i = 1;
        while (it.hasNext()) {
            System.out.println((i++) + "." + it.next().GetItemName());
        }


        int input = sc.nextInt();
        if (1 <= input && input <= 4)
            System.out.println(ItemList.get(input - 1).GetItemIntroduce());
        else if (input == 0) {
            System.exit(0);
        }else{
            throw new RuntimeException("유효하지않은 번호입니다");
        }
    }


}
