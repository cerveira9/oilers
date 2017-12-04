package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Posicoes;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-04T17:03:13")
@StaticMetamodel(Jogador.class)
public class Jogador_ { 

    public static volatile SingularAttribute<Jogador, String> cpfDoJogador;
    public static volatile SingularAttribute<Jogador, String> telefoneDoJogador;
    public static volatile SingularAttribute<Jogador, String> endereçoDoJogador;
    public static volatile SingularAttribute<Jogador, Integer> numeroDoJogador;
    public static volatile SingularAttribute<Jogador, Posicoes> posicao;
    public static volatile SingularAttribute<Jogador, Boolean> inscritoLIFFA;
    public static volatile SingularAttribute<Jogador, Boolean> inscritoLNFA;
    public static volatile SingularAttribute<Jogador, String> nomeDoJogador;
    public static volatile SingularAttribute<Jogador, String> dataNascimentoDoJogador;
    public static volatile SingularAttribute<Jogador, Long> id;

}