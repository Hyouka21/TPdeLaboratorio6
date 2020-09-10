
package tpdelaboratorio6;


public class Matriz {
      public void armar(){
      int mat[][];
      mat=new int[4][];
      mat[0]=new int[4];
      mat[1]=new int[3];
      mat[2]=new int [5];
      mat[3]=new int [2];
      mat[0][0]=3;
      mat[0][1]=6;
      mat[0][2]=9;
      mat[0][3]=12;
      mat[1][0]=15;
      mat[1][1]=18;
      mat[1][2]=21;
      mat[2][0]=24;
      mat[2][1]=27;
      mat[2][2]=30;
      mat[2][3]=33;
      mat[2][4]=36;
      mat[3][0]=39;
      mat[3][1]=42;
      System.out.print("Pares de la fila 1:  ");
      for(int x=0;x<mat[0].length;x++){
      if(mat[0][x]%2==0){System.out.print(mat[0][x]+" ");}
          }
            System.out.print("\nPares de la fila 2:  ");
      for(int x=0;x<mat[1].length;x++){
      if(mat[1][x]%2==0){System.out.print(mat[1][x]+" ");}
          }
            System.out.print("\nPares de la fila 3:  ");
      for(int x=0;x<mat[2].length;x++){
      if(mat[2][x]%2==0){System.out.print(mat[2][x]+" ");}
          }
            System.out.print("\nPares de la fila 4:  ");
      for(int x=0;x<mat[3].length;x++){
      if(mat[3][x]%2==0){System.out.print(mat[3][x]+" ");}
          }
      System.out.print("\n");
      }
}

