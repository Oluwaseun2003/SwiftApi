package com.Ecommece.product.controller;


import com.Ecommece.product.dto.OrderDto;
import com.Ecommece.product.service.OrderService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService){
        this.orderService = orderService;
    }

    @PostMapping(value = "/create")
    public Object createOrder(@RequestBody OrderDto orderDto){
        return orderService.createOrder(orderDto);
    }

    @PutMapping("/{id}")
    public  Object updateOrder(@RequestBody OrderDto orderDto, long id){
        return orderService.updateOrder(orderDto, id);
    }

    @GetMapping("/get/{id}")
    public Object getOrderById(@PathVariable Long id){
        return orderService.getOrderById(id);
    }

    @GetMapping("/get")
    public Object getOrder(){
        return orderService.getOrder();
    }

}
