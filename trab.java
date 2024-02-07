import java.util.Scanner;
    public class Trab {
          public static void main(String[] args) {
              Scanner input = new Scanner(System.in);
              byte hora, minutos , segundos;
              // Hora pelo usuario 
          do { 
              System.out.println("Escreva a hora(0-23): ");
              hora = input.nextByte();
          } while ((hora<0)||(hora>23));
              // minutos pelo usuario 
          do {
              System.out.println("Escreve os minutos(0-59): ");
              minutos= input.nextByte();
              } while ((minutos<0)||(minutos>59));
              // segundos pelo usuario 
              do {
                  System.out.println("Escreva os segundos(0-59): ");
                  segundos= input.nextByte();
              } while ((segundos<0)||(segundos>59));
              
              // formato 
              String  horaformatada = hora < 10 ? "0" + hora : "" + hora ;
              String  minutosformatados = minutos < 10 ? "0" + minutos : "" + minutos;
              String  segundosformatados = segundos < 10 ? "0" + segundos : "" + segundos;
              
System.out.println("hora digitada:" + horaformatada + ":" + minutosformatados + ":" + segundosformatados + ":");
System.out.println("hora por exteçao:"+ horaformatada + "h" + minutosformatados + "min" + segundosformatados + "seg");
          }
              }