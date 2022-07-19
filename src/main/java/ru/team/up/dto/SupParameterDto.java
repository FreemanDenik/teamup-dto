package ru.team.up.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


/**
 * Сущность для передачи параметров в другие модули приложения, система Sup.
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SupParameterDto<T> {
    /**
     * Имя параметра
     */
    private String parameterName;

    /**
     * Значение параметра
     */
    private T parameterValue;

    /**
     * Значение параметра isList определяющее множество параметров при isList = true и один параметр если isList = false
     */
    private Boolean isList;

    /**
     * Тип передаваемого параметра
     */
    private SupParameterType parameterType;

    /**
     * Имя модуля приложения, которому предназначен данный параметр.
     */
    private AppModuleNameDto systemName;

    /**
     * Время последнего обновления параметра.
     */
    private LocalDateTime updateTime;
}
