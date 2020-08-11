package ru.atrofimov.uitest.page.db.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import ru.atrofimov.uitest.page.db.model.Depart;

public interface DepartMapper {

    @Select("select * from depart")
    List<Depart> selectAll();

    @Insert("INSERT INTO depart (depart_id, depart_name) VALUES(#{departId}, #{departName})")
    void save(Depart depart);

}
