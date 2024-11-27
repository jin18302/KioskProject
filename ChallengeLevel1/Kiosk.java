package ChallengeLevel1;

import java.util.*;

public class Kiosk {

    private Scanner sc = new Scanner(System.in);
    private List<Menu> MenuList = new ArrayList<>();
    Cart cart = new Cart();
    boolean CartEmpty = true;

    public void setMenuList(Menu... menu) {
        for (Menu m : menu) {
            MenuList.add(m);
        }
    }

    public void start() {
        while (true) {
            System.out.println("[  MainMenu  ] 종료0");
            for (Menu menu : MenuList) {
                System.out.println(menu.GetCategory());
            }
            int input = sc.nextInt();//카테고리를 입력받음
            if (1 <= input && input <= MenuList.size()) {
                System.out.println("-----------------------------"+MenuList.get(input - 1).GetCategory()+"-----------------------------");
                MenuList.get(input - 1).GetItemList();
            } else if (input == 0) {
                System.exit(0);
            } else {
                System.out.println("유효하지 않은 숫자입니다.다시 입력해주세요");
                continue;
            }//카테고리를 출력하고, 카테고리들 중 선택


            int input2 = sc.nextInt();
            if (1 <= input && input <= MenuList.get(input - 1).GetSize()) {
                System.out.println(MenuList.get(input - 1).GetItem(input2 - 1).GetItemInfo());
            } else if (input2 == 0) {
                continue;//메뉴를 선택
            } else {
                System.out.println("유효하지 않은 숫자입니다.다시 입력해주세요");
                continue;
            }


            System.out.println("위 메뉴를 장바구니에 추가 하시겠습니까?");
            System.out.println("1. 예 | 2. 아니오");

            input = sc.nextInt();
            if (input == 1) {
                cart.SetCart(MenuList.get(input - 1).GetItem(input2 - 1));
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

