package guru.springframework.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by jt on 6/13/17.
 */
@Entity
@Data
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;


}
