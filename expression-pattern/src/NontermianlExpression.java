/**
 * @author xiaosen
 * @date 2019/6/25 16:05
 * @description
 */
public class NontermianlExpression extends Expression {

    public NontermianlExpression(Expression... expressions){
        // 每个非终结符表达式都会对其他表达式产生依赖
    }

    @Override
    public Object interpreter(Context context) {
        return null;
    }
}
