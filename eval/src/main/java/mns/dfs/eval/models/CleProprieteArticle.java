package mns.dfs.eval.models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Getter
@Setter
@Embeddable
public class CleProprieteArticle implements Serializable {
    @Column(name = "article_id")
    private Integer articleId;

    @Column(name = "propriete_id")
    private Integer proprieteId;
}
