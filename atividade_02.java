

class vetor{

    private int[]v;
    private int n; 
    
    public  vetor(int tam){ 
        v =new int[tam];
        n=0;
    }
    public void inserir(int value){
        v[n]=value;
        n++;
    }

    public void Soma(){
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = v[i] +sum;             
        }

        System.out.println("Aquantidade de grãos é: " + sum);
        return;
    }

}



public class atividade_02 {
    public static void main(String[] args) {
        int size = 16;
        vetor board = new vetor(size);
        int grao = 2; 
        for (int i = 0; i < size; i++) {
            board.inserir(grao);
            int position = i + 1;
            System.out.println("Na casa: " + position + "\n" + grao + " grãos;\n");
            grao = grao * 2;
        }

        board.Soma();
    }
}
