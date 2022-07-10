package hello.world.models;

import io.micronaut.context.annotation.AliasFor;
import lombok.*;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private String name;
    private Integer lengthOfEmployment;
    private String title;
}
