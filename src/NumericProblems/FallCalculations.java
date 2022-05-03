//package NumericProblems;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static java.lang.Math.pow;
//import static java.lang.Math.sqrt;
//
//public class FallCalculations {
//    private void predictFallOrNormal(String[] str){
////        String [][] output = new String[str.length][];
////        int j = 0;
////        for(int i=0; i<str.length; i++){
////            output[i][j] = String.valueOf(str[i].split(" "));
////            j++;
////        }
////        float [] X = new float[str.length];
////        float [] Y = new float[str.length];
////        float [] Z = new float[str.length];
////        double[] magnitude = new double[str.length];
////        double [] ymag = new double[str.length];
////        double [] TA = new double[str.length];
////        for(int i =0; i<str.length; i++){
////            X[i] = float.parseFloat(output[i][2]);
////            Y[i] = Double.parseDouble(output[i][3]);
////            Z[i] = Double.parseDouble(output[i][4]);;
////
////
//////        }
////        for(int i =0; i<str.length; i++){
////            float x = X[i];
////            float y = Y[i];
////            float z = Z[i];
////            magnitude[i] = magnitude(x,y,z);
////        }
////        for(int i = 0; i<str.length; i++){
////            ymag[i] = (Y[i])/Math.sqrt(magnitude[i]);
////        }
////        for(int i=0; i<str.length; i++){
////            TA[i] = Math.asin(Math.toRadians(ymag[i]));
////        }
//        float averageX = calMean(X);
//        float averageY = calMean(Y);
//        float averageZ = calMean(Z);
//        double medianX = calMedian(X.length, X);
//        double medianY = calMedian(Y.length, Y);
//        double medianZ = calMedian(Z.length, Z);
//        double stdX = calStd(X);
//        double stdY = calStd(Y);
//        double stdZ = calStd(Z);
//        float skewX = calSkew(X, X.length);
//        float skewY = calSkew(Y, Y.length);
//        float skewZ = calSkew(Z, Z.length);
//        double kurtX = calKurtosis(X,X.length);
//        double kurtY = calKurtosis(Y,Y.length);
//        double kurtZ = calKurtosis(Z,Z.length);
//        double minX = minValue(X);
//        double minY = minValue(Y);
//        double minZ = minValue(Z);
//        double maxX = maxValue(X);
//        double maxY = maxValue(Y);
//        double maxZ = maxValue(Z);
//        double slope = calSlope(minX, maxX,minY,maxY, minZ, maxZ);
//        double meanTA = calMean(TA);
//        double stdTA = calStd(TA);
//        double skewTA = calSkew(TA, TA.length);
//        double kurtosisTA = calKurtosis(TA, TA.length);
//        double absX = absValue(X);
//        double absY = absValue(Y);
//        double absZ = absValue(Z);
//        double abs_meanX =meanAbs(X);
//        double abs_meanY =meanAbs(Y);
//        double abs_meanZ =meanAbs(Z);
//        double abs_medianX = medianAbs(X.length, X);
//        double abs_medianY = medianAbs(Y.length, Y);
//        double abs_medianZ = medianAbs(Z.length, Z);
//        double abs_stdX = stdAbs(X);
//        double abs_stdY = stdAbs(Y);
//        double abs_stdZ = stdAbs(Z);
//        double abs_skewX = skewAbs(X, X.length);
//        double abs_skewY = skewAbs(Y, Y.length);
//        double abs_skewZ = skewAbs(Z, Z.length);
//        double abs_kurtX = kurtAbs(X, X.length);
//        double abs_kurtY = kurtAbs(Y, Y.length);
//        double abs_kurtZ = kurtAbs(Z, Z.length);
//        double abs_minX = absMinValue(X);
//        double abs_minY = absMinValue(Y);
//        double abs_minZ = absMinValue(Z);
//        double abs_maxX = absMaxValue(X);
//        double abs_maxY = absMaxValue(Y);
//        double abs_maxZ = absMaxValue(Z);
//        double abs_slope = calSlope(abs_minX, abs_maxX, abs_minY, abs_maxY, abs_minZ, abs_maxZ);
//        double mean_magnitude = calMean(magnitude);
//        double std_magnitude = calStd(magnitude);
//        double min_mag = minValue(magnitude);
//        double max_mag = maxValue(magnitude);
//        double diffMinMaxMag = max_mag - min_mag;
//        double zcr_Mag = 0;
//        double avgResAcc = (1/magnitude.length)*(calSum(magnitude));
//        List<Double> feature = new ArrayList<>();
//        // Average values
////        feature.add(averageX);
////        feature.add(averageY);
////        feature.add(averageZ);
//
//        // Median values
//        feature.add(medianX);
//        feature.add(medianY);
//        feature.add(medianZ);
//
//        // Standard Deviation values
//        feature.add(stdX);
//        feature.add(stdY);
//        feature.add(stdZ);
//
////        // Skew values
////        feature.add(skewX);
////        feature.add(skewY);
////        feature.add(skewZ);
//
//        // Kurtosis values
//        feature.add(kurtX);
//        feature.add(kurtY);
//        feature.add(kurtZ);
//
//        // min values
//        feature.add(minX);
//        feature.add(minY);
//        feature.add(minZ);
//
//        // max values
//        feature.add(maxX);
//        feature.add(maxY);
//        feature.add(maxZ);
//
//        // slope value
//        feature.add(slope);
//
//        // calculations related to TA
//
//        feature.add(meanTA);
//        feature.add(stdTA);
//        feature.add(skewTA);
//        feature.add(kurtosisTA);
//
//        // absolute values
//
//        feature.add(absX);
//        feature.add(absY);
//        feature.add(absZ);
//        feature.add(abs_meanX);
//        feature.add(abs_meanY);
//        feature.add(abs_meanZ);
//        feature.add(abs_medianX);
//        feature.add(abs_medianY);
//        feature.add(abs_medianZ);
//        feature.add(abs_stdX);
//        feature.add(abs_stdY);
//        feature.add(abs_stdZ);
//        feature.add(abs_skewX);
//        feature.add(abs_skewY);
//        feature.add(abs_skewZ);
//        feature.add(abs_kurtX);
//        feature.add(abs_kurtY);
//        feature.add(abs_kurtZ);
//        feature.add(abs_minX);
//        feature.add(abs_minY);
//        feature.add(abs_minZ);
//        feature.add(abs_maxX);
//        feature.add(abs_maxY);
//        feature.add(abs_maxZ);
//        feature.add(abs_slope);
//
//        // magnitude and remaining features
//        feature.add(mean_magnitude);
//        feature.add(std_magnitude);
//        feature.add(min_mag);
//        feature.add(max_mag);
//        feature.add(diffMinMaxMag);
//        feature.add(zcr_Mag);
//        feature.add(avgResAcc);
//
//        List<List<Double>> features = new ArrayList<>();
//        features.add(feature);
//    }
//    // add array elements
//    public static double calSum(double[] arr){
//        double sum =0;
//        for(int i =0; i<arr.length; i++){
//            sum+=arr[i];
//        }
//        return sum;
//    }
//    // Calculate Average of array
//    public static float calMean(float[] arr){
//        float average = 0;
//        float sum = 0;
//        int length = arr.length;
//        for(int i =0; i<arr.length; i++){
//            sum+=arr[i];
//        }
//        average = sum/length;
//        return average;
//    }
//
//    // Calculate median of array
//    public static double calMedian(int n, double[] arr){
//        double median=0;
//        int m = 0;
//        if(n%2==1)
//        {
//            m=(int)((n+1/2)-1);
//
//        }
//        else
//        {
//            m=(int)(((int)(n/2-1)+ (int)(n/2))/2);
//
//        }
//        median = arr[m];
//        return median;
//    }
//
////    // calculate standard deviation of array
////
////    public static double calStd(double[] arr){
////        double standardDeviation = 0.0;
////        int length = arr.length;
////        double mean = calMean(arr);
////
////        for(double num: arr) {
////            standardDeviation += Math.pow(num - mean, 2);
////        }
////
////        return Math.sqrt(standardDeviation/length);
////    }
//
//    //calculate skew of an array
//    public static float calSkew(float [] arr, int n)
//    {
////        // Find skewness using above formula
////        double sum = 0;
////        for (int i = 0; i < n; i++){
////            sum = ((arr[i] - calMean(arr)) * (arr[i] - calMean(arr)) * (arr[i] - calMean(arr)));
////        }
////        return sum / (n * calStd(arr) *
////                calStd(arr) *
////                calStd(arr) *
////                calStd(arr));
////        float m = 1/(n)*()
//        float sum3 = 0;
//        for(int i =0; i<n; i++){
//            sum3 += Math.pow(arr[i]-calMean(arr),3);
//        }
//        float m3 = (1/n)*sum3;
//        float sum2 = 0;
//        for(int i =0; i<n; i++){
//            sum2 += Math.pow(arr[i]-calMean(arr),2);
//        }
//
//        float m2 = (1/n)*sum2;
//
//        float skewness = (float) (m3/Math.pow(m2,3/2));
//
//
//
//        return skewness;
//
//    }
//
//    //calculate kurtosis of an array
////    public static double calKurtosis(double[] arr, int n){
////        double secondMoment = 0;
////        double fourthMoment = 0;
////        double kurt =0;
////        float secSum =0;
////        float forSum = 0;
////        double mean = calMean(arr);
////        for(int i = 0; i<n; i++){
////            secSum += Math.pow(arr[i]-mean,2);
////        }
////        secondMoment = secSum/n;
////        for(int i =0; i<n; i++){
////            forSum+= Math.pow(arr[i]-mean,4);
////        }
////        fourthMoment = forSum/n;
////        kurt = fourthMoment/Math.pow(secondMoment,2);
////        return kurt;
////    }
////    // calculation magnitude of an array
////    public static double magnitude(double x, double y, double z){
////        return (Math.sqrt(x*x+y*y+z*z));
////    }
////    // calculate minimum value in array
////    public static double minValue(double[] arr){
////        double min = arr[0];
////        for(int i =1; i<arr.length; i++){
////            if(arr[i]<min){
////                min = arr[i];
////            }
////        }
////        return min;
////    }
////    // calculate maximum value in array
////    public static double maxValue(double[] arr){
////        double max = arr[0];
////        for(int i =1; i<arr.length; i++){
////            if(arr[i]>max){
////                max = arr[i];
////            }
////        }
////        return max;
////    }
////
////    // calculate absolute value
////    public static double absValue(double[] arr){
////        double sum =0;
////        for(int i =0; i<arr.length; i++){
////            double num = Math.abs(arr[i]-calMean(arr));
////            sum +=num;
////        }
////        return sum/arr.length;
////    }
////    // Absolute mean value
////    public static double meanAbs(double[] arr){
////        double sum =0;
////        for(int i =0; i<arr.length; i++){
////            sum+=Math.abs(arr[i]);
////        }
////        return sum/arr.length;
////    }
////
////    // Absolute median value
////    public static double medianAbs(int n, double[] arr) {
////        double median = 0;
////        int m = 0;
////        if (n % 2 == 1) {
////            m = (int) ((n + 1 / 2) - 1);
////
////        } else {
////            m = (int) (((int) (n / 2 - 1) + (int) (n / 2)) / 2);
////
////        }
////
////        return Math.abs(arr[m]);
////
////    }
////    // Absolute standard deviation value
////    public static double stdAbs(double[] arr){
////        double standardDeviation = 0.0;
////        int length = arr.length;
////        double mean = meanAbs(arr);
////
////        for(double num: arr) {
////            standardDeviation += Math.pow(Math.abs(num) - mean, 2);
////        }
////
////        double std = Math.sqrt(standardDeviation/length);
////        return std;
////    }
////    // Absolute skew value
////    public static double skewAbs(double [] arr, int n) {
////        // Find skewness using above formula
////        double sum = 0;
////        for (int i = 0; i < n; i++){
////            sum = ((Math.abs(arr[i]) - meanAbs(arr)) * (Math.abs(arr[i]) - meanAbs(arr)) * (Math.abs(arr[i]) - meanAbs(arr)));
////        }
////        return sum / (n * stdAbs(arr) *
////                stdAbs(arr) *
////                stdAbs(arr) *
////                stdAbs(arr));
////
////    }
////    // Absolute kurtosis value
////    public static double kurtAbs(double[] arr, int n){
////        double secondMoment = 0;
////        double fourthMoment = 0;
////        double kurt =0;
////        float secSum =0;
////        float forSum = 0;
////        double mean = meanAbs(arr);
////        for(int i = 0; i<n; i++){
////            secSum += Math.pow(Math.abs(arr[i])-mean,2);
////        }
////        secondMoment = secSum/n;
////        for(int i =0; i<n; i++){
////            forSum+= Math.pow(Math.abs(arr[i])-mean,4);
////        }
////        fourthMoment = forSum/n;
////        kurt = fourthMoment/Math.pow(secondMoment,2);
////        return kurt;
////    }
////
////    // calculate absolute minimum value in array
////    public static double absMinValue(double[] arr){
////        double min = Math.abs(arr[0]);
////        for(int i =1; i<arr.length; i++){
////            if(Math.abs(arr[i])<min){
////                min = Math.abs(arr[i]);
////            }
////        }
////        return min;
////    }
////    // calculate absolute maximum value in array
////    public static double absMaxValue(double[] arr){
////        double max = Math.abs(arr[0]);
////        for(int i =1; i<arr.length; i++){
////            if(Math.abs(arr[i])>max){
////                max = Math.abs(arr[i]);
////            }
////        }
////        return max;
////    }
////
////// calculating slope
////    public static double calSlope(double xmin, double xmax,double ymin,double ymax, double zmin, double zmax){
////        return Math.sqrt(Math.pow(xmax-xmin,2 )+Math.pow(ymax-ymin,2 )+Math.pow(zmax-zmin,2 ));
////    }
////
////    private double doInference(float age, float gender, float bmi, float children, float smoker, float region_val) {
////        float[][] inputVal = {{age},{gender},{bmi},{children},{smoker},{region_val}};
////        float[][] output= new float[1][1];
////        // tflite.run(inputVal,output);
////        float inferredValue= (float) (output[0][0] * sqrt(1.43451672 * pow(10,8)) + 13092.01280714);
////        return  inferredValue;
////    }
//    public static void main(String[] args){
//        FallCalculations obj = new FallCalculations();
//        float arr[] = {26,12,16,56,112, 24};
//        System.out.println(calMean(arr));
////        System.out.println(calStd(arr));
//        System.out.println(calSkew(arr,arr.length));
////        System.out.println(calKurtosis(arr,arr.length));
//    }
//}
