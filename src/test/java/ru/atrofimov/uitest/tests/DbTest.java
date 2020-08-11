package ru.atrofimov.uitest.tests;

import static org.assertj.core.api.Assertions.assertThat;
import static ru.atrofimov.uitest.page.db.MapperFactory.getMapper;
import org.junit.jupiter.api.Test;
import ru.atrofimov.uitest.page.db.mapper.DepartMapper;
import ru.atrofimov.uitest.page.db.model.Depart;

public class DbTest {

    private DepartMapper departMapper = getMapper(DepartMapper.class);

    @Test
    void name() {
        Depart test = new Depart().departId(123).departName("test");
        departMapper.save(test);
//        getSqlSession().rollback();
        assertThat(departMapper.selectAll()).contains(test);
    }
}
