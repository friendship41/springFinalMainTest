package stage.spring.web.admin.common;

import java.sql.*;

public class JDBCUtil
{
    public static Connection getConnection()
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XEPDB1", "stage41", "qwe");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public static void disConnect(PreparedStatement pstmt, Connection con)
    {
        if(pstmt != null)
        {
            try
            {
                if(!pstmt.isClosed())
                {
                    pstmt.close();
                }
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }
            finally
            {
                pstmt = null;
            }
        }

        if(con != null)
        {
            try
            {
                if(!con.isClosed())
                {
                    con.close();
                }
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }
            finally
            {
                con = null;
            }
        }
    }



    public static void disConnect(ResultSet rs, PreparedStatement pstmt, Connection con)
    {
        if(rs != null)
        {
            try
            {
                if(!rs.isClosed())
                {
                    rs.close();
                }
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }
            finally
            {
                rs = null;
            }
        }

        if(pstmt != null)
        {
            try
            {
                if(!pstmt.isClosed())
                {
                    pstmt.close();
                }
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }
            finally
            {
                pstmt = null;
            }
        }

        if(con != null)
        {
            try
            {
                if(!con.isClosed())
                {
                    con.close();
                }
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }
            finally
            {
                con = null;
            }
        }
    }
}
