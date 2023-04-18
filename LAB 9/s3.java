class account_details {
    public String name;
    public int ActNo;
    public double Amount;
}

class account extends account_details {
    account(String n, int Act, double Amt) {
        name = n;
        ActNo = Act;
        Amount = Amt;
    }

    account() {
    }
}

class Interest extends account {
    double r;
    double n;

    Interest(double Amount, double r, double n) {
        this.Amount = Amount;
        this.r = r;
        this.n = n;
    }

    public void interest() {
        System.out.println("interest is: " + ((Amount * r * n) / 100));
    }
}

public class s3 {
    public static void main(String[] args) {
        account c = new account("desakc", 153, 153);
        Interest i = new Interest(1354351, 12, 5);
        i.interest();
    }
}
