package DAO;

import DTO.DiariaDTO;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DiariaDAO {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    
    public void registrarDiaria(DiariaDTO diariadto){
        conn = new ConexaoDAO().conexaoBD();
        try {
            String sql = "insert into diarias_de_trabalho(data, empresa, localTrabalho, servico, requisitante, "
                    + "servico_executado, executante, responsavel, inicio, terminio, total_horas)values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
            pstm = conn.prepareCall(sql);
            
            pstm.setDate(1, (Date) diariadto.getData());
            pstm.setString(2, diariadto.getEmpresa());
            pstm.setString(3, diariadto.getLocal());
            pstm.setString(4, diariadto.getServico());
            pstm.setString(5, diariadto.getRequisitante());
            pstm.setString(6, diariadto.getDescricaoServico());
            pstm.setString(7, diariadto.getExecutante());
            pstm.setString(8, diariadto.getResponsavel());
            pstm.setString(9, diariadto.getHorario_inicio());
            pstm.setString(10, diariadto.getHorario_fim());
            pstm.setString(11, diariadto.getTotal_horas());
            
            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "DiariaDAO - RegistrarDiaria " + erro);
        }
    }
}
