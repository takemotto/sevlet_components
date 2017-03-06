package mycomponents.servlet;

import org.springframework.beans.factory.annotation.Required;

/**
 * Created by owner on 2017/03/05.
 */
public abstract class SessionManager {

    private int currentSessionCount;

    private CustomSessionDao dao;

    @Required
    public void setCustomSessionDao(CustomSessionDao dao) {
        this.dao = dao;
    }

    public abstract CustomSession newCustomSession();

    abstract Object retrieveSessionObject(String id);

    public void reNewSessionId(CustomSession session) {
        // TODO
    }

}
