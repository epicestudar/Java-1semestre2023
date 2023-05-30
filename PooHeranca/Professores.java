package PooHeranca;

public class Professores extends Pessoas {
    //subclasse de pessoas
    // atributos específicos
    private String materia;
    private int salario;

    // métodos
    public String getMateria() {
        return materia;
    }
    public void setMateria(String materia) {
        this.materia = materia;
    }
    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }
    @Override
    public void setRg() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setRg'");
    }

    
}
