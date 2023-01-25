package com.eldrix.hermes.sct;

import java.time.LocalDate;

public interface IDescription extends IComponent {
    public long conceptId();
    public String languageCode();
    public long typeId();
    public String term();
    public long caseSignificanceId();
}