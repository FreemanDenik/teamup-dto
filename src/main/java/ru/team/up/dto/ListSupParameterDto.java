package ru.team.up.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ListSupParameterDto {

    private List<SupParameterDto<?>> list = new ArrayList<>();
    private AppModuleNameDto moduleName = null;

    public void addParameter(SupParameterDto<?> parameter) {
        list.add(parameter);
        moduleName = parameter.getSystemName();
    }
}
