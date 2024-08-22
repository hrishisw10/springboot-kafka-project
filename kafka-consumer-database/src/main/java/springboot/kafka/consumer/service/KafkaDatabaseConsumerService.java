package springboot.kafka.consumer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import springboot.kafka.consumer.entity.WikimediaData;
import springboot.kafka.consumer.repository.WikimediaDataRepository;

@Service
public class KafkaDatabaseConsumerService {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaDatabaseConsumerService.class);

    private WikimediaDataRepository wikimediaDataRepository;

    public KafkaDatabaseConsumerService(WikimediaDataRepository wikimediaDataRepository) {
        this.wikimediaDataRepository = wikimediaDataRepository;
    }

    @KafkaListener(topics = "wikimedia_recentchange", groupId = "myGroup")
    public void consumer(String eventMsg){
        LOGGER.info(String.format("Recieved Event Message-> %s", eventMsg));
        WikimediaData wikimediaData = new WikimediaData();
        wikimediaData.setWikiEventData(eventMsg);

        wikimediaDataRepository.save(wikimediaData);
    }
}
