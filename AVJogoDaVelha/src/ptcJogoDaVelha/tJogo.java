package ptcJogoDaVelha;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static ptcJogoDaVelha.Conexao.con;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samue
 */
public class tJogo extends javax.swing.JFrame {

int VitJogador1 = 0;
int VitJogador2 = 0;
int Empate = 0;    
boolean VezJogador1 = true;
boolean VezJogador2 = false;

    /**
     * Creates new form tJogo
     */
    public tJogo() {
        initComponents();
        Conexao.Conectar();
        lblJogador1.setText("Jogador 1: " + tDefinirJogadores.Variaveis.nomeJogador1);
        lblJogador2.setText("Jogador 2: " + tDefinirJogadores.Variaveis.nomeJogador2);
        lblNumVit1.setText("Número de Vitórias: " + tDefinirJogadores.Variaveis.vitoriasJogador1);
        lblNumVit2.setText("Número de Vitórias: " + tDefinirJogadores.Variaveis.vitoriasJogador2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblJogador1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblNumVit1 = new javax.swing.JLabel();
        lblNumVit2 = new javax.swing.JLabel();
        lblJogador2 = new javax.swing.JLabel();
        lblSimbolo1 = new javax.swing.JLabel();
        lblSimbolo2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblEmpate = new javax.swing.JLabel();
        btnNovoJogo = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Jogo da Velha");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn1.setFocusable(false);
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn2.setFocusable(false);
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn3.setFocusable(false);
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn4.setFocusable(false);
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn5.setFocusable(false);
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn6.setFocusable(false);
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn7.setFocusable(false);
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn8.setFocusable(false);
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn9.setFocusable(false);
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn7, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn6, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(btn9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn6, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(btn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn9, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(btn8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Placar do Jogo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        lblJogador1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblJogador1.setText("Jogador 1: ");

        lblNumVit1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNumVit1.setText("Número de Vitórias: 0");

        lblNumVit2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNumVit2.setText("Número de Vitórias: 0");

        lblJogador2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblJogador2.setText("Jogador 2: ");

        lblSimbolo1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSimbolo1.setText("Símbolo: X");

        lblSimbolo2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSimbolo2.setText("Símbolo: O");

        lblEmpate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblEmpate.setText("Número de Empates:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblJogador1)
                            .addComponent(lblNumVit1)
                            .addComponent(lblNumVit2)
                            .addComponent(lblJogador2)
                            .addComponent(lblSimbolo1)
                            .addComponent(lblEmpate)
                            .addComponent(lblSimbolo2))
                        .addGap(181, 181, 181))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblJogador1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNumVit1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSimbolo1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblJogador2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNumVit2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSimbolo2)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblEmpate)
                .addGap(20, 20, 20))
        );

        btnNovoJogo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNovoJogo.setText("Criar Novo Jogo");
        btnNovoJogo.setFocusable(false);
        btnNovoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoJogoActionPerformed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSair.setText("Fechar Jogo");
        btnSair.setFocusable(false);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNovoJogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNovoJogo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSair))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void JogadaAtual(){
        if(VezJogador2 == true){
            VezJogador1 = true;
            VezJogador2 = false;
        }
        else{
            VezJogador1 = false;
            VezJogador2 = true;
        }
        VerificaJogada("O");
        VerificaJogada("X");
    }
    
    public void VerificaJogada(String Jogada){
        
        // Verifica se alguem ganhou pela linha
        if(btn1.getText().equals(Jogada) && btn2.getText().equals(Jogada) && btn3.getText().equals(Jogada)){
            if(btn1.getText().equals("X")){
                Vencedor("j1");
            }
            else{
                Vencedor("j2");
            }
        }
        if(btn4.getText().equals(Jogada) && btn5.getText().equals(Jogada) && btn6.getText().equals(Jogada)){
            if(btn4.getText().equals("X")){
                Vencedor("j1");
            }
            else{
                Vencedor("j2");
            }
        }
        if(btn7.getText().equals(Jogada) && btn8.getText().equals(Jogada) && btn9.getText().equals(Jogada)){
            if(btn7.getText().equals("X")){
                Vencedor("j1");
            }
            else{
                Vencedor("j2");
            }
        }
        // Verifica se alguem ganhou pela coluna
        if(btn1.getText().equals(Jogada) && btn4.getText().equals(Jogada) && btn7.getText().equals(Jogada)){
            if(btn1.getText().equals("X")){
                Vencedor("j1");
            }
            else{
                Vencedor("j2");
            }
        }
        if(btn2.getText().equals(Jogada) && btn5.getText().equals(Jogada) && btn8.getText().equals(Jogada)){
            if(btn2.getText().equals("X")){
                Vencedor("j1");
            }
            else{
                Vencedor("j2");
            }
        }
        if(btn3.getText().equals(Jogada) && btn6.getText().equals(Jogada) && btn9.getText().equals(Jogada)){
            if(btn3.getText().equals("X")){
                Vencedor("j1");
            }
            else{
                Vencedor("j2");
            }
        }
        // Verifica se alguem ganhou pela diagonal
        if(btn1.getText().equals(Jogada) && btn5.getText().equals(Jogada) && btn9.getText().equals(Jogada)){
            if(btn1.getText().equals("X")){
                Vencedor("j1");
            }
            else{
                Vencedor("j2");
            }
        }
        if(btn3.getText().equals(Jogada) && btn5.getText().equals(Jogada) && btn7.getText().equals(Jogada)){
            if(btn3.getText().equals("X")){
                Vencedor("j1");
            }
            else{
                Vencedor("j2");
            }
        }
        
        // Verifica se o jogo empatou
        if(!btn1.getText().equals("") && !btn2.getText().equals("") && !btn3.getText().equals("")
        &&!btn4.getText().equals("") && !btn5.getText().equals("") && !btn6.getText().equals("")
        &&!btn7.getText().equals("") && !btn8.getText().equals("") && !btn9.getText().equals(""))
        {
            Vencedor("Empate");
        }
    
    }
    
    public void Zerar(){
           VezJogador1 = true;
           VezJogador2 = false;
           btn1.setText("");
           btn2.setText("");
           btn3.setText("");
           btn4.setText("");
           btn5.setText("");
           btn6.setText("");
           btn7.setText("");
           btn8.setText("");
           btn9.setText("");
    }
    
    public void Vencedor(String Vencedor){
        String sql= "";
        try {

            if(Vencedor.equals("Empate"))
            {
                JOptionPane.showMessageDialog(null, "Houve um Empate, nenhum jogador ganhou!","Fim da Rodada",JOptionPane.INFORMATION_MESSAGE);
                Empate++;
                lblEmpate.setText("Número de Empates: "+Empate);
                Zerar();
            }
            else 
            {
                
                if(Vencedor.equals("j1"))
                {
                    JOptionPane.showMessageDialog(null, "Parabéns " + tDefinirJogadores.Variaveis.nomeJogador1 + " !! você venceu a rodada!","Fim da Rodada",JOptionPane.INFORMATION_MESSAGE);
                    VitJogador1 = tDefinirJogadores.Variaveis.vitoriasJogador1 + 1;
                    tDefinirJogadores.Variaveis.vitoriasJogador1 = tDefinirJogadores.Variaveis.vitoriasJogador1 + 1;
                    lblNumVit1.setText("Número de Vitórias: " + VitJogador1);
                    VitJogador2 = tDefinirJogadores.Variaveis.vitoriasJogador2 - 1;
                    tDefinirJogadores.Variaveis.vitoriasJogador2 = tDefinirJogadores.Variaveis.vitoriasJogador2 - 1;
                    if(tDefinirJogadores.Variaveis.vitoriasJogador2 < 0)
                    {
                        tDefinirJogadores.Variaveis.vitoriasJogador2 = 0;
                    }
                    if(VitJogador2 < 0){
                        VitJogador2 = 0;
                    }
                    lblNumVit2.setText("Número de Vitórias: " + VitJogador2);
                    Zerar();
                }

                if(Vencedor.equals("j2"))
                {
                    JOptionPane.showMessageDialog(null, "Parabéns " + tDefinirJogadores.Variaveis.nomeJogador2 + " !! você venceu a rodada!","Fim da Rodada",JOptionPane.INFORMATION_MESSAGE);
                    VitJogador2 = tDefinirJogadores.Variaveis.vitoriasJogador2 + 1;
                    tDefinirJogadores.Variaveis.vitoriasJogador2 = tDefinirJogadores.Variaveis.vitoriasJogador2 + 1;
                    lblNumVit2.setText("Número de Vitórias: " + VitJogador2);
                    VitJogador1 = tDefinirJogadores.Variaveis.vitoriasJogador1 - 1;
                    tDefinirJogadores.Variaveis.vitoriasJogador1 = tDefinirJogadores.Variaveis.vitoriasJogador1 - 1;
                    if(tDefinirJogadores.Variaveis.vitoriasJogador1 < 0)
                    {
                        tDefinirJogadores.Variaveis.vitoriasJogador1 = 0;
                    }
                    if(VitJogador1 < 0){
                        VitJogador1 = 0;
                    }
                    lblNumVit1.setText("Número de Vitórias: " + VitJogador1);
                    Zerar();
                }    

                sql = "UPDATE Jogadores Set NumVitoria=" + VitJogador1 + " WHERE NomeJogador = '" + tDefinirJogadores.Variaveis.nomeJogador1 + "'" ;
                Statement stm = con.prepareStatement(sql);
                stm.execute(sql);
                
                sql = "UPDATE Jogadores Set NumVitoria=" + VitJogador2 + " WHERE NomeJogador = '" + tDefinirJogadores.Variaveis.nomeJogador2 + "'" ;
                stm = con.prepareStatement(sql);
                stm.execute(sql);
                
            }            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: "+e,"ERRO",JOptionPane.INFORMATION_MESSAGE);
        }
        
    }  
       
    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        try{
        Conexao.con.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnNovoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoJogoActionPerformed
        try{
        Conexao.con.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
        tDefinirJogadores tDefinirJogadores = new tDefinirJogadores();
        this.dispose();
        tDefinirJogadores.setVisible(true);
    }//GEN-LAST:event_btnNovoJogoActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        if(VezJogador2 == true){
            if(btn1.getText().equals("")){
                btn1.setText("O");
                JogadaAtual();
            }
        }
        else{
            if(btn1.getText().equals("")){
                btn1.setText("X");
                JogadaAtual();
            }
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        if(VezJogador2 == true){
            if(btn2.getText().equals("")){
                btn2.setText("O");
                JogadaAtual();
            }
        }
        else{
            if(btn2.getText().equals("")){
                btn2.setText("X");
                JogadaAtual();
            }
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        if(VezJogador2 == true){
            if(btn3.getText().equals("")){
                btn3.setText("O");
                JogadaAtual();
            }
        }
        else{
            if(btn3.getText().equals("")){
                btn3.setText("X");
                JogadaAtual();
            }
        }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        if(VezJogador2 == true){
            if(btn4.getText().equals("")){
                btn4.setText("O");
                JogadaAtual();
            }
        }
        else{
            if(btn4.getText().equals("")){
                btn4.setText("X");
                JogadaAtual();
            }
        }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        if(VezJogador2 == true){
            if(btn5.getText().equals("")){
                btn5.setText("O");
                JogadaAtual();
            }
        }
        else{
            if(btn5.getText().equals("")){
                btn5.setText("X");
                JogadaAtual();
            }
        }
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        if(VezJogador2 == true){
            if(btn6.getText().equals("")){
                btn6.setText("O");
                JogadaAtual();
            }
        }
        else{
            if(btn6.getText().equals("")){
                btn6.setText("X");
                JogadaAtual();
            }
        }
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        if(VezJogador2 == true){
            if(btn7.getText().equals("")){
                btn7.setText("O");
                JogadaAtual();
            }
        }
        else{
            if(btn7.getText().equals("")){
                btn7.setText("X");
                JogadaAtual();
            }
        }
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        if(VezJogador2 == true){
            if(btn8.getText().equals("")){
                btn8.setText("O");
                JogadaAtual();
            }
        }
        else{
            if(btn8.getText().equals("")){
                btn8.setText("X");
                JogadaAtual();
            }
        }
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        if(VezJogador2 == true){
            if(btn9.getText().equals("")){
                btn9.setText("O");
                JogadaAtual();
            }
        }
        else{
            if(btn9.getText().equals("")){
                btn9.setText("X");
                JogadaAtual();
            }
        }
    }//GEN-LAST:event_btn9ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tJogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnNovoJogo;
    private javax.swing.JButton btnSair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblEmpate;
    private javax.swing.JLabel lblJogador1;
    private javax.swing.JLabel lblJogador2;
    private javax.swing.JLabel lblNumVit1;
    private javax.swing.JLabel lblNumVit2;
    private javax.swing.JLabel lblSimbolo1;
    private javax.swing.JLabel lblSimbolo2;
    // End of variables declaration//GEN-END:variables
}
