/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author tiago.lucas
 */
@ManagedBean
@RequestScoped
public class AlunosMB {

    /**
     * Creates a new instance of AlunosMB
     */
    public AlunosMB() {
    }
    private List<Aluno> alunos;
    @PostConstruct
    public void init(){
        alunos=new ArrayList<>();
        Aluno a = new Aluno();
        a.setNome("João");
        alunos.add(a);
        a = new Aluno();
        a.setNome("Maria");
        alunos.add(a);
        a=new Aluno();
        a.setNome("José");
        alunos.add(a);
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
}
