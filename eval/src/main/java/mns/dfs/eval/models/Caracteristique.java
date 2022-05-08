package mns.dfs.eval.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@IdClass(CleProprieteArticle.class)
public class Caracteristique {
    @Id
    private Integer articleId;

    @Id
    private Integer proprieteId;

    @ManyToOne
    @MapsId("article_id")
    @JoinColumn(name = "article_id")
    private Article article;

    @ManyToOne
    @MapsId("propriete_id")
    @JoinColumn(name = "propriete_id")
    private Propriete propriete;

    private String valeur;
}
