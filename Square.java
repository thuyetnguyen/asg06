
public class Square implements Expression{
	private Expression expression;
	
	public Square(Expression ex){
		expression = ex;
	}
	
	@Override
	public int evaluate(){
		return expression.evaluate();
	}
	
	@Override
	public String toString(){
		return String.format("%d %s", expression.evaluate(),"^2");
	}
}
