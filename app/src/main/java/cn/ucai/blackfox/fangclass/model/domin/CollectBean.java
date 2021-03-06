package cn.ucai.blackfox.fangclass.model.domin;

/**
 * Created by Administrator on 2017/3/13 0013.
 */

public class CollectBean {

    /**
     * id : 3334
     * userName : 张大鹏
     * goodsId : 7676
     * goodsName : 学生餐具餐盒便当盒饭盒
     * goodsEnglishName : Monbento
     * goodsThumb : 201509/thumb_img/7676_thumb_G_1442390596247.png
     * goodsImg : 201509/thumb_img/7676_thumb_G_1442390596247.png
     * addTime : 1476766404598
     */

    private int id;
    private String userName;
    private int goodsId;
    private String goodsName;
    private String goodsEnglishName;
    private String goodsThumb;
    private String goodsImg;
    private long addTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsEnglishName() {
        return goodsEnglishName;
    }

    public void setGoodsEnglishName(String goodsEnglishName) {
        this.goodsEnglishName = goodsEnglishName;
    }

    public String getGoodsThumb() {
        return goodsThumb;
    }

    public void setGoodsThumb(String goodsThumb) {
        this.goodsThumb = goodsThumb;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg;
    }

    public long getAddTime() {
        return addTime;
    }

    public void setAddTime(long addTime) {
        this.addTime = addTime;
    }

    @Override
    public String toString() {
        return "CollectBean{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", goodsId=" + goodsId +
                ", goodsName='" + goodsName + '\'' +
                ", goodsEnglishName='" + goodsEnglishName + '\'' +
                ", goodsThumb='" + goodsThumb + '\'' +
                ", goodsImg='" + goodsImg + '\'' +
                ", addTime=" + addTime +
                '}';
    }
}
