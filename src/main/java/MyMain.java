public class MyMain {

    // Returns the mean of the 2D array mat
    public static double mean(double[][] mat) {
        double c = 0; 
        for (int row = 0; row < mat.length; row++){
            for(int col = 0; col < mat[0].length; col++){
                c = c + mat[row][col];
            }
        }
        double j = c/(mat.length * mat[0].length);
        return j;
    }

    // Returns the median of the 2D array mat
    public static double median(double[][] mat) { 
        double[] order = new double[mat.length * mat[0].length];
        int j = 0;
        int h = order.length/2;
        
        for (int row = 0; row < mat.length; row++){
            for (int col = 0; col < mat[0].length; col++){
                 order[j] = mat[row][col];
                 j++;
                 
            }
        }
        if (order.length % 2 == 0){
            double o = (order[h] + order[h-1])/2;
            return o;
        }
        else {
            return order[h];
        }

    }
    

    // Returns the mode of the 2D array mat
    public static double mode(double[][] mat) {
        double[] single = new double[mat.length * mat[0].length];
        int c = 0;
        int j = 1;
        int most = 0;
        double mostnumber = 0;
        for (int row = 0; row < mat.length; row++){
            for (int col = 0; col < mat[0].length; col++){
                single[c] = mat[row][col];
                c++;

            }

        }
        for (int i = 0; i < single.length - 1; i++){
            if (single[i] == single[i+1]){
                j++;
                if (j > most){
                    most = j;
                    mostnumber = single[i];
                }
            }
            else{
                j = 1;
            }

        } 
        return mostnumber;
    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}
