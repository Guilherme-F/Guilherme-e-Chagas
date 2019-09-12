
package Heranca;

import java.util.Date;

public class Heranca {
    public String nome;
    public String cpf;
    public Date data_nascimento;
    
    public Heranca(String _nome, String _cpf, Date _data) {
        this.nome = _nome;
        this.cpf = _cpf;
        this.data_nascimento = _data;
    }
   public class Aluno extends Heranca {
        private int senha;
        private int Alunos;

        public Aluno(String _nome, String _cpf, Date _data) {
            super(_nome, _cpf, _data);
        }

        public boolean senha(int senha) {
            if (this.senha == senha) {
                System.out.println("Acesso Permitido!");
                return true;
            } else {
                System.out.println("Acesso Negado!");
                return false;
            }
    
        }
   }
}