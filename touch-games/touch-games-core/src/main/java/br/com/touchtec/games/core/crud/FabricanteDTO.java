/*
 * Copyright (c) 1999-2009 Touch Tecnologia e Informatica Ltda.
 * Gomes de Carvalho, 1666, 3o. Andar, Vila Olimpia, Sao Paulo, SP, Brasil.
 * Todos os direitos reservados.
 * 
 * Este software e confidencial e de propriedade da Touch Tecnologia e
 * Informatica Ltda. (Informacao Confidencial). As informacoes contidas neste
 * arquivo nao podem ser publicadas, e seu uso esta limitado de acordo com os
 * termos do contrato de licenca.
 */

package br.com.touchtec.games.core.crud;


import static br.com.touchtec.dali.crud.api.CrudViews.VIEW;

import java.util.List;

import br.com.touchtec.dali.crud.api.Association;
import br.com.touchtec.dali.crud.api.AssociationDTO;
import br.com.touchtec.dali.crud.api.CrudDTO;
import br.com.touchtec.dali.crud.api.CrudViews;
import br.com.touchtec.dali.crud.config.CrudMapping;
import br.com.touchtec.dali.view.View;
import br.com.touchtec.dali.view.Views;
import br.com.touchtec.games.core.model.Fabricante;
import br.com.touchtec.message.Named;

@Views({
        @View(config = "nome"),
        @View(ids = VIEW, config = "nome; plataformas")
})
@CrudMapping(entity = Fabricante.class)
@Named(key = "Fabricante")
public class FabricanteDTO implements CrudDTO<Long> {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String nome;

    private List<AssociationDTO<Long>> plataformas;

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<AssociationDTO<Long>> getPlataformas() {
        return plataformas;
    }

    public void setPlataformas(List<AssociationDTO<Long>> plataformas) {
        this.plataformas = plataformas;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
