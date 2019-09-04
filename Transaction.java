package Transactions;

import java.util.ArrayList;
import Group.Group;
import Member.Member;

public class Transaction
{
      private String mTran_type;
      ArrayList<Member> mMembers = new ArrayList<Member>();
      private Double mAmount;
      private Member mPayee;
      private Member mRecorder;
      private Group mGroup;
      public Transaction(ArrayList<Member> members, double amount, Member payee, Member recorder, String transactionType)
      {
          this.mMembers = members;
          this.mAmount = amount;
          this.mPayee = payee;
          this.mRecorder = recorder;
          this.mTran_type = transactionType;
      }
      
      public Transaction(Group group, double amount, Member payee, Member recorder, String transactionType)
      {
          this.mGroup = group;
          this.mAmount = amount;
          this.mPayee = payee;
          this.mRecorder = recorder;
          this.mTran_type = transactionType;
      }
      
      public void performTransaction(String transactionType)
      {
          if(transactionType.equalsIgnoreCase("Group"))
          {
              ArrayList<Member> groupMembers = mGroup.getMembers();
              int size = groupMembers.size();
              for(Member member : groupMembers)
              {
                  if (mPayee == member)
                  {
                      member.setOwned(mAmount);
                  }
                  else
                  {
                      member.setYouOwn(mAmount/size);
                  }
              }
          }
          else if(transactionType.equalsIgnoreCase("OutsideGroup"))
          {
              int size = mMembers.size();
              for(Member member : mMembers)
              {
                  if (mPayee == member)
                  {
                      member.setOwned(mAmount);
                  }
                  else
                  {
                      member.setYouOwn(mAmount/size);
                  }
              }
          }
          
      }
}
