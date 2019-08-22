package com.nick.strickyheader;

/**
 * @author nick
 * @date 2019/8/22 0022
 * @Description
 */
public class GroupInfo {
    //组号
    private int mGroupID;
    // Header 的 title
    private String mTitle;
    //ItemView 在组内的位置
    private int position;
    // 组的成员个数
    private int mGroupLength;


    public GroupInfo(int groupId, String title) {
        this.mGroupID = groupId;
        this.mTitle = title;
    }

    public int getGroupID() {
        return mGroupID;
    }

    public void setGroupID(int groupID) {
        this.mGroupID = groupID;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    public boolean isFirstViewInGroup () {
        return position == 0;
    }

    /**
     * 是否是组内最后一个item
     * @return
     */
    public boolean isLastViewInGroup () {
        return position == mGroupLength - 1 && position >= 0;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setGroupLength(int groupLength) {
        this.mGroupLength = groupLength;
    }
}
