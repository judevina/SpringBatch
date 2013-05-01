package com.batch.fromdb;

import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Component;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * User: TikuNibi
 * Date: 1/5/13
 * Time: 2:24 PM
 * To change this template use File | Settings | File Templates.
 */

@Component("passStatementSetter")
public class PassStatementSetter implements PreparedStatementSetter {
    /**
     * this method is used to pass the parameters to the sql query specified in the reader step.
     * @param preparedStatement
     * @throws SQLException
     */
    public void setValues(PreparedStatement preparedStatement) throws SQLException {
        //To change body of implemented methods use File | Settings | File Templates.
        preparedStatement.setString(1, "Person1");
    }
}
