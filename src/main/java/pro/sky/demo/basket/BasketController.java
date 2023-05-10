package pro.sky.demo.basket;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class BasketController {

    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping
    public String hello() {
        return basketService.hello();
    }

    @GetMapping(path = "/add")
    public void add(@RequestParam("id") List<Integer> ids) {
        basketService.add(ids);
    }

    @GetMapping(path = "/get")
    public List<Item> get() {
        return basketService.get();
    }

    @ExceptionHandler(Exception.class)
    public String ExceptionHandler(Exception e) {
        return e.getMessage();
    }


}
