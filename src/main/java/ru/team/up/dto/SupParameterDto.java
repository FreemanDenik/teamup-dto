package ru.team.up.dto;

import lombok.Builder;
import lombok.Data;


/**
 * @author Степан Глущенко
 * Сущность для передачи параметров в другие модули приложения, система Sup.
 */

@Data
@Builder
public class SupParameterDto<T> {
    /**
     * Имя параметар
     */
    private String parameterName;

    /**
     * Тип параметра
     */
    private T parameterType;

    /**
     * Имя модуля приложения, которому посылаются парамтеры.
     */
    private AppModuleNameDto systemName;

    /**
     * Значение парамтера.
     */
    private T parameterValue;
}
