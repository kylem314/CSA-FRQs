// FRQ 6 Question 2

class Payroll {
    private int[] itemsSold = {48, 50, 37, 62, 38, 70, 55, 37, 64, 60}; // number of items sold by each employee
    private double[] wages;

    public Payroll(int[] x){
        itemsSold = x;
        wages = new double[itemsSold.length];

    }

    public void printwages(){
        for (int i = 0; i < wages.length ; i++){
            System.out.println("$" + wages[i] + "0");
        }
    }

    public double computeBonusThreshold(){

        int temp;

        double totalSales = 0;
        for (int i : itemsSold){
            totalSales += i;
        }

        for(int i = 0; i< itemsSold.length; i++){
            for(int x = i + 1; x < itemsSold.length; x++){
                if (itemsSold[x] < itemsSold[i]){
                    temp = itemsSold[i];
                    itemsSold[i] = itemsSold[x];
                    itemsSold[x] = temp;
                }
            }
        }

        return ((int)(totalSales - itemsSold[0] - itemsSold[itemsSold.length-1]) / ((itemsSold.length)-2)) + 0.5;
    }

    public void computeWages(double fixedWage, double perItem){
        double threshold = computeBonusThreshold();
        double bonus = 1.1;

        for (int n = 0; n < wages.length; n++){
            wages[n] = fixedWage + (perItem * itemsSold[n]);
            wages[n] = (int)wages[n];
            if(itemsSold[n] - threshold > 0){
                wages[n] = wages[n] * bonus;
            }
        }
    }}