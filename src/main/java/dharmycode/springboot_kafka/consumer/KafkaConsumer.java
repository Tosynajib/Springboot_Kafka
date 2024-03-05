package dharmycode.springboot_kafka.consumer;

import dharmycode.springboot_kafka.payload.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

@Service
@Slf4j
public class KafkaConsumer {

//    @KafkaListener(topics = "Dharmy", groupId = "myGroup")
//    public void consumeMessage(String message) {
//        log.info(format("Consuming the message from dharmy Topic:: %s", message));
//    }


    @KafkaListener(topics = "Dharmy", groupId = "myGroup")
    public void consumeJsonMessage(Student student) {
        log.info(String.format("Consuming the message from dharmy Topic:: %s", student.toString()));
    }
}
