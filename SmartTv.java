public class SmartTv {

    public boolean ligada = false;
    public int canal = 1;
    public int volume = 25;

    public void ligar(){
        ligada=true;

    }
   public void desligar(){
        ligada=false;
        
    }

    public void aumentarvolume(){
        volume++;
        System.err.println("Aumentando o Volume para: " + volume);

    {

     }  

    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        
    }  
    public void diminuirvolume(){
        volume--;
        System.out.println("Diminuindo o Volume para: " + volume);
    }

    public void aumentarCanal(){
        canal++;

    }
    public void diminuirCanal(){
        canal--;

    }





}


