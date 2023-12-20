public class SortContext {
    private SortingStrategy strategy;

    public SortContext(SortingStrategy strategy){
        this.strategy = strategy;
    }

    public void executeStrategy(int[] array){
        strategy.sort(array);
    }
}
