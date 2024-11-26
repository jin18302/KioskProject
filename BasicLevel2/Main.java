package BasicLevel2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<MenuItem> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            list.add(new MenuItem("빅버거", 8500, "양상추, 토마토, 치즈, 쇠고기패티가 들어간 시그니처"));
            list.add(new MenuItem("불고기버거", 3500, "양상추, 토마토, 치즈, 기본패티, 특제소스가 들어간 인기버거"));
            list.add(new MenuItem("새우버거", 5500, "양상추, 토마토, 치즈, 통통한 새우패티"));
            list.add(new MenuItem("치킨버거", 7500, "양상추, 토마토, 치즈, 통다리살 패티"));


            System.out.println("원하는 메뉴의 번호를 입력해주세요. 종료는 0");
            System.out.println("-------MENU------");

            Iterator<MenuItem> it = list.iterator();

            int i = 1;
            while (it.hasNext()) {
                System.out.println((i++) + "." + it.next().GetItemName());
            }


            int input = sc.nextInt();
            if (1 <= input && input <= 4) {
                System.out.println(list.get(input - 1).GetItemIntroduce());
            } else if (input == 0)
                System.exit(0);


        }
    }
}
