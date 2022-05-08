package mns.dfs.eval.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Getter;
import lombok.Setter;
import mns.dfs.eval.views.CommandeDisplay;
import mns.dfs.eval.views.EmployeDisplay;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JsonView({EmployeDisplay.class})
    private String nom;

    @JsonView(CommandeDisplay.class)
    private float prix;

    @ManyToOne
    private Employe gestionnaire;

    @OneToMany(mappedBy = "article")
    private Set<Caracteristique> listeCaracteristique = new HashSet<>();
}
