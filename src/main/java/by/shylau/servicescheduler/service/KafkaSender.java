package by.shylau.servicescheduler.service;

import by.shylau.servicescheduler.dto.Mail;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class KafkaSender {
    private final KafkaTemplate<String, Mail> kafkaTemplate;

    @Scheduled(cron = "0 56 11 * * *")//24:00
    public void sendMessage() {
        var msg = new Mail();

        msg.setAddress("happymanksh9@gmail.com");
        msg.setSubject("Галава");
        msg.setText("Тест кафки " + System.currentTimeMillis());

        kafkaTemplate.send("demo_topic", msg);
        log.info("KafkaSender.sendMessage, {}", msg);
    }
}