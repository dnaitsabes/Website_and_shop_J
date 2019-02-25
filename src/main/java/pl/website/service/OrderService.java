package pl.website.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.website.model.Newsletter;
import pl.website.model.Order;
import pl.website.repository.OrderRepository;

import java.util.List;

@Service
@Transactional
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAllOrder(){
        return orderRepository.findAll();
    }

    public Order findOneOrderById(Long id){
        return orderRepository.findOne(id);
    }

    public void saveOrder(Order order){
        orderRepository.save(order);
    }

    public void deleteOneOrderByOrder( Order order){
        orderRepository.delete(order);
    }

    public void deleteOneOrderrById( Long id){
        orderRepository.delete(id);
    }

    public void deleteAllOrder( ){
        orderRepository.deleteAll();
    }

    public long countAllOrder(){
        return   orderRepository.count();
    }
}
