import java.util.ArrayList;
import java.util.List;

public class InvalidTransactions {
    public List<String> invalidTransactions(String[] transactions) {
        List<String> invalid=new ArrayList<String>();

        for(int i=0; i<transactions.length; i++){
            String items1[] = transactions[i].split(",");
            String name1=items1[0];
            int time1=Integer.parseInt(items1[1]);
            int amount1=Integer.parseInt(items1[2]);
            String city1=items1[3];
            for(int j=i+1; j<transactions.length; j++){
                String items2[] = transactions[j].split(",");
                String name2=items2[0];
                int time2=Integer.parseInt(items2[1]);
                int amount2=Integer.parseInt(items2[2]);
                String city2=items2[3];
                if((Math.abs(time2-time1)<=60) && (name1.equals(name2)) && !(city1.equals(city2))){
                    if(!invalid.contains(transactions[i])){
                        invalid.add(transactions[i]);
                    }
                    if(!invalid.contains(transactions[j])){
                        invalid.add(transactions[j]);
                    }
                }

                if(amount1 > 1000){
                    if(!invalid.contains(transactions[i])){
                        invalid.add(transactions[i]);
                    }
                }

                if(amount2 > 1000){
                    if(!invalid.contains(transactions[j])){
                        invalid.add(transactions[j]);
                    }
                }
                if(transactions[i].equals(transactions[j])){
                    invalid.add(transactions[j]);
                }
            }
        }

        return invalid;
    }

    public static void main(String[] args) {
        InvalidTransactions obj=new InvalidTransactions();
        //String transactions[] = {"alice,20,800,mtv","alice,50,100,mtv","alice,51,100,frankfurt"};
        String transactions[] = {"alice,20,1220,mtv","alice,20,1220,mtv"};
        List<String> res = obj.invalidTransactions(transactions);
        for(String i: res){
            System.out.println(i);
        }
    }
}

