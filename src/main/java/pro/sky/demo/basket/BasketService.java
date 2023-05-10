package pro.sky.demo.basket;

import java.util.List;

public interface BasketService {

    String hello();
    void add(List<Integer> ids);
    List<Item> get();
}
