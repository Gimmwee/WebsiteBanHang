
package entity;

public class Orders {
  
    private int ido;
    private String user;
    private String date;
    private double totalmoney;

    public Orders() {
    }

    public Orders(int ido, String user, String date, double totalmoney) {
        this.ido = ido;
        this.user = user;
        this.date = date;
        this.totalmoney = totalmoney;
    }

    public int getIdo() {
        return ido;
    }

    public void setIdo(int ido) {
        this.ido = ido;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getTotalmoney() {
        return totalmoney;
    }

    public void setTotalmoney(double totalmoney) {
        this.totalmoney = totalmoney;
    }

    @Override
    public String toString() {
        return "Orders{" + "ido=" + ido + ", user=" + user + ", date=" + date + ", totalmoney=" + totalmoney + '}';
    }

   
    
    
}
