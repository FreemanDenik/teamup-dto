package ru.team.up.dto;

import java.util.Random;

/**
 * @author Степан Глущенко
 * Имена модулей приложения, которые будут принимать парамтеры от системы SUP.
 */

public enum AppModuleNameDto {
    TEAMUP_APP,
    TEAMUP_AUTH,
    TEAMUP_CORE,
    TEAMUP_DTO,
    TEAMUP_EXTERNAL,
    TEAMUP_INPUT,
    TEAMUP_KAFKA,
    TEAMUP_MONITORING,
    TEAMUP_MODERATOR,
    TEAMUP_SUP;

    public static AppModuleNameDto getAppModuleName() {
        // тут написать реализацию метода, который из имеющихся параметров enum рандомно выберет один
        Random random = new Random();
        return  values()[(random.nextInt(values().length))];
    }
}
