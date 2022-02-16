public class ExperimentalFarm{

    private Plot[][] farmPlots;

    public ExperimentalFarm(Plot[][] p){
        this.farmPlots = p;
    }

    public Plot getHighestYield(String c){
        int m = farmPlots[0].length;
        int max_yield = 0;
        Plot p = null;
        for (Plot[] farmPlot : farmPlots){
            for (int j = 0; j < m; j++) {
                if (farmPlot[j].getCropType().equals(c) && farmPlot[j].getCropYield() > max_yield) {
                    max_yield = farmPlot[j].getCropYield();
                    p = farmPlot[j];
                }
            }
        }
        return p;
    }

    public boolean sameCrop(int col){
        int n = farmPlots.length;
        for (int i = 1; i < n; i++){
            if (farmPlots[i][col] != farmPlots[i][0]){
                return false;
            }
        }
        return true;
    }
}