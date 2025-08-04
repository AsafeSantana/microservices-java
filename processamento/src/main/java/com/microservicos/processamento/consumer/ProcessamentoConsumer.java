package com.microservicos.processamento.consumer;

import com.microservicos.processamento.dto.PedidoDTO;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class ProcessamentoConsumer {

    @RabbitListener(queues = "${broker.queue.processamento.name}")
    public void listenerProcessamentoQueue(PedidoDTO pedidoDTO) {
        System.out.println(pedidoDTO.getDescricao());
    }
}
