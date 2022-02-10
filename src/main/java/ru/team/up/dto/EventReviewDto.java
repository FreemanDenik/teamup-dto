package ru.team.up.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * Класс для передачи данных события
 */
@Data
@Builder
public class EventReviewDto {
    /**
     * Первичный ключ
     */
    private Long id;

    /**
     * Пользователь оставивший отзыв
     */
    private UserDto reviewer;

    /**
     * Отзыв
     */
    private String message;

    /**
     * Для какого мероприятия оставлен отзыв
     */
    private EventDto eventId;

    /**
     * Время составления отзыва
     */
    private LocalDateTime time;

    /**
     * Оценка мероприятия
     */
    private Long eventGrade;
}
