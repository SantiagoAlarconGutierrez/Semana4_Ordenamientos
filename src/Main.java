import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

         Integer[] numeros=new Integer[101];

        for (Integer indice=0; indice<numeros.length; indice++){
            numeros[indice]= new Random().nextInt(numeros.length);
        }
        System.out.println(Arrays.toString(numeros));

        for(Integer i=0; i<100; i++){
            for(Integer j=0; j<100; j++){
                if(numeros[j]>numeros[j+1]){
                    Integer temp=numeros[j];
                    numeros[j]=numeros[j+1];
                    numeros[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(numeros));
        System.out.println(numeros.length);
        System.out.println(System.nanoTime()/0.000000001);
    }
}