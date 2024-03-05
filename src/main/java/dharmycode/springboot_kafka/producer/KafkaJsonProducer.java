package dharmycode.springboot_kafka.producer;

import dharmycode.springboot_kafka.payload.Student;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class KafkaJsonProducer {

    private final KafkaTemplate<String, Student>  kafkaTemplate;

    public void sendMessage(Student student){

        Message<Student> message = MessageBuilder
                .withPayload(student)
                .setHeader(KafkaHeaders.TOPIC, "Dharmy")
                .build();

        kafkaTemplate.send(message);
    }
}
