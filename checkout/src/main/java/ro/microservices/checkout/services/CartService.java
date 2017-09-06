package ro.microservices.checkout.services;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;
import ro.microservices.checkout.models.InventoryModel;

@Service
public class CartService {

    @StreamListener("stockChannel")
    public void onReceive(final Message<InventoryModel> message) {
        InventoryModel payload = message.getPayload();
        System.out.println("OnKafka Stock Reresved message ::" + payload );
    }
}
