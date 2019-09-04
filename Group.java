package Group;

import java.util.ArrayList;

import Member.Member;

public class Group
{
    private String mGroupName;
    private ArrayList<Member> mGroupMembers = new ArrayList<Member>();

    public Group(String gname, ArrayList<Member> groupMembers)
    {
        mGroupName = gname;
        mGroupMembers = groupMembers;
    }
    public ArrayList<Member> getMembers()
    {
        return mGroupMembers;
    }

}
