package stage.spring.web.admin.product.dao;

import org.springframework.stereotype.Repository;
import stage.spring.web.admin.common.JDBCUtil;
import stage.spring.web.admin.product.vo.ProductImageVO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class ProductImageDAO
{
    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;


    public void insertProductImage(ProductImageVO productImageVO)
    {
        try
        {
            con = JDBCUtil.getConnection();
            pstmt = con.prepareStatement("INSERT INTO ");
            pstmt.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        finally
        {
            JDBCUtil.disConnect(pstmt, con);
        }
    }

}
