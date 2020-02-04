package stage.spring.web.admin.product.vo;

public class CategoryVO
{
    private int categoryTbNo;
    private String categoryTbTopName;
    private String categoryTbBottomName;

    public int getCategoryTbNo()
    {
        return categoryTbNo;
    }

    public void setCategoryTbNo(int categoryTbNo)
    {
        this.categoryTbNo = categoryTbNo;
    }

    public String getCategoryTbTopName()
    {
        return categoryTbTopName;
    }

    public void setCategoryTbTopName(String categoryTbTopName)
    {
        this.categoryTbTopName = categoryTbTopName;
    }

    public String getCategoryTbBottomName()
    {
        return categoryTbBottomName;
    }

    public void setCategoryTbBottomName(String categoryTbBottomName)
    {
        this.categoryTbBottomName = categoryTbBottomName;
    }
}
