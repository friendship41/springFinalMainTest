package stage.spring.web.admin.product.vo;

import java.sql.Date;

public class ProductVO
{
    private int productTbNo;
    private int productTbCategoryNo;
    private String productTbProductName;
    private Date productTbProductRegisterDate;
    private String productTbProductDetail;

    public int getProductTbNo()
    {
        return productTbNo;
    }

    public void setProductTbNo(int productTbNo)
    {
        this.productTbNo = productTbNo;
    }

    public int getProductTbCategoryNo()
    {
        return productTbCategoryNo;
    }

    public void setProductTbCategoryNo(int productTbCategoryNo)
    {
        this.productTbCategoryNo = productTbCategoryNo;
    }

    public String getProductTbProductName()
    {
        return productTbProductName;
    }

    public void setProductTbProductName(String productTbProductName)
    {
        this.productTbProductName = productTbProductName;
    }

    public Date getProductTbProductRegisterDate()
    {
        return productTbProductRegisterDate;
    }

    public void setProductTbProductRegisterDate(Date productTbProductRegisterDate)
    {
        this.productTbProductRegisterDate = productTbProductRegisterDate;
    }

    public String getProductTbProductDetail()
    {
        return productTbProductDetail;
    }

    public void setProductTbProductDetail(String productTbProductDetail)
    {
        this.productTbProductDetail = productTbProductDetail;
    }
}
