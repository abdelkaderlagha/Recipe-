package guru.springframework.repositories;

import guru.springframework.domain.UnitOfMeasure;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UnitOfMeasureRepositoryTest extends TestCase {

    @Autowired
    UnitOfMeasureRepository unitOfMeasureRepository;


    public void setUp() throws Exception {
    }

    @Test
    public void testFindByDescription() {
        Optional<UnitOfMeasure> unitOfMeasure = unitOfMeasureRepository.findByDescription("Teaspoon");
        assertEquals("Teaspoon" , unitOfMeasure.get().getDescription());

    }
}