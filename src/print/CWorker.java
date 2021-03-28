package print;


public class CWorker {
    int wolne;
    int dni_wol_pod_rzad=0;
    int dni_prac_pod_rzad=0;
    boolean must=false;
    
    public CWorker(int wol){
        wolne=wol;
    }
    
    public void check_prac(){
        if(dni_prac_pod_rzad>4){
            must=true;
        }
    }
    
    public void check_wol(){
        if(dni_wol_pod_rzad==2){
            must=true;
        }
    }
    
    public void zero_wol(){
        dni_wol_pod_rzad=0;
    }
    
    public void zero_prac(){
        dni_prac_pod_rzad=0;
    }
}
