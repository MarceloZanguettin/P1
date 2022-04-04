public class CommoditiesBrasileiras {
    
    public static void main (String[] args){
        String commoditie[] = new String [5];
        commoditie[0] = "Soja em grãos Sc 60 kg";
        commoditie[1] = "Trigo em grãos nacional" ;
        commoditie[2] = "Milho seco Sc 60 kg";
        commoditie[3] = "Café Arábica Tipo 6 Sc 60Kg";
        commoditie[4] = "Carne Bonvina (Arroba do boi gordo 15kg)";
        double preco[] = new double [5];
        preco[0] = 179.88;
        preco[1] = 96.60;
        preco[2] = 96.00;
        preco[3] = 1292.00;
        preco[4] = 313.00;
        for (int i = 0; i< commoditie.length ; i++){
            System.out.println("A commoditie agricola brasileira "+(commoditie[i])+" tem o preço de "+(preco[i])+" reais.");
        }
    }
}
