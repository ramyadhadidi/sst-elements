package gov.sandia.sst.oberon.compiler.exp;

import gov.sandia.sst.oberon.compiler.stmt.OberonStatementException;
import gov.sandia.sst.oberon.compiler.visitor.OberonExpressionVisitor;

public class OberonSubExpression extends
		OberonBinaryMathematicalExpression {

	public OberonSubExpression(String fileName, int lineNo, int colNo,
			OberonExpression onLeft, OberonExpression onRight) {
		super(fileName, lineNo, colNo, onLeft, onRight);
	}

	public void processVisitorTarget(OberonExpressionVisitor expVisit)
			throws OberonStatementException, OberonExpressionException {
		expVisit.visit(this);
	}

}
