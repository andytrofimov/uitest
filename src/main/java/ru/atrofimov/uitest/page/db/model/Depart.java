package ru.atrofimov.uitest.page.db.model;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true)
public class Depart {

    int departId;
    String departName;

}
