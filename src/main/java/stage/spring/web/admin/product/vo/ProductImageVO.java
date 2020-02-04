package stage.spring.web.admin.product.vo;

import org.springframework.web.multipart.MultipartFile;

public class ProductImageVO
{
    private int productImageTbNo;
    private int productImageTbProductNo;
    private String productImageTbImagePath;
    private String productImageTbImageName;
    private String productImageTbImageExtention;

    private MultipartFile uploadFile;

    public int getProductImageTbNo()
    {
        return productImageTbNo;
    }

    public void setProductImageTbNo(int productImageTbNo)
    {
        this.productImageTbNo = productImageTbNo;
    }

    public int getProductImageTbProductNo()
    {
        return productImageTbProductNo;
    }

    public void setProductImageTbProductNo(int productImageTbProductNo)
    {
        this.productImageTbProductNo = productImageTbProductNo;
    }

    public String getProductImageTbImagePath()
    {
        return productImageTbImagePath;
    }

    public void setProductImageTbImagePath(String productImageTbImagePath)
    {
        this.productImageTbImagePath = productImageTbImagePath;
    }

    public String getProductImageTbImageName()
    {
        return productImageTbImageName;
    }

    public void setProductImageTbImageName(String productImageTbImageName)
    {
        this.productImageTbImageName = productImageTbImageName;
    }

    public String getProductImageTbImageExtention()
    {
        return productImageTbImageExtention;
    }

    public void setProductImageTbImageExtention(String productImageTbImageExtention)
    {
        this.productImageTbImageExtention = productImageTbImageExtention;
    }

    public MultipartFile getUploadFile()
    {
        return uploadFile;
    }

    public void setUploadFile(MultipartFile uploadFile)
    {
        this.uploadFile = uploadFile;
    }
}
