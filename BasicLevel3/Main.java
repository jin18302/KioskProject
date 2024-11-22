package BasicLevel3;

import java.util.*;
import java.util.Arrays.*;

public class Main {
    public static void main(String[] args) {
        List<MenuItem> itemList = Arrays.asList(
                new MenuItem("빅버거", 8500, "양상추, 토마토, 치즈, 쇠고기패티가 들어간 시그니처"),
                new MenuItem("불고기버거", 3500, "양상추, 토마토, 치즈, 기본패티, 특제소스가 들어간 인기버거"),
                new MenuItem("새우버거", 5500, "양상추, 토마토, 치즈, 통통한 새우패티"),
                new MenuItem("치킨버거", 7500, "양상추, 토마토, 치즈, 통다리살 패티"));


        Kiosk kiosk = new Kiosk(itemList);
        kiosk.start();
    }

}
