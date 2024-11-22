package BasicLevel1;

import java.util.Scanner;

public class Kiosk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("원하는 메뉴의 번호를 입력해주세요");


        System.out.println("-------------------------------MENU------------------------------------");

        // 메뉴 출력
        System.out.printf("%1d. %5s  |  %4d원  |  %-20s%n", 1, "빅버거", 8500, "양상추, 토마토, 치즈, 쇠고기패티가 들어간 시그니처");
        System.out.printf("%1d. %5s |  %4d원  |  %-20s%n", 2, "불고기버거", 3500, "양상추, 토마토, 치즈, 기본패티, 특제소스가 들어간 인기버거");
        System.out.printf("%1d. %5s  |  %4d원  |  %-20s%n", 3, "새우버거", 5500, "양상추, 토마토, 치즈, 통통한새우패티");
        System.out.printf("%1d. %5s  |  %4d원  |  %-20s%n", 4, "치킨버거", 7500, "양상추, 토마토, 치즈, 통다리살 패티");
        System.out.printf("%1d. %5s %n", 0, "종료");

        int result = sc.nextInt();

        if(1<=result&&result<=4){
            System.out.println(result+"을 선택하셨습니다");
        }else {
            System.out.println("종료합니다");
            System.exit(0);
        }
    }

}
