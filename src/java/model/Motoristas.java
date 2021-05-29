

package model;
import java.util.Date;
/**
 *
 * @author Cabral
 */
public class Motoristas {
    private String cpf;
    private String nomeFantasia;
    private int rg;
    private String cnh;
    private String categoriaMotorista;
    private Date validadeCnh;
    private byte imagemCnh;
    private String endereco;
    private String fone;
    private String email;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getCategoriaMotorista() {
        return categoriaMotorista;
    }

    public void setCategoriaMotorista(String categoriaMotorista) {
        this.categoriaMotorista = categoriaMotorista;
    }

    public Date getValidadeCnh() {
        return validadeCnh;
    }

    public void setValidadeCnh(Date validadeCnh) {
        this.validadeCnh = validadeCnh;
    }

    public byte getImagemCnh() {
        return imagemCnh;
    }

    public void setImagemCnh(byte imagemCnh) {
        this.imagemCnh = imagemCnh;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Motoristas{" + "cpf=" + cpf + ", nomeFantasia=" + nomeFantasia + ", rg=" + rg + ", cnh=" + cnh + ", categoriaMotorista=" + categoriaMotorista + ", validadeCnh=" + validadeCnh + ", imagemCnh=" + imagemCnh + ", endereco=" + endereco + ", fone=" + fone + ", email=" + email + '}';
    }
    
    
    
    
    
    
}
