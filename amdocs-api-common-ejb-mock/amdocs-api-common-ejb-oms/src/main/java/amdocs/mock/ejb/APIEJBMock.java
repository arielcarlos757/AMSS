package amdocs.mock.ejb;

import javax.ejb.EJBException;
import javax.ejb.EJBHome;
import javax.ejb.EJBMetaData;
import javax.ejb.EJBObject;
import javax.ejb.Handle;
import javax.ejb.HomeHandle;
import javax.ejb.RemoveException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

public class APIEJBMock implements EJBHome, SessionBean, EJBObject {

	private static final long serialVersionUID = -3L;
	
//	private static ILogger logger = PragmaLogger.getLogger(APIEJBMock.class.getName());

	@Override
	public EJBMetaData getEJBMetaData() {
		return null;
	}

	@Override
	public HomeHandle getHomeHandle() {
		return null;
	}

	@Override
	public void remove(Handle arg0) throws RemoveException {
		
	}

	@Override
	public void remove(Object arg0) throws RemoveException {
		
	}

	public void ejbCreate() throws EJBException {
//		logger.debug(this.getClass().getName(), ".ejbCreate();");
	}

	@Override
	public void ejbActivate() throws EJBException {
//		logger.debug(this.getClass().getName(), ".ejbActivate();");
	}

	@Override
	public void ejbPassivate() throws EJBException {
//		logger.debug(this.getClass().getName(), ".ejbPassivate();");
	}

	@Override
	public void ejbRemove() throws EJBException {
//		logger.debug(this.getClass().getName(), ".ejbRemove();");
	}

	@Override
	public void setSessionContext(SessionContext arg0) throws EJBException {
		
	}

	@Override
	public EJBHome getEJBHome() {
		return null;
	}

	@Override
	public Handle getHandle() {
		return null;
	}

	@Override
	public Object getPrimaryKey() {
		return null;
	}

	@Override
	public boolean isIdentical(EJBObject arg0) {
		return false;
	}

	@Override
	public void remove() throws RemoveException {
//		logger.debug(this.getClass().getName(), ".remove();");
	}

	protected void logExecution(String methodName) {
		if(methodName==null)return;
//		logger.debug("APIEJBMock Executed: '", methodName, "'");
	}
	protected void dumpObj(Object obj) {
		String name = obj!=null ? obj.getClass().getName() : "<null>";
//		logger.debug("APIEJBMock DUMP ", name, ": ", ObjectToStringConverter.objectToString(obj));
	}
	protected void dumpObj(Object[] obj) {
		String name = obj!=null ? obj.getClass().getName() : "<null>";
//		logger.debug("APIEJBMock DUMP ", name, "[]: ", ObjectToStringConverter.objectArrToString(obj));
	}
	
}
