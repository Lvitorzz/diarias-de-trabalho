package DTO;

import java.util.Date;

public class DiariaDTO {
    private int id_diarias;
    private String local;
    private String horario_inicio;
    private String horario_fim;
    private String total_horas;
    private Date data;
    private String descricao_servico;
    private String empresa;
    private String requisitante;
    private String executante;
    private String servico;
    private String observacao;
    private String responsavel;
    
    
    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getHorario_inicio() {
        return horario_inicio;
    }

    public void setHorario_inicio(String horario_inicio) {
        this.horario_inicio = horario_inicio;
    }

    public String getHorario_fim() {
        return horario_fim;
    }

    public void setHorario_fim(String horario_fim) {
        this.horario_fim = horario_fim;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getDescricaoServico() {
        return descricao_servico;
    }

    public void setDescricao_servico(String descricao_servico) {
        this.descricao_servico = descricao_servico;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getRequisitante() {
        return requisitante;
    }

    public void setRequisitante(String requisitante) {
        this.requisitante = requisitante;
    }

    public String getExecutante() {
        return executante;
    }

    public void setExecutante(String executante) {
        this.executante = executante;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    } 

    public int getId_diarias() {
        return id_diarias;
    }

    public void setId_diarias(int id_diarias) {
        this.id_diarias = id_diarias;
    }

    public String getTotal_horas() {
        return total_horas;
    }

    public void setTotal_horas(String total_horas) {
        this.total_horas = total_horas;
    }
    
    
}
