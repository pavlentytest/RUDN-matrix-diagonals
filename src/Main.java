public class Main {

    public static void main(String[] args) {

        int[][] x = { {5,6,7}, {5,1,3}, {7,8,9}};
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==j)
                    System.out.print(x[i][j] + " ");
            }
        }

        System.out.println();
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                // побочная диагональ i+j = n - 1
                if(i+j == 3 - 1)
                    System.out.print(x[i][j] + " ");
            }
        }

        System.out.println();
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                // элементы выше главной диагонали
                if(i<j)
                    System.out.print(x[i][j] + " ");
            }
        }
        System.out.println();
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                // элементы ниже главной диагонали
                if(i>j)
                    System.out.print(x[i][j] + " ");
            }
        }

        System.out.println();
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                // элементы ниже побочной диагонали
                if(i+j > 2)
                    System.out.print(x[i][j] + " ");
            }
        }

        System.out.println();
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                // элементы выше побочной диагонали
                if(i+j < 2)
                    System.out.print(x[i][j] + " ");
            }
        }






    }
}
