package edu.cbd.ProductService.port.user.controller;

import edu.cbd.ProductService.port.user.producer.ProductProducer;
import edu.cbd.ProductService.shoppingcart.producer.UpdateProductProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    ProductProducer productProducer;

    @Autowired
    UpdateProductProducer updateProductProducer;

    @GetMapping("/product-queue")
    public void triggerProductQueue() {
        try {
            productProducer.sendMessage("product");
        } catch (Exception e) {
        }
    }

    @GetMapping("/product-update-queue")
    public void triggerProductUpdateQueue() {
        try {
            updateProductProducer.sendMessage("update");
        } catch (Exception e) {
        }
    }
}
