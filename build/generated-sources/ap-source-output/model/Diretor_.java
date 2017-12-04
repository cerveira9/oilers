package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Cargos;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-04T14:17:27")
@StaticMetamodel(Diretor.class)
public class Diretor_ { 

    public static volatile SingularAttribute<Diretor, String> telefoneDoDiretor;
    public static volatile SingularAttribute<Diretor, String> dataNascimentoDoDiretor;
    public static volatile SingularAttribute<Diretor, String> cpfDoDiretor;
    public static volatile SingularAttribute<Diretor, String> endereçoDoDiretor;
    public static volatile SingularAttribute<Diretor, Long> id;
    public static volatile SingularAttribute<Diretor, String> nomeDoDiretor;
    public static volatile SingularAttribute<Diretor, Cargos> cargo;

}