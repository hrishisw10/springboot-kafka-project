package springboot.kafka.consumer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.kafka.consumer.entity.WikimediaData;

public interface WikimediaDataRepository extends JpaRepository<WikimediaData, Long> {

}
