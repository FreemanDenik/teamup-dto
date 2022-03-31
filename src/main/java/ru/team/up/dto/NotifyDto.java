package ru.team.up.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Класс для передачи данных уведомления
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NotifyDto {

    /**
     * Уникальный идентификатор, генерится самой базой
     */
    private String id;

    /**
     * Текст уведомления
     */
    private String text;

    /**
     * Тема уведомления
     */
    private String subject;

    /**
     * Email, куда необходимо отправить уведомление
     */
    private String email;

    /**
     * Статус уведомления
     */
    private NotifyStatusDto status;

    /**
     * Время создания уведомления
     */
    private LocalDateTime creationTime;

    /**
     * Время отправки уведомления
     */
    private LocalDateTime sentTime;
}
