
package tpdelaboratorio6;


public class Matriz {
      public void armar(){
      int mat[][];
      int contador=0;
      int cFila=1;
      mat=new int[4][];
      mat[0]=new int[4];
      mat[1]=new int[3];
      mat[2]=new int [5];
      mat[3]=new int [2];
for(int z=0;z<4;z++){
    for(int m=0;m<mat[z].length;m++){
        mat[z][m]=(contador+=3);
    }
}
for(int v=0;v<4;v++){
    System.out.print("Numeros pares de la fila "+(cFila++)+": ");
      for(int x=0;x<mat[v].length;x++){
      if(mat[v][x]%2==0){System.out.print(mat[v][x]+" ");}
          }
      System.out.println("");
        }
      }
}

