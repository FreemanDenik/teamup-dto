package ru.team.up.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Класс для передачи данных о событиях в Kafka и считывания из Kafka
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class KafkaEventDto {

    /**
    * Тип события
    */
    private KafkaEventTypeDto kafkaEventTypeDto;

    //TODO Добавить поля

}
