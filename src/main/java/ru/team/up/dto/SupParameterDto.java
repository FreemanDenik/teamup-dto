package ru.team.up.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


/**
 * @author Степан Глущенко
 * Сущность для передачи параметров в другие модули приложения, система Sup.
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SupParameterDto<T> {
    /**
     * Имя параметар
     */
    private String parameterName;

    /**
     * Имя модуля приложения, которому посылаются параметры.
     */
    private AppModuleNameDto systemName;

    /**
     * Значение парамтера.
     */
    private T parameterValue;

    /**
     * Время последнего обновления параметра.
     */
    private LocalDateTime updateTime;

    /**
     * Удален параметр или отключен (т.к. в кафке нельзя удалить сообщение).
     */
    private boolean isDeleted;
}
