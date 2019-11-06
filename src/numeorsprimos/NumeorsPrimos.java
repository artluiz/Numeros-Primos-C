/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeorsprimos;

/**
 *
 * @author Luiz Arthur
 */
public class NumeorsPrimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int m=98;
        NumP vet[] = new NumP[m];
        
        for(int l=0;l<m;l++){
            vet[l] = new NumP(0);
        }
        
        int k=0;
        for(int i=2;i<100; i++){
            vet[k].setN(i);
            k++;
        }
        
        for(int i=2;i<m; i++){
            for (int j=2;j<vet[i].getN(); j++) {
                if (vet[i].getN()%j == 0){
                    vet[i].setNp(false);
                }
            }
        }
        
        for (int l=0;l<m;l++){
            if(vet[l].isNp()){
                System.out.println("O número "+vet[l].getN()+" é primo");
            }
        }
    }
    
}
