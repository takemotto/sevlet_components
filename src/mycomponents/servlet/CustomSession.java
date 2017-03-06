package mycomponents.servlet;

import java.util.Date;
import java.util.Map;

/**
 * Created by owner on 2017/03/05.
 */
public abstract class CustomSession {

    private String id;

    private Date creationDate;

    private Date lastAccessedDate;

    private boolean isNew;

    private Map<String, Object> attributeMap;

    private SessionManager manager;

    private Object sessionObject;

    private int interval;

    protected CustomSession(SessionManager manager) {
        this.manager = manager;
        construct();
    }

    protected abstract void invalidate();

    protected abstract void construct();

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    private Object getSessionObject() {
        if (sessionObject == null) {
            sessionObject = manager.retrieveSessionObject(id);
        }
        return sessionObject;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Date getLastAccessedDate() {
        return lastAccessedDate;
    }

    public String getId() {
        return id;
    }

    public void setAttribute(String key, Object obj) {
        attributeMap.put(key, obj);
    }

    public Object getAttribute(String key) {
        return attributeMap.get(key);
    }

    public Map<String, Object> getAttributeMap() {
        return attributeMap;
    }

    public void removeAttribute(String key) {
        attributeMap.remove(key);
    }

    public boolean isNew() {
        return isNew;
    }

}
