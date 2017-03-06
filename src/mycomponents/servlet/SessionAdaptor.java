package mycomponents.servlet;

import javax.naming.OperationNotSupportedException;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;
import java.util.Enumeration;

/**
 * Created by owner on 2017/03/05.
 */
public class SessionAdaptor implements HttpSession {

    private CustomSession session;

    public SessionAdaptor(CustomSession session) {
        this.session = session;
    }

    @Override
    public long getCreationTime() {
        return session.getCreationDate().getTime();
    }

    @Override
    public String getId() {
        return session.getId();
    }

    @Override
    public long getLastAccessedTime() {
        return session.getLastAccessedDate().getTime();
    }

    @Override
    @Deprecated
    public ServletContext getServletContext() {
        return null;
    }

    @Override
    public void setMaxInactiveInterval(int interval) {
        session.setInterval(interval);
    }

    @Override
    public int getMaxInactiveInterval() {
        return session.getInterval();
    }

    @Override
    @Deprecated
    public HttpSessionContext getSessionContext() {
        return null;
    }

    @Override
    public Object getAttribute(String name) {
        if (name == null) {
            return null;
        }
        return session.getAttribute(name);
    }

    @Override
    public Object getValue(String name) {
        if (name == null) {
            return null;
        }
        return session.getAttribute(name);
    }

    @Override
    @Deprecated
    public Enumeration<String> getAttributeNames() {
        return null;
    }

    @Override
    public String[] getValueNames() {
        return (String[]) session.getAttributeMap().keySet().toArray();
    }

    @Override
    public void setAttribute(String name, Object value) {
        session.setAttribute(name, value);
    }

    @Override
    public void putValue(String name, Object value) {
        session.setAttribute(name, value);
    }

    @Override
    public void removeAttribute(String name) {
        session.removeAttribute(name);
    }

    @Override
    public void removeValue(String name) {
        session.removeAttribute(name);
    }

    @Override
    public void invalidate() {
        session.invalidate();
    }

    @Override
    public boolean isNew() {
        return session.isNew();
    }
}
