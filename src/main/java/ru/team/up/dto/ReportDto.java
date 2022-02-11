package ru.team.up.dto;

import lombok.Builder;
import lombok.Value;

import java.util.Map;


/**
 * Сущность событие для Кафки
 */
@Value
@Builder
public class ReportDto {

    /**
     * Тип события (Ручное, Автоматическое)
     */
    ControlDto controlDto;

    /**
     * Статус события (Успешно, Неуспешно)
     */
    StatusDto status;

    /**
     * Список дополнительных параметров
     */
    Map<String, Object> parameters;
}
