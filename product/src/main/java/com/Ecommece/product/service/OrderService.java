package com.Ecommece.product.service;


import com.Ecommece.product.dto.OrderDto;
import com.Ecommece.product.model.Order;
import com.Ecommece.product.repository.OrderRepo;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final OrderRepo orderRepo;

    public  OrderService(OrderRepo orderRepo){
        this.orderRepo = orderRepo;
    }

    public Object createOrder(OrderDto orderDto){
        Order order = new Order();

        order.setCustomerId(orderDto.getCustomerId());
        order.setOrderItems(orderDto.getOrderItems());

        return orderRepo.save(order);
    }

    public Object updateOrder(OrderDto orderDto, Long id){
        Order order =orderRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Order with id" +orderDto.getId() + "not found"));
        order.setCustomerId(orderDto.getCustomerId());
        order.setOrderItems(orderDto.getOrderItems());

        return orderRepo.save(order);

    }

    public Object getOrderById(Long id){
        return  orderRepo.findById(id);
    }

    public  Object getOrder(){
        return orderRepo.findAll();
    }

    public Object deleteOrder(OrderDto orderDto, Long id){
        Order order = orderRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Order with id" + orderDto.getId() + "not found" ));

         orderRepo.delete(order);
        return "Order deleted successfully";
    }
}
