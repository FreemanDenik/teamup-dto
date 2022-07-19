package ru.team.up.dto;

import lombok.Builder;
import lombok.Data;
import java.time.LocalDateTime;

import java.util.Set;

/**
 * Класс для передачи данных события
 */

@Data
@Builder
public class EventDto {
    /**
     * Первичный ключ
     */
    private Long id;

    /**
     * Название мероприятия
     */
    private String eventName;

    /**
     * Описание мероприятий
     */
    private String descriptionEvent;

    /**
     * Место проведения мероприятия
     */
    private String placeEvent;

    /**
     * Город проведения
     */
    private String city;

    /**
     * Время проведения мероприятия
     */
    private LocalDateTime timeEvent;

    /**
     * Время окончания мероприятия
     */
    private LocalDateTime timeEndEvent;

    /**
     * Приватность мероприятия
     */
    private Boolean eventPrivacy;

    /**
     * Количество участников
     */
    private Long participantsCount;

    /**
     * Количество просмотров мероприятия
     */
    private Long countViewEvent;

    /**
     * Тип мероприятия
     */
    private EventTypeDto eventType;

    /**
     * Создатель мероприятия
     */
    private Long authorId;

    /**
     * С какими интересами связанно мероприятие
     */
    private Set<InterestsDto> eventInterests;

    /**
     * Статус мероприятия (модерация, доступно и т.д.)
     */
    private StatusDto status;

    /**
     * Минимальный возраст
     */
    private Byte minYear;
}
