package ChallengeLevel1;


import java.util.*;
import java.util.Iterator;

public class Kiosk {
    private Scanner sc = new Scanner(System.in);
    private List<Menu> MenuList = new ArrayList<>();
    Cart cart = new Cart();
    boolean CartAdd = false;
    int input;


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

            if (CartAdd) {
                System.out.println("[OrderMenu]");
                System.out.println("6. 장바구니를 확인 후 주문합니다");
                System.out.println("7. 진행중인 주문을 취소합니다");
                input = sc.nextInt();

                if (input == 6) {
                    System.out.println("아래와 같이 주문하시겠습니까?");
                    System.out.println("[ORDERS]");
                    cart.GetCart();

                    System.out.println("[TOTAL]");
                    System.out.println(cart.GetToTal() + "원");

                    System.out.println("1. 주문 | 2. 메뉴판");
                    input = sc.nextInt();

                    if (input == 1) {
                        System.out.println("결제가 완료되었습니다");
                        cart.CartReset();
                        break;
                    } else if (input == 2) continue;

                }
            }

            input = sc.nextInt();
            if (1 <= input && input <= MenuList.size()) {
                System.out.println("-----------------------------" + MenuList.get(input - 1).GetCategory() + "------------------------   (뒤로가기5, 종료0)");
                MenuList.get(input - 1).GetItemList();//카테고리별 메뉴출력
            } else if (input == 0) break;


            int input2 = sc.nextInt();
            if (1 <= input && input <= MenuList.get(input - 1).GetSize()) {
                System.out.println(MenuList.get(input - 1).GetItem(input2 - 1).GetItemIntroduce());
                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                System.out.println("1.예 | 2.아니오");
                input = sc.nextInt();

                if (input == 1) {
                    cart.SetCart(MenuList.get(input - 1).GetItem(input2 - 1));
                    System.out.println(MenuList.get(input - 1).GetItem(input2 - 1).GetItemName() + "이 장바구니에 추가되었습니다");
                    CartAdd = true;
                }
            } else if (input == 5) continue;
            else if (input == 0) break;
        }
        System.exit(0);
    }
}
