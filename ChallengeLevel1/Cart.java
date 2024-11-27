package ChallengeLevel1;

import java.util.*;

public class Cart {
    private List<MenuItem> list = new ArrayList<>();

    public void SetCart(MenuItem item) {
        list.add(item);
    }

    public void GetCart() {
        for (MenuItem item : list) {
            System.out.print(item.GetItemInfo());
        }
        System.out.println(GetToTal()+"원");
    }

    int GetToTal() {
        return list.stream().mapToInt(MenuItem::GetPrice).sum();
    }

    void CartReset() {
        list.clear();
    }
}
