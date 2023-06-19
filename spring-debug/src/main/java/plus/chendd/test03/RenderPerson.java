package plus.chendd.test03;

import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

@Component
@Import(Person.class)
public class RenderPerson {
}
