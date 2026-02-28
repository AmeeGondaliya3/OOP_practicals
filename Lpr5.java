import java.util.*;
class bankaccount{
    String bankaccountId;
    String accountHolderName;
    double balance;
    void assignvalues(String id,String name,double bal){
        bankaccountId=id;
        accountHolderName=name;
        balance=bal;
    }
    void displayvalue()
    {
        System.out.println(bankaccountId+""+accountHolderName+""+balance);
    }
}
public class pr2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        bankaccount[] accounts=new bankaccount[5];
        for(int i=0;i<5;i++){
            accounts[i]=new bankaccount();
        }
        accounts[0].assignvalues("101","riya",30000);
        accounts[1].assignvalues("102","piya",40000);
        accounts[2].assignvalues("103","niya",45000);
        accounts[3].assignvalues("104","tiya",35000);
        accounts[4].assignvalues("105","jiya",50000);

        System.out.println("account details");
        for(int i=0;i<5;i++){
            accounts[i].displayvalue();
        }
        System.out.println("enter account id to search");
        String id=sc.next();
        int flag=0;
        for(int i=0;i<5;i++){
            if(accounts[i].bankaccountId.equals(id))
            {
                System.out.println("account found");
                accounts[i].displayvalue();
                flag=1;
                break;
            }
        }
     if(flag==0){
         System.out.println("account not found");
     }
    }
}


//output
ccount details
101riya30000.0
102piya40000.0
103niya45000.0
104tiya35000.0
105jiya50000.0
enter account id to search

103
account found
103niya45000.0
