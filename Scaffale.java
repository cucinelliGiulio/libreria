class Scaffale{
    private String id;
    private libro[] libri;
    private int nLibri;
    private final int N = 10;
    
    Scaffale(String id){
        this.id = id;
        libri = new libro[N];
        nLibri = 0;
    }
    
    public boolean aggiungi(libro l){
        if (nLibri<N){
            libri[nLibri] = l;
            nLibri++;
            return true;
        }
        return false;
    }
    
    public void elencaLibri(){
        System.out.println("Scaffale: " + id);
        for(libro l: libri){
            System.out.println(l);
        }
    }
}