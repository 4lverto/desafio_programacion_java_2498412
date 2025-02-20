package video04;

public enum Premio {
    PEDREA(1000,15), // 1787
    QUINTOS(5000,8),
    CUARTOS(10000,2),
    TERCER(50000,1),
    SEGUNDO(100000,1),
    GORDO(1000000,1);
    
    private int premioPorEuro;
    private int numPremios;
    
    Premio(int ppe, int np){
        this.premioPorEuro=ppe;
        this.numPremios=np;
    }

    public int getPremioPorEuro() {
        return premioPorEuro;
    }

    public int getNumPremios() {
        return numPremios;
    }
    
    
}
