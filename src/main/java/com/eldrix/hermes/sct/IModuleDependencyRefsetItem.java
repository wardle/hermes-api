package com.eldrix.hermes.sct;

import java.time.LocalDate;

public interface IModuleDependencyRefsetItem {
    LocalDate sourceEffectiveTime();

    LocalDate targetEffectiveTime();
}
