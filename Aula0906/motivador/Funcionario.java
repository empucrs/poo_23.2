public class Funcionario{
    public static final double LIM_ISENCAO_IR = 2000;
    private String matricula;
    private String nome;
    private double salarioBruto;
    // Categorias aceitas: "risco", "normal" e "pesquisador"
    private String categoria;
    // Niveis aceitaveis neste momento:1, 2 ou 3;
    // somente é válido para pesquisador;
    private int nivel;
    
    public Funcionario(String matricula, String nome, double salarioBruto){
        this.matricula = matricula;
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.categoria="normal";
    }

    public Funcionario(String matricula, String nome, double salarioBruto, String categoria){
        if((categoria!=null) && (categoria.trim().toLowerCase().equals("risco")))
            this.categoria="risco";
        else    
            this.categoria="normal";

        this.matricula = matricula;
        this.nome = nome;        
        this.salarioBruto = salarioBruto;
    }

    public Funcionario(String matricula, String nome, double salarioBruto, int nivel){
        this.categoria="pesquisador";
        if(nivel>=1 && nivel<=3)
            this.nivel=nivel;
        else
            this.nivel=1;

        this.matricula = matricula;
        this.nome = nome;        
        this.salarioBruto = salarioBruto;
    }

    public void setNivel(int nivel){
        if((this.categoria.equals("pesquisador")) && ((nivel>=1) && (nivel<=3)))
            this.nivel=nivel;
    }

	public String getCategoria() {
        return this.categoria;
    }
    
    public String getMatricula() {
		return this.matricula;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public double getSalarioBruto() {
		return this.salarioBruto;
	}
    
    public double getINSS(){
        return this.salarioBruto*0.1;
    }

    public double getImpRenda(){

        double salarioBase=salarioBruto+getAdicional();


        if (salarioBase <= LIM_ISENCAO_IR){
            return 0.0;
        }else{
            double aux = salarioBase - LIM_ISENCAO_IR;
            double ir = aux * 0.2;
            return ir;
        }
    }

    public double getSalarioLiquido(){
        return salarioBruto - getINSS() - getImpRenda() + getAdicional();
    }

    public double getAdicional(){
        if(this.categoria.equals("risco"))
            return (salarioBruto - getINSS()) *0.25;
        else
            return 0.0;
    }

    public double getBonus(){
        if(this.categoria.equals("pesquisador")){
            double bonus=0.0;
            switch(this.nivel){
                case 1:
                    bonus=getSalarioLiquido()*0.05;
                    break;
                case 2:
                    bonus=getSalarioLiquido()*0.1;
                    break;
                case 3:
                    bonus=getSalarioLiquido()*0.2;
                    break;
                default: 
                    bonus=0.0;
            }
            return bonus;
        }
        return 0.0;
    }



    public String toString() {
        String aux = "";
        aux += "Categoria: "+this.getClass().getName()+" "+this.categoria+"\n";
        if(this.categoria.equals("pesquisador"))
            aux+="Nivel: "+this.nivel+"\n";
        aux += "Matricula: "+this.getMatricula()+"\n";
        aux += "Nome: "+this.getNome()+"\n";
        aux += "Salario bruto: "+this.getSalarioBruto()+"\n";
        aux += "(+) ADICIONAL: "+this.getAdicional()+"\n";
        aux += "(+) BONUS: "+this.getBonus()+"\n";
        aux += "(-) INSS: "+this.getINSS()+"\n";
        aux += "(-) IR: "+this.getImpRenda()+"\n";
        aux += "Salario liquido: "+this.getSalarioLiquido()+this.getBonus()+"\n";
        aux += "----------";
        return aux;    
    }
}