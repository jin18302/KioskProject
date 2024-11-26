package ChallengeLevel1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Menu hanburgers = new Menu("Burgers", Arrays.asList(new MenuItem("빅버거", 8500, "양상추, 토마토, 치즈, 쇠고기패티가 들어간 시그니처"),
                        new MenuItem("불고기버거", 3500, "양상추, 토마토, 치즈, 기본패티, 특제소스가 들어간 인기버거"),
                        new MenuItem("새우버거", 5500, "양상추, 토마토, 치즈, 통통한 새우패티"),
                        new MenuItem("치킨버거", 7500, "양상추, 토마토, 치즈, 통다리살 패티"))
        );


        Menu drinks = new Menu("Drinks", Arrays.asList(new MenuItem("사이다", 1500),
                new MenuItem("콜라", 1500),
                new MenuItem("제로콜라", 2000),
                new MenuItem("밀크쉐이크", 3000))
        );


        Menu SideMenu = new Menu("SideMenu",
                Arrays.asList(new MenuItem("감자튀김", 3000, "강원도 햇감자로 튀긴 감자튀김"),
                        new MenuItem("치킨너겟", 3500, "100%순살만을 이용해 만든 수제 치킨너겟"),
                        new MenuItem("치즈스틱", 3000, "임실치즈를 사용해 만든 모짜렐라치즈스틱"),
                        new MenuItem("어니언링", 4000, "국내산 양파로 만든 바삭달달 어니언링"))
        );


        Kiosk kiosk = new Kiosk();
        kiosk.setMenuList(hanburgers, drinks, SideMenu);
        kiosk.start();
    }
}
