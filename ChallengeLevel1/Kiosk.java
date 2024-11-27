package ChallengeLevel1;

import java.util.*;
import java.util.Iterator;

public class Kiosk {
    private Scanner sc = new Scanner(System.in);
    private List<Menu> MenuList = new ArrayList<>();
    Cart cart = new Cart();

    boolean CartNotEmpty = false;


    public void setMenuList(Menu... menu) {
        for (Menu m : menu) {
            MenuList.add(m);
        }
    }

    public void start() {
        while (true) {
            System.out.printf("%10s%n", "[MENU]. 종료는0");

            Iterator<Menu> it = MenuList.iterator();
            int Num = 1;
            while (it.hasNext()) {
                System.out.println((Num++) + ". " + it.next().GetCategory());//카테고리 출력
            }
            System.out.println();

            int input = sc.nextInt();
            Menu InputByMenu;

            if (1 <= input && input <= MenuList.size()) {//input값이 1~index+1이면
                InputByMenu = MenuList.get(input - 1);//선택한 카테고리의 메뉴
                System.out.println("-----------------------------" + InputByMenu.GetCategory() + "------------------------   (뒤로가기5, 종료0)");
                InputByMenu.GetItemList();//선택한 카테고리의 메뉴출력

                int input2 = sc.nextInt();

                if (1 <= input2 && input2 <= InputByMenu.GetSize()) {
                    MenuItem chose = InputByMenu.GetItem(input2 - 1);//선택한 메뉴아이템
                    System.out.println(chose.GetItemIntroduce());//선택한 메뉴아이템 출력
                    System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                    System.out.println("1.예 | 2.아니오");

                    input = sc.nextInt();

                    if (input == 1) {
                        cart.SetCart(chose);//선택한 메뉴아이템을 카트에 저장
                        System.out.println(chose.GetItemName() + "이 장바구니에 추가되었습니다");
                        CartNotEmpty = true;//카트에 저장된 아이템이 있음으로 바꿈
                        if (CartNotEmpty) {//카트에 저장된 아이템이 있으면 실핼
                            System.out.printf("%10s%n", "[OrderMenu]");
                            System.out.println("6. 장바구니를 확인 후 주문합니다");
                            System.out.println("7. 메뉴를 이어서 선택합니다");
                            input = sc.nextInt();

                            if (input == 6) {
                                System.out.println("아래와 같이 주문하시겠습니까?");
                                System.out.printf("%10s%n", "[ORDERS]");
                                cart.GetCart();//카트안에 있는 아이템들을 출력

                                System.out.printf("%10s%n", "[TOTAL]");
                                System.out.println(cart.GetToTal() + "원");

                                System.out.println("1. 주문 | 2. 메뉴판");
                                input = sc.nextInt();

                                if (input == 1) {
                                    System.out.println("결제가 완료되었습니다");
                                    cart.CartReset();
                                    break;
                                } else if (input == 2) continue;

                            } else if (input == 7) continue;//결제할 건지 밀건지
                        }
                    } else if (input == 2) continue;
                } else if (input == 9) continue;
                else if (input == 0) break;
            } else if (input == 0) {
                break;
            } else if (input == 5) continue;
        }
        System.exit(0);
    }
}
