package mycomponents.servlet;

import java.io.Closeable;

/**
 * Created by owner on 2017/03/05.
 */
public interface CustomSessionDao extends Closeable{

    void getSessionObject(String id);

    void removeSessionObject(String id);

    void reNewId(String oldId, String newId);

}
