package ru.team.up.dto;

import lombok.*;

import java.util.Date;
import java.util.Map;


/**
 * Сущность событие для Кафки
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReportDto {
    /**
     * ID
     */
    String id;

    /**
     * Тип события (Ручное, Автоматическое)
     */
    ControlDto control;

    /**
     * Модуль из которого отправлено событие
     */
    AppModuleNameDto appModuleName;

    /**
     * Инициатор события (Система, Пользователь, Менеджер, Администратор)
     */
    InitiatorTypeDto initiatorType;

    /**
     * Имя инициатора события
     */
    String initiatorName;

    /**
     * ID инициатора события
     */
    Long initiatorId;

    /**
     * Время создания события
     */
    Date time;

    /**
     * Статус события (Успешно, Неуспешно)
     */
    StatusDto status;

    /**
     * Список дополнительных параметров
     */
    Map<String, Object> parameters;
}
