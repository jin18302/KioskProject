package ChallengeLevel1;

import java.util.*;

public class Kiosk {

    private Scanner sc = new Scanner(System.in);
    private List<Menu> MenuList = new ArrayList<>();
    Cart cart = new Cart();
    boolean CartEmpty = true;
    Menu ChoiceMenu;
    MenuItem ChoiceMenuItem;


    public void setMenuList(Menu... menu) {
        for (Menu m : menu) {
            MenuList.add(m);
        }
    }


    public void start() {
        int input = 0;
        int input2 = 0;
       Loop1: while (true) {
            System.out.println("[  MainMenu  ] 종료0");
            int Num = 1;
            for (Menu menu : MenuList) {
                System.out.println((Num++) + ". " + menu.GetCategory());
            }
            input = sc.nextInt();
            if (1 <= input && input <= MenuList.size()) {
                ChoiceMenu = MenuList.get(input - 1);
                System.out.println("-----------------------------" + ChoiceMenu.GetCategory() + "------------------------  0:뒤로가기");
                MenuList.get(input - 1).GetItemList();
            } else if (input == 0) {
                System.exit(0);
            } else {
                try {
                    throw new Exception("지원하지 않는 기능입니다");
                } catch (Exception e) {
                    System.out.println("다시 입력해주세요");
                    continue;
                }
            }//카테고리들 중 선택, 카테고리의 메뉴리스트를 출력함

            while (true) {
                input2 = sc.nextInt();
                if (1 <= input && input <= ChoiceMenu.GetSize()) {
                    ChoiceMenuItem = ChoiceMenu.GetItem(input2 - 1);
                    System.out.println(ChoiceMenuItem.GetItemInfo());
                    break;
                } else if (input2 == 0) {
                    continue Loop1;
                } else {
                    try {
                        throw new Exception("지원하지않는 기능입니다");
                    } catch (Exception e) {
                        System.out.println("다시입력해주세요");
                        continue;
                    }
                }
            }


            System.out.println("위 메뉴를 장바구니에 추가 하시겠습니까?");
            System.out.println("1. 예 | 2. 아니오");

            input = sc.nextInt();
            if (input == 1) {
                cart.SetCart(ChoiceMenuItem);
                CartEmpty = false;
            } else if (input2 == 2) {
                continue;
            }//장바구니에 추가


            if (!CartEmpty) {
                System.out.println("[  Cart  ]");
                cart.GetCart();
                System.out.println("장바구니에 담긴 상품을 주문하시겠습니까?");
                System.out.println("1. 예 | 2. 아니오");
                input = sc.nextInt();
                if (input == 1) {
                    System.out.println("주문이 완료되었습니다");
                    cart.CartReset();
                } else if (input == 2)
                    continue;
            }//주문

        }
    }
}

