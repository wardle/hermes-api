package com.eldrix.hermes.sct;

public interface IDescription extends IComponent {
    public long conceptId();
    public String languageCode();
    public long typeId();
    public String term();
    public long caseSignificanceId();
}