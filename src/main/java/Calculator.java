public class Calculator {
    public int sum(String expression){
        int sum = 0;
        for(String valueSum : expression.split("\\+"))
            sum += Integer.valueOf(valueSum);

        System.out.println(sum);
        return sum;
    }
}
