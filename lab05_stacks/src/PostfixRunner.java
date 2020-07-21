public class PostfixRunner {
    public static void main(String[] args){
        PostFix test = new PostFix("2 7 + 1 2 + +");
        test.solve();
        System.out.println(test.getExpression()+" = "+test);
        test.setExpression("1 2 3 4 + + +");
        test.solve();
        System.out.println(test.getExpression()+" = "+test);
        test.setExpression("9 3 * 8 / 4 +");
        test.solve();
        System.out.println(test.getExpression()+" = "+test);
        test.setExpression("3 3 + 7 * 9 2 / +");
        test.solve();
        System.out.println(test.getExpression()+" = "+test);
        test.setExpression("9 3 / 2 * 7 9 * + 4 -");
        test.solve();
        System.out.println(test.getExpression()+" = "+test);
        test.setExpression("5 5 + 2 * 4 / 9 +");
        test.solve();
        System.out.println(test.getExpression()+" = "+test);
    }
}
