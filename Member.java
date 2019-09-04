package Member;

import java.util.ArrayList;

import Group.Group;

public class Member
{
    private String UserName;
    private String UserId;
    private double mMoney;
    private double mOwned;
    private double mYouOwn;
    public Member(String username, String userId)
    {
        UserName = username;
        UserId = userId;
    }

    public double getTotalAmount()
    {
        mMoney = mYouOwn - mOwned;
        return mMoney;
    }

    public void setYouOwn(double money)
    {
        mYouOwn += money;
    }

    public void setOwned(double money)
    {
        mOwned += money;
    }

    public void createGroup(String groupName, ArrayList<Member> withMembers)
    {
        withMembers.add(new Member(UserName, UserId));
        Group group = new Group(groupName, withMembers);
    }
}
