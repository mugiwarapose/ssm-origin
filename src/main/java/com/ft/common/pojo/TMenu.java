package com.ft.common.pojo;

/**
 * Created by poseture on 2017/6/11.
 */
public class TMenu {

    private int menuId;

    private String menuName;

    private String url;

    private int parentId;

    private String remark;

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "TMenu{" +
                "menuId=" + menuId +
                ", menuName='" + menuName + '\'' +
                ", URL='" + url + '\'' +
                ", parentId=" + parentId +
                ", remark='" + remark + '\'' +
                '}';
    }
}
