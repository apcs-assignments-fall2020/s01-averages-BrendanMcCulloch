public class MyMain {

    // Returns the mean of the 2D array mat
    public static double mean(double[][] mat) {
        double c = 0; 
        for (int row = 0; row < mat.length; row++){
            for(int col = 0; col < mat[0].length; col++){
                c = c + mat[row][col];
                int j = c/(mat.length * mat[0].length);
            }
        }
        return j;
    }

    // Returns the median of the 2D array mat
    public static double median(double[][] mat) { 
        double[] order = new double[mat.length * mat[0].length];
        int j = 0;
        int h = 0;
        for (int row = 0; row < mat.length; row++){
            for (int col = 0; col < mat[0].length; col++){
                 order[j] = mat[row][col];
                 j++;
                 
            }
        }
        for (int i = 0; i < order.length; i++){
            if (order[h] > order[h+1]){
                h++;
                return order[order.length/2];
            }
            if (order[h] < order[h+1]){
                order[h+1] = order[h];
                order[h] = order[h+1];
                h++;
                return order[order.length/2];
            }

            
        }
    }
    

    // Returns the mode of the 2D array mat
    public static double mode(double[][] mat) {
        double[] single = new double[mat.length * mat[0].length];
        int c = 0;
        int j = 0;
        for (int row = 0; row < mat.length; row++){
            for (int col = 0; col < mat[0].length; col++){
                single[c] = mat[row][col];
                c++;

            }

        }
        for (int i = 0; i < single.length; i++){
            if (single[i] = single[i+1]){
                j++;
            }

        } 
        return j;
    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}
