package mns.dfs.eval.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Getter;
import lombok.Setter;
import mns.dfs.eval.views.CommandeDisplay;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Date datePaiement;

    @ManyToOne
    @JsonView(CommandeDisplay.class)
    private Utilisateur client;

    @OneToMany(mappedBy = "commande")
    @JsonView(CommandeDisplay.class)
    private Set<LigneCommande> listeLigneCommande;
}
